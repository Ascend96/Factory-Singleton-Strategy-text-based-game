import org.junit.Assert;

import static org.junit.Assert.*;

public class Level1EnemyTest {
    EnemyStrategy enemy = new Level1Enemy();

    @org.junit.Test
    public void armor() {
        assertEquals(1, enemy.armor());
    }

    @org.junit.Test
    public void damage() {
        assertEquals(3, enemy.damage());
    }

    @org.junit.Test
    public void hitPoint() {
        assertEquals(10, enemy.hitPoint());
    }

    @org.junit.Test
    public void getHp() {
        assertEquals(0, enemy.getHp());
    }

    @org.junit.Test
    public void getArmor() {
        assertEquals(0, enemy.getArmor());
    }

    @org.junit.Test
    public void isDead() {
        assertEquals(false, enemy.getHp() < 0);
    }
}