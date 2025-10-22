package com.nt.java;

import java.util.*;
import java.util.stream.*;

//java code in streams to find the list of top 3 tasks which takes most time to complete

class EmployeeZ {
    String name;
    List<Project> projects;
    EmployeeZ(String name, List<Project> projects) {
        this.name = name;
        this.projects = projects;
    }
}

class Project {
    String title;
    List<Task> tasks;
    Project(String title, List<Task> tasks) {
        this.title = title;
        this.tasks = tasks;
    }
}

class Task {
    String description;
    int hours;
    Task(String description, int hours) {
        this.description = description;
        this.hours = hours;
    }
    @Override
    public String toString() {
        return description + " (" + hours + " hrs)";
    }
}

public class LogicalCodeTest07_Emp_Time_Prob {
    public static void main(String[] args) {
        // Create tasks
        Task t1 = new Task("t1", 10);
        Task t2 = new Task("t2", 5);
        Task t3 = new Task("t3", 30);
        Task t4 = new Task("t4", 1);
        Task t5 = new Task("t5", 50);
        Task t6 = new Task("t6", 3);
        Task t7 = new Task("t7", 10);
        Task t8 = new Task("t8", 15);
        Task t9 = new Task("t9", 13);

        // Projects
        Project p1 = new Project("P1", Arrays.asList(t1, t2, t3));
        Project p2 = new Project("P2", Arrays.asList(t4, t5, t6));
        Project p3 = new Project("P3", Arrays.asList(t7, t8, t9));

        // Employees
        EmployeeZ e1 = new EmployeeZ("E1", Arrays.asList(p1, p2));
        EmployeeZ e2 = new EmployeeZ("E2", Arrays.asList(p3));

        List<EmployeeZ> employees = Arrays.asList(e1, e2);

        // Find top 3 tasks
        List<Task> top3Tasks = employees.stream()
                .flatMap(emp -> emp.projects.stream())   // Employee → Projects
                .flatMap(proj -> proj.tasks.stream())    // Project → Tasks
                .sorted((a, b) -> Integer.compare(b.hours, a.hours)) // sort desc by hours
                .limit(3)                                // take top 3
                .collect(Collectors.toList());

        System.out.println("Top 3 Tasks:");
        top3Tasks.forEach(System.out::println);
    }
}

