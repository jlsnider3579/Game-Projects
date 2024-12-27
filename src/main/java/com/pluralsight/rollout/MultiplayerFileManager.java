package com.pluralsight.rollout;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MultiplayerFileManager {
    public void saveLoadout() {
        try {
            FileReader fr = new FileReader("src/main/resources/Multiplayer.csv");
            BufferedReader br = new BufferedReader(fr);

            String s;
            while ((s = br.readLine()) != null);
            System.out.println(s);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
