package Multiplayer;

public abstract class CharacterClassType {
    protected double health;
    protected double speed;
    public double damage;

    public CharacterClassType(double health, double speed, double damage) {
        this.health = health;
        this.speed = speed;
        this.damage = damage;
    }

    public double getHealth() {
        return health;
    }


    public double getSpeed() {
        return speed;
    }


    public double getDamage() {
        return damage;
    }


    @Override
    public String toString() {
        return "CharacterClassType{" +
                "health=" + health +
                ", speed=" + speed +
                ", damage=" + damage +
                '}';
    }
}
