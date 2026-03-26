package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

import java.util.Scanner;

import java.util.Scanner;

import java.util.Scanner;

import java.util.Scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter names (separated by spaces) or press Enter for default: ");
        String input = scanner.nextLine().trim();

        if (input.isEmpty()) {
            System.out.println("Hello, World!");
        } else {
            // Split the input into an array of names
            String[] names = input.split("\\s+");

            // String.join takes a delimiter and an array/list
            // It puts ", " BETWEEN names, so no trailing comma to remove!
            String joinedNames = String.join(", ", names);

            System.out.println("Hello, " + joinedNames + "!");
        }

        scanner.close();
    }
}