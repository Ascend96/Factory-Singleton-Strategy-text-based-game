public class Dungeon implements RoomStrategy {
    public Item potion;
    public EnemyStrategy enemyLevel2;

    /**
     * Constructs the room with an enemy as well as a potion
     * @param potion
     * @param enemyLevel2
     */
    public Dungeon(Item potion, EnemyStrategy enemyLevel2) {
        this.potion = potion;
        this.enemyLevel2 = new Level2Enemy();
    }

    @Override
    public String description() {
        return "The room has high ceilings, cages, and a table in the \ncenter that looks like it could have been " +
                "used for torture, you notice various sharp tools \nlaying next to the table on a rack." +
                "You feel like you hear faint sounds of \nscreaming and footsteps heading towards you";
    }
}
