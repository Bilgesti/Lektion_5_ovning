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


        int x = scan.nextInt();

        boolean isPlaying = true;

        for (int i = 0; i < x; i++){
            System.out.println(i);

        }

        do{
            // Om användaren matar in “stop” så avslutas
            //do while loopen!
            System.out.println("Type " + ("STOP!") + " to exit. " );
            String input = scan.next();

            if (input.equals("STOP!") ){

            isPlaying = false;}

        }while(isPlaying);

        }






    }

