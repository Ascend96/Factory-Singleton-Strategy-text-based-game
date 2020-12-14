import org.junit.Test;

import static org.junit.Assert.*;

public class CharacterTest {
Character player = Character.getPlayer();
    @Test
    public void getHp() {
        assertEquals(50, player.getHp());
    }

    @Test
    public void getArmor() {
        assertEquals(5, player.getArmor());
    }
}