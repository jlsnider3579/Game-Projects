package Multiplayer;

import java.util.Scanner;

public class MultiplayerUserInterface {
    Scanner s = new Scanner(System.in);

    public void multiplayer() {
        boolean userGameModeChoice = true;
        while (userGameModeChoice) {
            System.out.println("""
                    1) Team Deathmatch
                    2) Capture the Flag
                    3) Free for all
                    4) Loadouts
                    """);

            String choice = s.nextLine();
            switch (choice) {
                case "1":
                    // return method for team deathmatch
                    break;
                case "2":
                    // return method for capture the flag
                    break;
                case "3":
                    // return method for capture the flag
                    break;
                case "4":
                    // return method for load outs
                    loadOuts();
                    break;
                default:
                    System.out.println("Sorry please enter one of the following options ");
            }
        }
    }

    public void loadOuts() {
        System.out.println("""
                1. Choose a class
                2. Choose a primary weapon
                3. Choose a secondary weapon
                4. choose a melee weapon
                5. Choose a lethal
                6. Choose an ability
                7. Save loadout
                8. exit
                
                """);
        String choice = s.nextLine();

        switch (choice) {
            case "1":
                chooseAClass();
                break;
            case "2":
                chooseAPrimaryWeapon();
                break;
            case "3":
                chooseASecondaryWeapon();
                break;
            case "4":
                chooseAMeleeWeapon();
                break;
            case "5":
                chooseALethal();
                break;
            case "6":
                chooseAnAbility();
                break;
            case "7":
               saveLoadout();
               break;
            case "8":
                System.out.println("Returning to multiplayer");
            default:
                System.out.println("Invalid response please chose a number between 1 and 8");
        }

    }

    private void chooseAClass() {
        System.out.println("""
                1. Light
                2. Medium
                3. Heavy
               
                """);
        String choice = s.nextLine();
    }

    private void chooseAPrimaryWeapon() {
    }

    private void chooseASecondaryWeapon() {
    }

    private void chooseAMeleeWeapon() {
    }

    private void chooseALethal() {
    }

    private void chooseAnAbility() {
    }

    private void saveLoadout() {
    }
}
