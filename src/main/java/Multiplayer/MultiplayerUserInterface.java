package Multiplayer;

import com.pluralsight.rollout.HeavyClass;
import com.pluralsight.rollout.LightClass;
import com.pluralsight.rollout.MediumClass;

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
                    5) Return to title screen
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
                case "5":
                    System.out.println("Returning to title screen");
                    userGameModeChoice = false;
                default:
                    System.out.println("Sorry please enter one of the following options ");
            }
        }
    }

    public void loadOuts() {
        boolean exit = false;
        while (!exit){
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
                    saveLoadOut();
                    break;
                case "8":
                    System.out.println("Returning to multiplayer");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid response please chose a number between 1 and 8");
            }
        }
    }

    private void chooseAClass() {
        boolean goBck = false;
        CharacterClassType playerClass = null;

        while (!goBck){
            System.out.println("""
                1. Light
                2. Medium
                3. Heavy
                4. Go Back
                
                """);
            String choice = s.nextLine();

            switch (choice) {
                case "1" -> playerClass = new LightClass(250.00, 8.00, 25.00);

                case "2" -> playerClass = new MediumClass(350.00, 5.00, 50.00);

                case "3" -> playerClass = new HeavyClass(475.00, 2.00, 100.00);

                case "4" -> goBck = true;

                default -> System.out.println("Invalid response please choose a number between 1 and 4.");
            }
            if (playerClass != null) {
                System.out.println("class info");
                System.out.println("Health:" + playerClass.getHealth());
                System.out.println("Speed:" + playerClass.getSpeed());
                System.out.println("Damage:" + playerClass.getDamage());
            }
        }
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

    private void saveLoadOut() {
    }
}
