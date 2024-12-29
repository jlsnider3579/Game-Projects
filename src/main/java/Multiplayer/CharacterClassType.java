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

    public void setHealth(int health) {
        this.health = health;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
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
