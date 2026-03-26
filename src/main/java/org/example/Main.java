package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

import java.util.Scanner;

import java.util.Scanner;

import java.util.Scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter names: ");
        String input = sc.nextLine();

        // If no input
        if (input.isEmpty()) {
            System.out.println("Hello, World!");
        } else {
            String[] names = input.split(" ");

            System.out.print("Hello, ");

            // Enhanced for loop
            for (String name : names) {
                System.out.print(name + " ");
            }

            System.out.println("!");
        }

        sc.close();
    }
}