package Multiplayer;

public class LoadOuts {
    private String classType;
    private String primaryWeapon;
    private  String secondaryWeapon;
    private String ability;
    private String meleeWeapon;
    private String lethals;

    public LoadOuts(String classType, String primaryWeapon, String secondaryWeapon, String ability, String meleeWeapon, String lethals) {
        this.classType = classType;
        this.primaryWeapon = primaryWeapon;
        this.secondaryWeapon = secondaryWeapon;
        this.ability = ability;
        this.meleeWeapon = meleeWeapon;
        this.lethals = lethals;

    }

    public String getClassType() {
        return classType;
    }

    public String getPrimaryWeapon() {
        return primaryWeapon;
    }

    public String getSecondaryWeapon() {
        return secondaryWeapon;
    }

    public String getAbility() {
        return ability;
    }

    public String getMeleeWeapon() {
        return meleeWeapon;
    }

    public String getLethals() {
        return lethals;
    }

    @Override
    public String toString() {
        return "LoadOuts{" +
                "classType='" + classType + '\'' +
                ", primaryWeapon='" + primaryWeapon + '\'' +
                ", secondaryWeapon='" + secondaryWeapon + '\'' +
                ", ability='" + ability + '\'' +
                ", meleeWeapon='" + meleeWeapon + '\'' +
                ", lethals='" + lethals + '\'' +
                '}';
    }
}
