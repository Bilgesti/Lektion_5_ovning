package com.bilgee.scanner;


public class demo {
    public static void scanner(){
    // Creates a Scanner object to user input
    java.util.Scanner scan = new java.util.Scanner(System.in);
    // Ask for the players name
        System.out.println("Please Enter your name:");

    String playerName = scan.nextLine();

        System.out.println("Player #1: " + playerName);


    int x = scan.nextInt();

    boolean isPlaying = true;

        for (int i = 0; i < x; i++){
        System.out.println(i);

    }

        do {
        System.out.println("Type " + ("stop") + " to exit.");
        System.out.println("Type " + ("1") + " to throw.");

        String input = scan.next();
        //Skapa en ‘switch’
        switch (input.toLowerCase()) {

            case "stop":
                isPlaying = false;
                break;

            case "1":
                System.out.println("Throwing!");
                break;

            default:
                System.out.println("Wrong input");
        }

    }while(isPlaying);

}
}
