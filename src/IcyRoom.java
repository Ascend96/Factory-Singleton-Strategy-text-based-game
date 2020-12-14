/**
 * Implements the room strategy interface
 */
public class IcyRoom implements RoomStrategy {
    public Item potion;
    public EnemyStrategy enemyLevel3;

    /**
     * Constructs the room with a potion and an enemy
     * @param potion
     * @param enemyLevel3
     */
    public IcyRoom(Item potion, EnemyStrategy enemyLevel3) {
        this.potion = potion;
        this.enemyLevel3 = new Level3Enemy();
    }

    /**
     * returns description of room
     * @return
     */
    @Override
    public String description() {
        return "This room is as cold as can be, you can see " +
                "your breath and feel hypothermia starting " +
                "to kick in, you should get out of here fast.";
    }
}
