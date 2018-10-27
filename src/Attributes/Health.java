package Attributes;


public class Health {

    private int health;
    //private int healthBASE = 100;

    public Health() {
        health = 100;
    }

    public int getHealth() {
        return health;
    }

    public int SetHealth(int newHealth) {
        health = newHealth;
        return health;
    }

}
