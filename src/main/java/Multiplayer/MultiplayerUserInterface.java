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
                4. Choose a lethal
                5. Choose an ability
                6. Save loadout
                7. exit
                
                """);

    }

    public void createLoadOut() {
        chooseAClass();
        chooseAPrimaryWeapon();
        chooseASecondaryWeapon();
        chooseAMeleeWeapon();
        chooseALethal();
        chooseAnAbility();

        LoadOuts loadOuts = new LoadOuts("", "", "", "", "", "");
        SaveLoadOut();
    }

    private void chooseAMeleeWeapon() {
    }

    private void chooseAClass() {
    }

    private void chooseAPrimaryWeapon() {
    }

    private void chooseASecondaryWeapon() {
    }

    private void chooseALethal() {
    }

    private void chooseAnAbility() {
    }

    private void SaveLoadOut() {
    }
}
