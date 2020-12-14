import java.util.Scanner;

public class Floor2 implements Level {
    private Potion potion;
    public EnemyStrategy enemy1 = new Level1Enemy();
    public EnemyStrategy enemy2 = new Level2Enemy();
    public EnemyStrategy enemy3 = new Level3Enemy();
    public Character player;
    Scanner scanner = new Scanner(System.in);

    public void MainArea() {
        /**
         * @Description
         * This is the main area for the rooms that allows the user to direct which room they would like to enter
         */
        System.out.println("As you enter the level, a blood red sign " +
                "looks like it reads 'The Depths' ");
        System.out.println("1)Go into the north room");
        System.out.println("2)Go into the west room");
        System.out.println("3)Go into the south room");
        System.out.println("4)Go into the east room");
        String option = scanner.next();
        if (option.equals("1")) {
            northRoom(player, enemy1, enemy2, enemy3);
        } else if (option.equals("2")) {
            westRoom(player, enemy2);
        } else if (option.equals("3")) {
            southRoom(player, enemy3);
        } else if (option.equals("4")) {
            eastRoom(player, enemy1);
        }
    }

    /**
     * @param player passes the player into each room to keep the health that was lost in previous rooms visited
     *               The user has options to run away, check character stats, check monsters stats
     *               or attack
     */

    @Override
    public void eastRoom(Character player, EnemyStrategy enemy1) {
        player = Character.getPlayer();
        RoomStrategy room1 = new MossyRoom(potion, enemy1);
        System.out.println(room1.description());

        System.out.println("What would you like to do?");
        System.out.println("1) Search the room for items");
        System.out.println("2) Leave the room");
        String choice = scanner.next();
        if (choice.equals("1")) {
            System.out.println("As you search the room you find a potion down a long hallway\n" +
                    ", as you attempt to go down the hallway a door at the end in front of the potion\n" +
                    " crashes open, you see what looks like a goblin step out into the hallway");

            enemy1.setArmor(enemy1.armor());
            enemy1.setHp(enemy1.hitPoint());
            String selection;

            System.out.println("You must defeat the enemy in order to achieve the potion");
            do {
                System.out.println("1) Attack");
                System.out.println("2) Check players stats");
                System.out.println("3) Check monsters stats");
                System.out.println("4) Run");
                selection = scanner.next();
                if (selection.equals("1")) {
                    System.out.println("You swing your sword at the monster and strike his chest");
                    System.out.println("You deal " + (player.damage - enemy1.getArmor()) + " damage to his hit points" +
                            " and break his armor");
                    player.Attack(enemy1);
                    enemy1.attack(player);
                    System.out.println("He strikes you back with his flail attempting to damage you but he can not seem to break through your armor");
                    if (enemy1.getHp() <= 0) {
                        System.out.println("You have defeated the enemy");
                        System.out.println("You obtain the potion at the end of the hall " +
                                "and proceed to look around, after searching the room " +
                                "that the enemy came out of, you find what looks like" +
                                " one part of a three dimensional triangle.");
                        System.out.println("You begin to wonder if that is how you will escape this place.");
                        player.inventory.add(potion);
                        System.out.println("You exit the room back into the main area");
                        System.out.println("1)Go into the north room");
                        System.out.println("2)Go into the west room");
                        System.out.println("3)Go into the south room");
                        System.out.println("4)Go into the east room");


                    }


                } else if (selection.equals("2")) {
                    System.out.println("Health remaining " + (player.getHp()) + "\n" +
                            "Armor: " + (player.armor));
                    if(player.getHp() <= 0){
                        System.out.println("You have died");
                        MainArea();
                    }
                } else if (selection.equals("3")) {
                    System.out.println(enemy1.description());
                } else if (selection.equals("4")) {
                    System.out.println("You exit the room");
                    MainArea();
                }

            } while (selection.equals("1") && enemy1.getHp() >= 0 || selection.equals("2") && enemy1.getHp() >= 0 || selection.equals("3") && enemy1.getHp() >= 0 || selection.equals("4") && enemy1.getHp() >= 0);


        }
    }

