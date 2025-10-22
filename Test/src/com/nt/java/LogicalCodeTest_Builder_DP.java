package com.nt.java;

//Product
class Computer {
 private String CPU;
 private String RAM;
 private String storage;

 // Private constructor to force use of Builder
 private Computer(Builder builder) {
     this.CPU = builder.CPU;
     this.RAM = builder.RAM;
     this.storage = builder.storage;
 }

 @Override
 public String toString() {
     return "Computer [CPU=" + CPU + ", RAM=" + RAM + ", Storage=" + storage + "]";
 }

 // Builder
 public static class Builder {
     private String CPU;
     private String RAM;
     private String storage;

     public Builder setCPU(String CPU) {
         this.CPU = CPU;
         return this;
     }

     public Builder setRAM(String RAM) {
         this.RAM = RAM;
         return this;
     }

     public Builder setStorage(String storage) {
         this.storage = storage;
         return this;
     }

     public Computer build() {
         return new Computer(this);
     }
 }
}

//Client
public class LogicalCodeTest_Builder_DP {
 public static void main(String[] args) {
     Computer gamingPC = new Computer.Builder()
                             .setCPU("Intel i9")
                             .setRAM("32GB")
                             .setStorage("1TB SSD")
                             .build();

     Computer officePC = new Computer.Builder()
                             .setCPU("Intel i5")
                             .setRAM("16GB")
                             .setStorage("512GB SSD")
                             .build();

     System.out.println(gamingPC);
     System.out.println(officePC);
 }
}
