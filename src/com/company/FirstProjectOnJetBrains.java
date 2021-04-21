package com.company;

import java.util.Scanner;

public class FirstProjectOnJetBrains {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        greet("Aid", "2018"); // change it as you need
        remindName();
        guessAge();
        count();
        test();
        end();
    }

    static void greet(String assistantName, String birthYear) {
        System.out.format("Hello! My name is %s.\nI was created in %S\nPlease, remind me your name.\n",
                assistantName,
                birthYear);
    }

    static void remindName() {
        String name = scanner.nextLine();
        System.out.println("What a great name you have, " + name + "!");
    }

    static void guessAge() {
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        int rem3 = scanner.nextInt();
        int rem5 = scanner.nextInt();
        int rem7 = scanner.nextInt();
        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        System.out.format("Your age is %s, that's a good time to start programming!\n", age);
    }

    static void count() {
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int num = scanner.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.printf("%d!\n", i);
        }
    }

    static void test() {
        System.out.println("Let's test your programming knowledge.");
        System.out.println("Variables declared in the initialization statement are visible ...?");
        System.out.println("1. In the current method");
        System.out.println("2. In the current class");
        System.out.println("3. In all parts of the cycle");
        System.out.println("4. There is no correct answer");
        Boolean check;
        do {
            System.out.println("\nEnter the correct answer");
            int answer = scanner.nextInt();
            check = answer > 0 && answer <= 4 && answer == 3 ? true : false;
            if (!check) {
                System.out.println("Please, try again.");
            }
        } while (check != true);
    }

    static void end() {
        System.out.println("Congratulations, have a nice day!"); // Do not change this text
    }
}
