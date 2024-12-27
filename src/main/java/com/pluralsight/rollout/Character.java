package com.pluralsight.rollout;

public class Character {
    private String name;
    private String VoiceLine;

    public Character(String name, String voiceLine) {
        this.name = name;
        VoiceLine = voiceLine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVoiceLine() {
        return VoiceLine;
    }

    public void setVoiceLine(String voiceLine) {
        VoiceLine = voiceLine;
    }
}

