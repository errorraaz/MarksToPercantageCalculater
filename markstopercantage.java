package com.company;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to CBSC Borad Exam marks to percantage calculater"); // Title of the program
        Scanner s = new Scanner(System.in); // Defining the scanner for user input
        
        System.out.println("Enter Maths number"); // input hint for user
        int a = s.nextInt(); // User input first value
        System.out.println("Enter English number"); // input hint for user
        int b = s.nextInt(); // User input first value
        System.out.println("Enter Hindi number"); // input hint for user
        int c = s.nextInt(); // User input first value
        System.out.println("Enter Science number"); // input hint for user
        int d = s.nextInt(); // User input first value
        System.out.println("Enter Social science number"); // input hint for user
        int e = s.nextInt(); // User input first value

        // Calculating the value of all students and program give it to percentage of student using our students marks
        float studentMarks = a + b +c + d + e ; // Totals the all marks of the student
        float result = (studentMarks * 100) / 500; // Formula of percentage calculation
        System.out.println("Yeh boi your percantage is " + result ); // Printing the result of the input
    }
}
