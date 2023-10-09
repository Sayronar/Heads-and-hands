import org.junit.jupiter.api.Test;
import ru.sayron.headsxhands.data.Player;
import ru.sayron.headsxhands.data.Monster;
import static org.junit.jupiter.api.Assertions.*;

public class PlayerTests {

    @Test
    public void testPlayerInitialization() {
        int attack = 10;
        int defense = 5;
        int health = 100;
        int maxHealth = 150;

        Player player = new Player(attack, defense, health, maxHealth);

        assertEquals(attack, player.getAttack());
        assertEquals(defense, player.getDefense());
        assertEquals(health, player.getHealth());
        assertEquals(maxHealth, player.getMaxHealth());
    }

    @Test
    public void testPlayerAttack() {
        int attack = 10;
        int defense = 5;
        int health = 100;
        int maxHealth = 150;

        Player player = new Player(attack, defense, health, maxHealth);
        Monster monster = new Monster(20, 10, 200);

        player.attack(monster);

        assertTrue(monster.getHealth() < 200);
    }

    @Test
    public void testPlayerHeal() {
        int attack = 10;
        int defense = 5;
        int health = 100;
        int maxHealth = 150;

        Player player = new Player(attack, defense, health, maxHealth);
        Monster monster = new Monster(20, 10, 200);

        player.attack(monster);
        int previousHealth = player.getHealth();

        player.heal();

        assertTrue(player.getHealth() > previousHealth);
        assertTrue(player.getHealth() <= maxHealth);
    }
}
