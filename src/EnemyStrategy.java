/**
 * This is a strategy pattern for the enemies
 */
public interface EnemyStrategy {
    int hitPoint();
    int level();
    int damage();
    int armor();
    void setHp(int hp);
    int getHp();
    int getArmor();
    void setArmor(int armor);
    boolean isDead(int hp);
    void attack(Character player);
    String description();
}
