package com.pluralsight.rollout;

import Multiplayer.MultiplayerUserInterface;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Screens titleScreen = new Screens();
        MultiplayerUserInterface screen = new MultiplayerUserInterface();

        titleScreen.titleScreen();
        screen.multiplayer();









        // Create Decepticons array list
        ArrayList<Decepticons> decepticons = new ArrayList<>();
        decepticons.add(new Decepticons("Megatron", "Tank"));
        decepticons.add(new Decepticons("Shockwave", "Tank"));
        decepticons.add(new Decepticons("Soundwave", "Suv"));
        decepticons.add(new Decepticons("Starscream", "Jet"));
        decepticons.add(new Decepticons("Breakdown", "Sports car"));
        decepticons.add(new Decepticons("Thundercracker", "Jet"));
        decepticons.add(new Decepticons("Skywarp", "Jet"));
        decepticons.add(new Decepticons("Kickback", "Insect"));
        decepticons.add(new Decepticons("Rumble", "Bird"));
        decepticons.add(new Decepticons("Vortex", "Jet"));
        decepticons.add(new Decepticons("Trypticon", "Starship"));
        decepticons.add(new Decepticons("Barricade", "Cop car"));
        decepticons.add(new Decepticons("Blastoff", "Jet"));
        decepticons.add(new Decepticons("Aracnee", "Helicopter"));
        decepticons.add(new Decepticons("Unicron", "Planet"));

        // Print Decepticons
        System.out.println("\nDecepticons:");
        for (Decepticons con : decepticons) {
            System.out.println(con);
        }

        // Create Autobots array
        Autobots[] autobotsArray = new Autobots[15];
        autobotsArray[0] = new Autobots("Optimus Prime", "Truck");
        autobotsArray[1] = new Autobots("Bumblebee", "Camaro");
        autobotsArray[2] = new Autobots("Jazz", "Porsche");
        autobotsArray[3] = new Autobots("Sideswipe", "Corvette");
        autobotsArray[4] = new Autobots("Ironhide", "Truck");
        autobotsArray[5] = new Autobots("Hot Rod", "Lamborghini");
        autobotsArray[6] = new Autobots("Ratchet", "Ambulance");
        autobotsArray[7] = new Autobots("Air Raid", "Jet");
        autobotsArray[8] = new Autobots("Warpath", "Tank");
        autobotsArray[9] = new Autobots("Crosshairs", "Corvette");
        autobotsArray[10] = new Autobots("Wheeljack", "Van");
        autobotsArray[11] = new Autobots("Cliffjumper", "Jeep");
        autobotsArray[12] = new Autobots("Mirage", "Formula 1 Car");
        autobotsArray[13] = new Autobots("Grimlock", "Dinosaur");
        autobotsArray[14] = new Autobots("Perceptor", "Microscope");

        // Print Autobots
        System.out.println("\nAutobots:");
        for (Autobots bot : autobotsArray) {
            System.out.println(bot);
        }
        System.out.println();

        // Create Character array with voice lines
        Character[] characters = {
                new Character("Optimus Prime", "Autobots, roll out!"),
                new Character("Bumblebee", "Bee-tastic!"),
                new Character("Jazz", "Let’s roll!"),
                new Character("Sideswipe", "Damn im good!"),
                new Character("Ironhide", "Decepticon punk!"),
                new Character("Hot Rod", "I’m on fire!"),
                new Character("Ratchet", "Time to fix things up!"),
                new Character("Air Raid", "Let’s take to the skies!"),
                new Character("Warpath", "They don't call me warpath because im gentle ha-ha-ha!"),
                new Character("Crosshairs", "What's in it for me!"),
                new Character("Wheeljack", "Let’s get creative!"),
                new Character("Cliffjumper", "I’m ready to roll!"),
                new Character("Mirage", "I’ll be invisible!"),
                new Character("Grimlock", "Everything feels different!"),
                new Character("Perceptor", "Science is key!"),
                new Character("Megatron", "I am the destroyer, I am the gladitor, I am Megatron!"),
                new Character("Shockwave", "I’ll make you see reason!"),
                new Character("Soundwave", "Soundwave superior Autobots inferior!"),
                new Character("Starscream", "I’ll lead the Decepticons!"),
                new Character("Breakdown", "Time to break things!"),
                new Character("Thundercracker", "Time for a thunderstorm!"),
                new Character("Skywarp", "I’ll warp you away!"),
                new Character("Kickback", "Time to swarm!"),
                new Character("Rumble", "Get ready to crumble before Rumble!"),
                new Character("Vortex", "I’m spinning into action!"),
                new Character("Trypticon", "Trypticon crush!"),
                new Character("Barricade", "I’m on the case!"),
                new Character("Blastoff", "I’m ready for lift-off!"),
                new Character("Aracnee", "I’m watching you!"),
                new Character("Unicron", "I am your doom!")
        };

        // Prompt user to choose a character
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Choose Your Character!!!");

        for (int i = 0; i < characters.length; i++) {
            System.out.println((i + 1) + ". " + characters[i].getName());
        }

        System.out.println("\nEnter the number of your choice player 2 ");

        // Read user input
        int choice = myScanner.nextInt();
        myScanner.nextLine();

        // Check if the choice is correct
        if (choice > 0 && choice <= characters.length) {
            Character selectedCharacter = characters[choice - 1];
            System.out.println("You chose: " + selectedCharacter.getName());
            System.out.println("Voice Line: " + selectedCharacter.getVoiceLine());
        } else {
            System.out.println("Invalid choice. Please choose a number between 1 and " + characters.length + ".");
        }
        System.out.println("\nEnter number of your choice player 2");

        int choice2 = myScanner.nextInt();

        if (choice2 > 0 && choice2 <= characters.length) {
            Character selectedCharacter = characters[choice2 - 1];
            System.out.println("You chose: " + selectedCharacter.getName());
            System.out.println("Voice Line: " + selectedCharacter.getVoiceLine());
        } else {
            System.out.println("Invalid choice. Please choose a number between 1 and " + characters.length + ".");
        }

    }
}











