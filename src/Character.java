import java.util.ArrayList;
import java.util.List;

/**
 * This is using the singleton pattern for the static character instance by keeping
 * the constructor private and returning the instance of the player when the getPlayer method
 * is called
 */
public class Character {
    private String name;
    public List<Item> inventory = new ArrayList<Item>();
    public int damage = 7;
    public int hp = 50;
    public int armor = 5;

    private static Character player = new Character();
    private Character(){}

    public static Character getPlayer(){
        return player;
    }
    public int UsePotion(Potion potion){
        setHp(hp);
        return hp + 5;
    }

    /**
     * returns hp
     * @return
     */
    public int getHp() {
        return hp;
    }

    /**
     * sets the hp
     * @param hp
     */

    public void setHp(int hp) {
        this.hp = hp;
    }

    /**
     * returns armor and sets armor
     * @return
     */
    public int getArmor(){ return armor; }
    public void setArmor(int armor){ this.armor = armor; }

    /**
     * sets the enemies armor and hp based on the damage of the player
     * when the attack method is called
     * @param enemy
     */
    public void Attack(EnemyStrategy enemy){
        if(enemy.getArmor() > damage){
            enemy.setArmor(enemy.getArmor() - damage);
        }
        else {
            enemy.setHp(enemy.getHp() - (damage - enemy.getArmor()));
            enemy.setArmor(0);
        }
    }
}
