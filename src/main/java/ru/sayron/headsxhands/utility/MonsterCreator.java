package ru.sayron.headsxhands.utility;

import ru.sayron.headsxhands.data.Monster;

/**
 * The MonsterCreator class is responsible for creating a monster.
 */
public class MonsterCreator implements InputReader {

    /**
     * Creates a monster by prompting the user for input.
     *
     * @return The created monster.
     */
    public Monster createMonster() {
        System.out.print("Enter the monster's attack value (from 1 to 30): ");
        int attack = readIntInput(1, 30);

        System.out.print("Enter the monster's defense value (from 1 to 30): ");
        int defense = readIntInput(1, 30);

        System.out.print("Enter the monster's health value (from 0 to N): ");
        int health = readIntInput(0, Integer.MAX_VALUE);

        return new Monster(attack, defense, health);
    }
}
