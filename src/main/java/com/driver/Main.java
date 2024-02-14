// Main.java
package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly();

        // Task 4: Trying to access private member directly
        // Error: Compilation error - private member cannot be accessed directly
        // System.out.println(obj.name);

        // Task 6: Using setter and getter
        obj.setName("John");
        System.out.println(obj.getName()); // Output: John
    }
}
