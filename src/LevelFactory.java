/**
 * This is the factory pattern for the levels and allows user selection
 * of level on startup based on number entered
 */
public class LevelFactory {
    public static Level getLevel(String levelNumber){
        if(levelNumber == null){
            return null;
        }
        if(levelNumber.equals("1")){
            return new Floor1();
        }
        else if(levelNumber.equals("2")){
            return new Floor2();
        }
        else if(levelNumber.equals("3")){
            return new Floor3();
        }
        return null;
    }
}
