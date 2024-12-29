package com.pluralsight.rollout;

import Multiplayer.CharacterClassType;

public class HeavyClass extends CharacterClassType {

    public HeavyClass(double health, double speed, double damage) {
        super(health, speed, damage);

        this.health = 475.00;
        this.speed = 2.00;
        this.damage = 100.00;

    }
}
