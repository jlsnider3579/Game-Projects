package com.pluralsight.rollout;

import Multiplayer.MultiplayerUserInterface;

import java.util.Scanner;


public class Screens {
    Scanner scanner = new Scanner(System.in);
    MultiplayerUserInterface multiplayerUserInterface = new MultiplayerUserInterface();


    public void titleScreen() {
        boolean uInput = true;

        while (uInput) {
            System.out.println("""
                    \n===================== Transformers Shadow of the Matrix =====================
                    
                    
                    
                    (S) to start
                    (E) to exit...
                    
                    """);

            String choice = scanner.nextLine().toUpperCase();

            switch (choice) {
                case "S":
                    System.out.println(" Loading Game... ");
                    // Call the home screen method
                    mainMenu();
                    break;
                case "E":
                    System.out.println(" Closing game... ");
                    uInput = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please press (S) to start or (E) to exit.");
                    break;
            }
        }
    }

    public void mainMenu() {
        boolean uInput = true;
        while (uInput) {
            System.out.println("""
                    \n
                    Welcome Cybertronian!!!
                    
                    (S) Campaign
                    (M) Multiplayer
                    (D) Dark Energon
                    (E) Escalation
                    (C) Credits
                    (0) Settings
                    (H) Title screen
                    """);
            String choice = scanner.nextLine().toUpperCase();

            switch (choice) {
                case "S":
                    System.out.println("===================== Campaign ==================== ");
                    campaign(); //Method for campaign
                    break;
                case "M":
                    System.out.println("===================== Multiplayer =====================");
                    multiplayerUserInterface.multiplayer();
                    break;
                case "D":
                    System.out.println("===================== Dark Energon =====================");
                    break;
                case "E":
                    System.out.println("===================== Escalation =====================");
                    break;
                case "C":
                    System.out.println("===================== Credits =====================");
                    break;
                case "O":
                    System.out.println("===================== Settings =====================");
                    break;
                case "H":
                    System.out.println(" returning to title screen... ");
                    uInput = false;
                    break;
                default:
                    System.out.println(" Invalid choice please try again ");
                    break;
            }
        }
    }

    // Method for campaign screen
    public void campaign() {
        //Transformers myPlayer;
        boolean uInput = true;
        while (uInput) {

            System.out.println("""
                    
                    \nChoose a side
                    
                    (A) Autobots
                    (D) Decepticons
                    (H) main menu
                    """);
            String choice = scanner.nextLine().toUpperCase();

            switch (choice) {
                case "A":
                    System.out.println("Til all are one ");
                    //Method for Autobots choice
                    autoBot();
                    // myPlayer = new Autobots("Optimus ptime", "Truck");
                    // System.out.println(myPlayer);
                    break;
                case "D":
                    System.out.println("The Decepticons will bring this world to order!!! ");
                    //Method for Decepticons choice
                    break;
                case "H":
                    System.out.println("Returning to main menu ");
                    uInput = false;
                    break;
                default:
                    System.out.println("Invalid option please try again ");
                    break;
            }
        }
    }

    public void autoBot() {
        boolean uInput = true;
        System.out.println("Choose an Autobot ");


        while (uInput) {
            System.out.println("""
                    (O) Optimus prime
                    (B) Bumblebee
                    (J) Jazz
                    (R) Ratchet
                    (I) Ironhide
                    """);
            String choice = scanner.nextLine().toUpperCase();

            switch (choice) {
                case "O":
                    System.out.println("I am optimus prime leader of the Autobots ");
                    break;
                case "B":
                    System.out.println("Zrrr-zzzzzzt-wooop-wooop-krrrrr-tzzzzrrr-bop-bip-boooooooop-weeeeooo! ");
                    break;
                case "J":
                    System.out.println("Stay smooth");
                    break;
                case "R":
                    System.out.println("I'm a medic not a miracle worker");
                    break;
                case "I":
                    System.out.println("Punk ass decepticons!!! ");
                    break;
                default:
                    System.out.println("Invalid Response");
            }
        }
    }
}



