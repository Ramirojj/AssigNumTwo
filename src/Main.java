import java.util.Scanner;
/*
*
Main: This class is the driver and contains the main method. Implement the following logic within main.
Create the Maze, and a Scanner to read keyboard input.

*
* */


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Maze maze = new Maze();
        /////(n, s, e, w, u, d, i, l, x, v)
        while (!maze.isFinished()) {///// This is the main bucle of the game
            System.out.println(maze.getCurrentRoomDescription()); //// This is the current room description
            System.out.println(maze.getCurrentRoomExits());      ////avalible exits od the room
           // System.out.println(" Please , enter a command : ");//////The possible optons of player
            char command = scanner.next().charAt(0);
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            switch (command) {//////This is the switch of the game / evaluate the command entered by user
                case 'n':
                case 's':
                case 'e':
                case 'w':
                case 'u':
                case 'd':
                    if (!maze.move(command)) {
                        System.out.println("There is not exit in that direction .");
                        ////If the conditions are not met, then you will have to enter again.
                    }
                    break;
                case 'i':
                    System.out.println(maze.interactWithCurrentRoom());//////This is the interaction with the room
                    break;
                case 'l':
                    System.out.println(maze.lootCurrentRoom());//////This is the interaction with the room
                    System.out.println("Your actual scorte is :: " + maze.getPlayerScore()); // Mostrar la puntuación
                    break;
                case 'x':
                    System.out.println(maze.exitCurrentRoom());//////This is the interaction with the room
                    break;
                case 'v':
                    System.out.println(maze.getPlayerInventory());//////This is the interaction with the room
                    break;
                default:
                    System.out.println(" Try again.");//////This is the interaction with the room
                    break;
            }
        }
    }
}

///////////////things that i can improve in the code//////

/*I can't see the changes in the
directions because I always see the same east pattern repeating even when I select different options.*/
/*


/* The objects are not being added to the inventory, so the inventory is always empty.*/


