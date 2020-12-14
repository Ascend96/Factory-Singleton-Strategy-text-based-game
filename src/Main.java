import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MainRoom();

    }
public static void MainRoom(){
     EnemyStrategy enemy1 = new Level1Enemy();
     EnemyStrategy enemy2 = new Level2Enemy();
     EnemyStrategy enemy3 = new Level3Enemy();
    Scanner scanner = new Scanner(System.in);
     LevelFactory levelFactory = new LevelFactory();
    System.out.println("Select the level you would like to go to first\n");
    System.out.println("1) The Caverns");
    System.out.println("2) The Depths");
    System.out.println("3) The Base");
    String levelSelect = scanner.next();
    Level floor = LevelFactory.getLevel(levelSelect);
    if(levelSelect.equals("1")){
        System.out.println("As you enter the level, a torn apart sign above " +
                "looks like it reads 'The caverns' ");
    }
    else if(levelSelect.equals("2")){
        System.out.println("As you enter the level, a blood red sign " +
                "looks like it reads 'The Depths' ");
    }
    else if(levelSelect.equals("3")){
        System.out.println("As you enter the level, an old military sign " +
                "looks like it reads 'The Base' ");
    }
    System.out.println("1)Go into the north room");
    System.out.println("2)Go into the west room");
    System.out.println("3)Go into the south room");
    System.out.println("4)Go into the east room");
    String option = scanner.next();
    if(option.equals("1")){
        floor.northRoom(Character.getPlayer(), enemy1, enemy2, enemy3);
    }
    else if(option.equals("2")){
        floor.westRoom(Character.getPlayer(), enemy2);
    }
    else if(option.equals("3")){
        floor.southRoom(Character.getPlayer(), enemy3);
    }
    else if(option.equals("4")){
        floor.eastRoom(Character.getPlayer(), enemy1);
    }
}
}
