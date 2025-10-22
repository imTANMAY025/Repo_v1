package com.nt.java;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class Test1 {
    public static void main(String[] args) {
        final List<String> l = new LinkedList<>();

        l.add("A");
        l.add("B");
        l.add("C");

        l.stream().forEach(e -> {
            l.add("Z");
            System.out.println(e);
        });
    }
}
