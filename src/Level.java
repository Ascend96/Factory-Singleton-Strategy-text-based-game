public interface Level {
    void eastRoom(Character player, EnemyStrategy enemy);
    void westRoom(Character player, EnemyStrategy enemy);
    void southRoom(Character player, EnemyStrategy enemy);
    void northRoom(Character player, EnemyStrategy enemy1, EnemyStrategy enemy2, EnemyStrategy enemy3);
}
