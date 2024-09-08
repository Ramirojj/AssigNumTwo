public class Maze {
    private Room currentRoom;
    private Player player;
    private boolean isFinished;

    public Maze() {
        this.player = new Player();
        this.isFinished = false;

        // Crear las habitaciones
        Room startRoom = new StartRoom("First Room");
        Room lootRoom = new LootRoom("Room Tesoro");
        Room exitRoom = new ExitRoom("Exit Room");

        ////Conectar las habitaciones
       // startRoom.setEast(lootRoom);
        //lootRoom.setEast(exitRoom);
        startRoom.setEast(lootRoom);
        lootRoom.setWest(startRoom); // Conectar de vuelta al oeste
        lootRoom.setEast(exitRoom);
        exitRoom.setWest(lootRoom);  // Conectar de vuelta al oeste

        // Establecer la habitación inicial
        this.currentRoom = startRoom;
    }
/*
* A method named exitCurrentRoom that returns a String.
* If the currentRoom is Exitable, it returns the result of calling exit() on the Room.
*  If not, it returns a message that the current room is not exitable.

 * */



    public String exitCurrentRoom() {
        if (currentRoom instanceof Exitable) {
            isFinished = true;
            return ((Exitable) currentRoom).exit(player);
        } else {
            return "No exit here";
        }
    }
/*A method named interactWithCurrentRoom that returns a String.
 If the currentRoom is Interactable, it returns the result of calling interact on the Room.
  If not, it returns a message that no interactions are possible.
 */


    public String interactWithCurrentRoom() {
        if (currentRoom instanceof Interactable) {
            return ((Interactable) currentRoom).interact(player);
        } else {
            return "Nothing to do here.";
        }
    }
/*
* A method named lootCurrentRoom that returns a String.
* If the currentRoom is Lootable, it returns the result of calling loot on the Room.
*  If not, it returns a message that the current room is not lootable.

 *  */

////////////////////////
    public String lootCurrentRoom() {
        if (currentRoom instanceof Lootable) {
            return ((Lootable) currentRoom).loot(player);
        } else {
            return "Nothing to loot.";
        }
    }
/* A method named move that accepts a char argument for the direction and returns a boolean.
If the direction is valid to move from within the currentRoom, the adjoining Room becomes
the new currentRoom and the method returns true. If not, the method returns false.*/
    public boolean move(char direction) {
        if (currentRoom.isValidDirection(direction)) {
            currentRoom = currentRoom.getAdjoiningRoom(direction);
            return true;
        } else {
            return false;
        }
    }
/*Methods named getPlayerScore and getPlayerInventory that return the result of calling the Player's
getScore and getInventory methods.
 */
    //////////////////////////////////////////////////////////////////////////////////////////////////////
    public String getPlayerScore() {
        return "Score : " + player.getScore();
    }

    public String getPlayerInventory() {
        return player.getInventory();
    }
/*Methods named getCurrentRoomDescription and getCurrentRoomExits
that return the result of calling the getDescription and getExits method of the currentRoom.*/
    public String getCurrentRoomDescription() {
        return currentRoom.getDescription();
    }
/**/
    public String getCurrentRoomExits() {
        return "Exits : " + currentRoom.getExits();
    }
/*A method named isFinished that returns the Maze's isFinished field (a boolean)*/
    public boolean isFinished() {
        return isFinished;
    }
}
