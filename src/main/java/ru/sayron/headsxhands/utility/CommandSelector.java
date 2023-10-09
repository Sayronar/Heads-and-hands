package ru.sayron.headsxhands.utility;

/**
 * The CommandSelector class is responsible for selecting a command from the player.
 */
public class CommandSelector implements InputReader {

    /**
     * Prompts the player to choose a command and returns the selected command.
     *
     * @return The selected command.
     */
    public int chooseCommand() {
        System.out.println("Player's turn");
        System.out.println("1. Attack");
        System.out.println("2. Heal");
        System.out.println("3. Get player information");
        System.out.println("4. Get monster information");
        System.out.print("Choose an action (number): ");

        return readIntInput(1, 4);
    }
}
