import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Maze maze = new Maze();

        while (!maze.isFinished()) {
            System.out.println(maze.getCurrentRoomDescription());
            System.out.println(maze.getCurrentRoomExits());

            char command = scanner.next().charAt(0);

            switch (command) {
                case 'n':
                case 's':
                case 'e':
                case 'w':
                case 'u':
                case 'd':
                    if (!maze.move(command)) {
                        System.out.println("There is not exit in that direction .");

                    }
                    break;
                case 'i':
                    System.out.println(maze.interactWithCurrentRoom());
                    break;
                case 'l':
                    System.out.println(maze.lootCurrentRoom());
                    System.out.println("Your actual scorte is : " + maze.getPlayerScore());
                    break;
                case 'x':
                    System.out.println(maze.exitCurrentRoom());
                    break;
                case 'v':
                    System.out.println(maze.getPlayerInventory());
                    break;
                default:
                    System.out.println(" Try again.");
                    break;
            }
        }
    }
}

 //////////Suggestions ////////////////
/*add a method to validate the user input and ensure that only valid commands  are processe d */



