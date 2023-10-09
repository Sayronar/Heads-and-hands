package ru.sayron.headsxhands.data;

import java.util.Random;

/**
 * The abstract class Creature represents a creature in the game.
 */
public abstract class Creature {
    int attack;
    int defense;
    int health;

    /**
     * Constructor for the Creature class.
     *
     * @param attack  the attack value of the creature
     * @param defense the defense value of the creature
     * @param health  the health value of the creature
     */
    public Creature(int attack, int defense, int health) {
        this.attack = attack;
        this.defense = defense;
        this.health = health;
    }

    /**
     * Method to get the attack value of the creature.
     *
     * @return the attack value
     */
    public int getAttack() {
        return attack;
    }

    /**
     * Method to get the defense value of the creature.
     *
     * @return the defense value
     */
    public int getDefense() {
        return defense;
    }

    /**
     * Method to get the health value of the creature.
     *
     * @return the health value
     */
    public int getHealth() {
        return health;
    }

    /**
     * Method to set the health value of the creature.
     *
     * @param health the new health value
     */
    public void setHealth(int health) {
        this.health = health;
    }

    /**
     * Method for the creature to attack another creature.
     *
     * @param target the target of the attack
     */
    public void attack(Creature target) {
        int attackModifier = this.attack - target.defense + 1;
        int diceRolls = Math.max(attackModifier, 1);
        Random random = new Random();
        boolean successfulHit = false;

        for (int i = 0; i < diceRolls; i++) {
            int diceRoll = random.nextInt(6) + 1;
            if (diceRoll >= 5) {
                successfulHit = true;
                break;
            }
        }

        if (successfulHit) {
            int damage = this.getAttack();
            target.setHealth(target.getHealth() - damage);
            System.out.println("Successful hit! Dealt " + damage + " damage.");
        } else {
            System.out.println("Attack missed!");
        }
    }
}
