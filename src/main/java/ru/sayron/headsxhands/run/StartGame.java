package ru.sayron.headsxhands.run;

import ru.sayron.headsxhands.game.GameLogic;
import ru.sayron.headsxhands.utility.MonsterCreator;
import ru.sayron.headsxhands.utility.PlayerCreator;

/**
 * The StartGame class is responsible for starting the game.
 */
public class StartGame {

    /**
     * The main method is the entry point of the program.
     *
     * @param args The command line arguments.
     */
    public static void main(String[] args) {
        GameLogic gameLogic = new GameLogic();
        PlayerCreator playerCreator = new PlayerCreator();
        MonsterCreator monsterCreator = new MonsterCreator();
        System.out.println("The game has started!");
        gameLogic.playGame(playerCreator.createPlayer(), monsterCreator.createMonster());
    }
}
