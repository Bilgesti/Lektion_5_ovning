package com.bilgee.scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Creates a Scanner object to user input
        Scanner scan = new Scanner(System.in);
        // Ask for the players name
        System.out.println("Please Enter your name:");

        String playerName = scan.nextLine();
        System.out.println("Player #1:" + playerName);

    }
}
