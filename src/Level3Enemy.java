public class Level3Enemy implements EnemyStrategy {
    public int hp;
    public int armor;
    /**
     * returns armor, damage, hitpoints and level for displaying and setting
     * @return
     */
    @Override
    public int armor() {
        return 5;
    }

    @Override
    public int damage() {
        return 9;
    }

    @Override
    public int hitPoint() {
        return 30;
    }

    @Override
    public int level() {
        return 3;
    }
    /**
     * returns a description of the monster
     * @return
     */
    @Override
    public String description() {
        return "This giant monstrosity is the size of a small house and has blood dripping from his teeth" + "\n\tLevel: 3\n" +
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

