import org.junit.Test;

import static org.junit.Assert.*;

public class Level3EnemyTest {
    EnemyStrategy enemy = new Level3Enemy();

    @Test
    public void armor() {
        assertEquals(5, enemy.armor());
    }

    @Test
    public void damage() {
        assertEquals(9, enemy.damage());
    }

    @Test
    public void hitPoint() {
        assertEquals(30, enemy.hitPoint());
    }

    @Test
    public void level() {
        assertEquals(3, enemy.level());
    }

    @Test
    public void getHp() {
        assertEquals(0, enemy.getHp());
    }

    @Test
    public void getArmor() {
        assertEquals(0, enemy.getArmor());
    }

    @Test
    public void isDead() {
        assertEquals(false, enemy.getHp() < 0);
    }
}