package com.aurea.jervistest;

public class Program {
    public static void main(String[] args) {
        System.out.println(getGreeting("world"));
    }

    public static String getGreeting(String name) {
        return "Hello, " + name + "!";
    }
}
