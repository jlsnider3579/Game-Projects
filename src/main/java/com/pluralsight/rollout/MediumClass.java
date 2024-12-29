package com.pluralsight.rollout;

import Multiplayer.CharacterClassType;

public class MediumClass extends CharacterClassType {

    public MediumClass(double health, double speed, double damage) {
        super(health, speed, damage);

        this.health = 350;
        this.speed = 5.00;
        this.damage = 50.00;
    }
}
