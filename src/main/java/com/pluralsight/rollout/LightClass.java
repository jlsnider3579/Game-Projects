package com.pluralsight.rollout;

import Multiplayer.CharacterClassType;

public class LightClass extends CharacterClassType {
    public LightClass(double health, double speed, double damage) {
        super(health, speed, damage);

        this.health = 250.00;
        this.speed = 8.00;
        this.damage = 25.00;
    }
}