    @Override
    public void westRoom(Character player, EnemyStrategy enemy2) {
        player = Character.getPlayer();
        RoomStrategy room2 = new Dungeon(potion, enemy2);
        System.out.println(room2.description());
        System.out.println("What would you like to do?");
        System.out.println("1) Search the room for items");
        System.out.println("2) Leave the room");
        String choice = scanner.next();
        if (choice.equals("1")) {
            System.out.println("As you search the room you hear the footsteps getting louder and louder.\n" +
                    ", As you reach the center table with all of the tools you hear a door crash open and a monster jumps out\n");

            enemy2.setArmor(enemy2.armor());
            enemy2.setHp(enemy2.hitPoint());
            String selection;

            System.out.println("You must defeat the enemy in order to achieve the potion");
            do {
                System.out.println("1) Attack");
                System.out.println("2) Check players stats");
                System.out.println("3) Check monsters stats");
                System.out.println("4) Run");
                selection = scanner.next();
                if (selection.equals("1")) {
                    System.out.println("You swing your sword at the monster and strike his chest");
                    System.out.println("You deal " + (player.damage - enemy2.getArmor()) + " damage to his hit points" +
                            " and break his armor");
                    player.Attack(enemy2);
                    enemy2.attack(player);
                    System.out.println("He strikes you back with force strong enough to penetrate your armor and damages\n" +
                            " your hitpoints");
                    if (enemy2.getHp() <= 0) {
                        System.out.println("You have defeated the enemy");
                        System.out.println("You search around and deep within the dungeon\n " +
                                "you find a potion and another piece to the triangle");
                        player.inventory.add(potion);
                        System.out.println("You exit the room back into the main area");

                    }


                } else if (selection.equals("2")) {
                    System.out.println("Health remaining " + (player.getHp()) + "\n" +
                            "Armor: " + (player.armor));
                    if(player.getHp() <= 0){
                        System.out.println("You have died");
                        MainArea();
                    }
                } else if (selection.equals("3")) {
                    System.out.println(enemy2.description());

                } else if (selection.equals("4")) {
                    System.out.println("You exit the room");
                    MainArea();

                }
            } while (selection.equals("1") && enemy2.getHp() >= 0 || selection.equals("2") && enemy2.getHp() >= 0 || selection.equals("3") && enemy2.getHp() >= 0 || selection.equals("4") && enemy2.getHp() >= 0);
            MainArea();

        }
    }

    @Override
    public void southRoom(Character player, EnemyStrategy enemy3) {
        player = Character.getPlayer();
        RoomStrategy room3 = new IcyRoom(potion, enemy3);
        System.out.println(room3.description());
        System.out.println("What would you like to do?");
        System.out.println("1) Search the room for items");
        System.out.println("2) Leave the room");
        String choice = scanner.next();
        if (choice.equals("1")) {
            System.out.println("As you attempt to walk across the floor, you almost fall onto your back, \n" +
                    "as you regain your balance you see icicles falling as the room trembles\n");

            enemy3.setArmor(enemy3.armor());
            enemy3.setHp(enemy3.hitPoint());
            String selection;

            System.out.println("You must defeat the enemy in order to clear the room");
            do {
                System.out.println("1) Attack");
                System.out.println("2) Check players stats");
                System.out.println("3) Check monsters stats");
                System.out.println("4) Run");
                selection = scanner.next();
                if (selection.equals("1")) {
                    System.out.println("You swing your sword at the monster and strike his chest");
                    System.out.println("You deal " + (player.damage - enemy3.getArmor()) + " damage to his hit points" +
                            " and break his armor");
                    player.Attack(enemy3);
                    enemy3.attack(player);
                    System.out.println("He strikes you back with force strong enough to penetrate your armor and damages\n" +
                            " your hitpoints");
                    if (enemy3.getHp() <= 0) {
                        System.out.println("You have defeated the enemy");
                        System.out.println("You search around and deep within the dungeon\n " +
                                "you find a potion and another piece to the triangle");
                        player.inventory.add(potion);
                        System.out.println("You exit the room back into the main area");

                    }


                } else if (selection.equals("2")) {
                    System.out.println("Health remaining " + (player.getHp()) + "\n" +
                            "Armor: " + (player.armor));
                    if(player.getHp() <= 0){
                        System.out.println("You have died");
                        MainArea();
                    }
                } else if (selection.equals("3")) {
                    System.out.println(enemy3.description());

                } else if (selection.equals("4")) {
                    System.out.println("You exit the room");
                    MainArea();

                }
            } while (selection.equals("1") && enemy3.getHp() >= 0 || selection.equals("2") && enemy3.getHp() >= 0 || selection.equals("3") && enemy3.getHp() >= 0 || selection.equals("4") && enemy3.getHp() >= 0);
            MainArea();
        }
    }

    /**
     * This is currently not working but overall goal was to check each enemies health <= 0
     * if it was grant the player the success of winning, else tell them to go back and finish the enemies
     * @param player
     * @param enemy1
     * @param enemy2
     * @param enemy3
     */
    @Override
    public void northRoom(Character player, EnemyStrategy enemy1, EnemyStrategy enemy2, EnemyStrategy enemy3) {
        player = Character.getPlayer();
        RoomStrategy finalRoom = new FinalRoom();
        finalRoom.description();
        if(enemy1.getHp() <= 0 && enemy2.getHp() <= 0 && enemy3.getHp() <= 0){
            System.out.println("You have completed the level");
        } else{
            System.out.println("You must defeat the three enemies to get the pieces to the triangle");
        }
        MainArea();
    }
}

