package com.example.user.newgame;

/**
 * Abstract class that represent a character.
 * Created by oriisking on 07/07/2017.
 */
public abstract class Character {

    private int hp;
    private int damage;
    private int movment;
    private Point location;

    // Constructors

    /**
     * Constructor for character for default values.
     */
    public Character() {
        this(0, 0, 0, new Point());
    }

    /**
     * Constructor for character for inputted values.
     *
     * @param hp - The health points of character.
     * @param damage - The damage of character.
     * @param movment - The character's movment.
     * @param location - The character's location.
     */
    public Character(int hp, int damage, int movment, Point location) {
        this.hp = hp;
        this.damage = damage;
        this.movment = movment;
        this.location = location;
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
     * Access method to get the location of a character.
     *
     * @return The location of a character.
     */
    public Point getLocation() {
        return this.location;
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

    /**
     * Access method to set the location of a character.
     *
     * @param location - The location of a character.
     */
    public void setLocation(Point location) {
        this.location = location;
    }

    // Other methods

    /**
     * Getting a hit from the attacking character.
     *
     * @param attackingCharacter - The attacking character.
     */
    public void getHitted (Character attackingCharacter) {
        this.setHp(this.getHp() - attackingCharacter.getDamage());
    }

    /**
     * Attack the defensive character.
     *
     * @param defensiveCharacter - The defensive character.
     */
    public void attack(Character defensiveCharacter) {
        defensiveCharacter.getHitted(this);
    }

    /**
     * Move the character to another location.
     *
     * @param newLocation - The character's new location.
     */
    public void move(Point newLocation) {
        this.setLocation(newLocation);
    }
}
