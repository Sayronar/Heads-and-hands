import org.junit.jupiter.api.Test;
import ru.sayron.headsxhands.data.Monster;
import ru.sayron.headsxhands.data.Player;

import static org.junit.jupiter.api.Assertions.*;

public class MonsterTests {

    @Test
    public void testMonsterInitialization() {
        int attack = 20;
        int defense = 10;
        int health = 200;

        Monster monster = new Monster(attack, defense, health);

        assertEquals(attack, monster.getAttack());
        assertEquals(defense, monster.getDefense());
        assertEquals(health, monster.getHealth());
    }

    @Test
    public void testMonsterAttack() {
        int attack = 20;
        int defense = 10;
        int health = 200;

        Monster monster = new Monster(attack, defense, health);
        Player player = new Player(10, 5, 100, 150);

        monster.attack(player);

        assertTrue(player.getHealth() < 150);
    }
}
