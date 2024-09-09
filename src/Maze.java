public class Maze {
    private Room currentRoom;
    private final Player player;
    private boolean isFinished;

    // //Constructor de Maze
    public Maze() {
        this.player = new Player();
        this.isFinished = false;


        Room startRoom = new StartRoom("First Room");
        Room lootRoom = new LootRoom("Room Tesoro");
        Room exitRoom = new ExitRoom("Exit Room");
        Room northRoom = new Room("North Room") {
            @Override
            public String getDescription() {
                return "You are in the northern room.";
            }
        };

        // Conectar las habitaciones
        startRoom.setEast(lootRoom);
        lootRoom.setWest(startRoom);
        lootRoom.setEast(exitRoom);
        exitRoom.setWest(lootRoom);

        startRoom.setNorth(northRoom);
        northRoom.setSouth(startRoom);


        this.currentRoom = startRoom;
    }


    public String exitCurrentRoom() {
        if (currentRoom instanceof Exitable) {
            isFinished = true;
            return ((Exitable) currentRoom).exit(player);
        } else {
            return "No exit here";
        }
    }


    public String interactWithCurrentRoom() {
        if (currentRoom instanceof Interactable) {
            return ((Interactable) currentRoom).interact(player);
        } else {
            return "Nothing to do here.";
        }
    }


    public String lootCurrentRoom() {
        if (currentRoom instanceof Lootable) {
            return ((Lootable) currentRoom).loot(player);
        } else {
            return "Nothing to loot.";
        }
    }


    public boolean move(char direction) {
        if (currentRoom.isValidDirection(direction)) {
            currentRoom = currentRoom.getAdjoiningRoom(direction);
            return true;
        } else {
            return false;
        }
    }


    public String getPlayerScore() {
        return "Score: " + player.getScore();
    }


    public String getPlayerInventory() {
        return player.getInventory();
    }


    public String getCurrentRoomDescription() {
        return currentRoom.getDescription();
    }


    public String getCurrentRoomExits() {
        return "The exits are: " + currentRoom.getExits();
    }


    public boolean isFinished() {
        return isFinished;
    }
}
