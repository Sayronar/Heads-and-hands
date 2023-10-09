package ru.sayron.headsxhands.game;

import ru.sayron.headsxhands.data.Player;
import ru.sayron.headsxhands.data.Monster;

/**
 * The GameInformation class provides methods to print information about the player and monster.
 */
public class GameInformation {
    private Player player;
    private Monster monster;

    /**
     * Constructs a new GameInformation object with the specified player and monster.
     *
     * @param player  the player object
     * @param monster the monster object
     */
    public GameInformation(Player player, Monster monster) {
        this.player = player;
        this.monster = monster;
    }

    /**
     * Prints the information about the player.
     */
    public void printPlayerInfo() {
        System.out.println(player.toString());
    }

    /**
     * Prints the information about the monster.
     */
    public void printMonsterInfo() {
        System.out.println(monster.toString());
    }
}
