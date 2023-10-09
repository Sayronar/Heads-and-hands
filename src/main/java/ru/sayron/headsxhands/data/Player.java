package ru.sayron.headsxhands.data;

/**
 * The Player class represents a player in the game.
 */
public class Player extends Creature {
    private int maxHealth;
    private int healCount;

    /**
     * Constructs a new Player object with the specified attack, defense, health, and maxHealth.
     *
     * @param attack     the attack value of the player
     * @param defense    the defense value of the player
     * @param health     the health value of the player
     * @param maxHealth  the maximum health value of the player
     */
    public Player(int attack, int defense, int health, int maxHealth) {
        super(attack, defense, health);
        this.maxHealth = maxHealth;
        this.healCount = 0;

        if (health > maxHealth) {
            System.out.println("Current health cannot be greater than maximum health");
            setHealth(maxHealth);
        }
    }

    /**
     * Heals the player by a certain amount.
     */
    public void heal() {
        if (getHealth() == 0) {
            System.out.println("Player is dead and cannot be healed.");
            return;
        }

        if (getHealth() == maxHealth) {
            System.out.println("Player is already at full health.");
            return;
        }

        if (healCount >= 4) {
            System.out.println("Player has already used all possible heals.");
            return;
        }

        int healAmount = (int) (maxHealth * 0.3);
        setHealth(Math.min(getHealth() + healAmount, maxHealth));
        System.out.println("Player has been healed by " + healAmount + " health points.");
        healCount++;

        int remainingHeals = 4 - healCount;
        System.out.println("Remaining heals: " + remainingHeals);
    }

    /**
     * Returns the maximum health value of the player.
     *
     * @return the maximum health value of the player
     */
    public int getMaxHealth() {
        return maxHealth;
    }

    /**
     * Returns a string representation of the player.
     *
     * @return a string representation of the player
     */
    @Override
    public String toString() {
        return "Player's Stats:\n" +
                "Max Health: " + maxHealth + "\n" +
                "Current Health: " + getHealth() + "\n" +
                "Attack: " + getAttack() + "\n" +
                "Defense: " + getDefense();

    }
}
