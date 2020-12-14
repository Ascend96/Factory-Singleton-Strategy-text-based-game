public class Potion implements Item {
    private int hpGained;

    /**
     * Description of item
     * @return
     */
    @Override
    public String description() {
        return "This item will regenerate 5 health points";
    }

    @Override
    public String name() {
        return "Health Potion";
    }

    /**
     * method for player to use potion and increase hitpoints
     * @param player
     * @param hpGained
     */
    public void UsePotion(Character player, int hpGained){
        player.setHp(player.getHp() + 5);
    }
}
