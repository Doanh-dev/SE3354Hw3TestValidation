package org.example;

public class Main {
    public static void main(String[] args) {
        Average avg = new Average();
        int average = avg.average(3, new int[]{1, 2, 3, 4, 5});
        System.out.println("Average: " + average); // Expected: 2
    }
}
