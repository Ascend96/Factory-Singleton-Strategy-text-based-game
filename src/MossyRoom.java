/**
 * Implements the room strategy interface
 */
public class MossyRoom implements RoomStrategy {
    public Item potion;
    public EnemyStrategy enemy1;

    /**
     * Constructs the room with an enemy and a potion
     * @param potion
     * @param enemy1
     */
    public MossyRoom(Item potion, EnemyStrategy enemy1) {
        this.potion = potion;
        this.enemy1 = new Level1Enemy();
    }

    /**
     * describes the room
     * @return
     */
    @Override
    public String description() {
        return "The room smells of mold, you hear water dripping from the ceiling and you see\n" +
                " Stalactites sharper than any blade looking as if they could fall at any moment";
    }
}
