package ru.sayron.headsxhands.game;

import ru.sayron.headsxhands.data.Monster;
import ru.sayron.headsxhands.data.Player;
import ru.sayron.headsxhands.utility.CommandSelector;

/**
 * The GameLogic class represents the logic of the game.
 */
public class GameLogic {

    /**
     * Plays the game between the player and the monster.
     *
     * @param player  The player object.
     * @param monster The monster object.
     */
    public void playGame(Player player, Monster monster) {
        CommandSelector commandSelector = new CommandSelector();
        GameInformation gameInformation = new GameInformation(player, monster);

        // Game loop
        while (player.getHealth() > 0 && monster.getHealth() > 0) {
            // Player's command selection
            int choice = commandSelector.chooseCommand();

            // Processing the selected command
            switch (choice) {
                case 1 -> player.attack(monster);
                case 2 -> player.heal();
                case 3 -> {
                    gameInformation.printPlayerInfo();
                    continue;
                }
                case 4 -> {
                    gameInformation.printMonsterInfo();
                    continue;
                }
                default -> {
                    System.out.println("Invalid choice. Please try again.");
                    continue;
                }
            }

            // Checking the monster's state
            if (monster.getHealth() <= 0) {
                System.out.println("Monster defeated! Game over.");
                break;
            }

            // Monster's turn
            System.out.println("Monster's turn");
            monster.attack(player);

            // Checking the player's state
            if (player.getHealth() <= 0) {
                System.out.println("Player defeated! Game over.");
                break;
            }
        }
    }
}
