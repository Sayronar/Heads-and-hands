package ru.sayron.headsxhands.utility;

import ru.sayron.headsxhands.data.Player;

public class PlayerCreator implements InputReader{

    public Player createPlayer() {
        System.out.print("Enter the player's attack value (from 1 to 30): ");
        int attack = readIntInput(1, 30);

        System.out.print("Enter the player's defense value (from 1 to 30): ");
        int defense = readIntInput(1, 30);

        System.out.print("Enter the current health value of the player (from 0 to N): ");
        int health = readIntInput(0, Integer.MAX_VALUE);

        System.out.print("Enter the maximum health value of the player: ");
        int maxHealth = readIntInput(0, Integer.MAX_VALUE);

        return new Player(attack, defense, health, maxHealth);
    }
}
