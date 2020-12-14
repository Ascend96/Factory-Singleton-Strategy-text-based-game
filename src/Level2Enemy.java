public class Level2Enemy implements EnemyStrategy {
    public int hp;
    public int armor;
    /**
     * returns armor, damage, hitpoints and level for displaying and setting
     * @return
     */
    @Override
    public int armor() {
        return 3;
    }

    @Override
    public int damage() {
        return 6;
    }

    @Override
    public int hitPoint() {
        return 20;
    }

    @Override
    public int level() {
        return 2;
    }

    /**
     * returns a description of the monster
     * @return
     */
    @Override
    public String description() {
        return "This formidable foe has dark red beady eyes, looks at you with malicious intent" + "\n\tLevel: 2\n" +
                "\thit points: " + (getHp()) + "\n\tdamage: " + (damage()) + "\n\tarmor: " + (getArmor());
    }
    /**
     * returns the hp and armor and sets the hp and armor
     * @return
     */
    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }
    /**
     * checks if the enemy is dead
     * @param hp
     * @return
     */
    public boolean isDead(int hp){
        return hp <= 0;
    }
    /**
     * attacks the player and subtracts current armor from damage dealt
     * @param player
     */
    @Override
    public void attack(Character player) {
        if(damage() > player.armor) {
            player.setHp(player.getHp() - (damage() - player.getArmor()));
        } else{
            player.setHp(player.getHp());
        }
    }
}
