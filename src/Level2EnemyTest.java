import org.junit.Test;

import static org.junit.Assert.*;

public class Level2EnemyTest {
    EnemyStrategy enemy = new Level2Enemy();

    @Test
    public void damage() {
        assertEquals(6, enemy.damage());
    }

    @Test
    public void hitPoint() {
        assertEquals(20, enemy.hitPoint());
    }

    @Test
    public void level() {
        assertEquals(2, enemy.level());
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
        assertEquals(false, enemy.hitPoint() < 0);
    }
}