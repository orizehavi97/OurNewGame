package com.example.user.newgame;

/**
 * Abstract class that represent a character.
 * Created by oriisking on 07/07/2017.
 */
public abstract class Character {

    private int hp;
    private int damage;
    private int movment;

    // Constructors

    /**
     * Constructor for character for default values.
     */
    public Character() {
        this(0, 0, 0);
    }

    /**
     * Constructor for character for inputted values.
     *
     * @param hp - The health points of character.
     * @param damage - The damage of character.
     * @param movment - The character's movment.
     */
    public Character(int hp, int damage, int movment) {
        this.hp = hp;
        this.damage = damage;
        this.movment = movment;
    }

    // Access methods

    /**
     * Access method to get the health points of a character.
     *
     * @return The health points of a character.
     */
    public int getHp() {
        return this.hp;
    }

    /**
     * Access method to get the damage of a character.
     *
     * @return The damage of a character.
     */
    public int getDamage() {
        return this.damage;
    }

    /**
     * Access method to get the movment range of a character.
     *
     * @return The movment range of a character.
     */
    public int getMovment() {
        return this.movment;
    }

    /**
     * Access method to set the health points of a character.
     *
     * @param hp - The health points of a character.
     */
    public void setHp(int hp) {
        this.hp = hp;
    }

    /**
     * Access method to get the damage of a character.
     *
     * @param damage - The damage of a character.
     */
    public void setDamage(int damage) {
        this.damage = damage;
    }

    /**
     * Access method to get the movment range of a character.
     *
     * @param movment -  The movment range of a character.
     */
    public void setMovment(int movment) {
        this.movment = movment;
    }

    // Other methods

    public int getHitted () {
        return 0;
    }
}
