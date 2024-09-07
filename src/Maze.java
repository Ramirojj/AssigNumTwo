public class Maze {
    private Room currentRoom;
    private Player player;
    private boolean isFinished;

    public Maze() {
        this.player = new Player();
        this.isFinished = false;

        // Crear las habitaciones
        Room startRoom = new StartRoom("Habitación de Inicio");
        Room lootRoom = new LootRoom("Habitación del Tesoro");
        Room exitRoom = new ExitRoom("Habitación de Salida");

        // Conectar las habitaciones
        startRoom.setEast(lootRoom);
        lootRoom.setEast(exitRoom);

        // Establecer la habitación inicial
        this.currentRoom = startRoom;
    }

    public String exitCurrentRoom() {
        if (currentRoom instanceof Exitable) {
            isFinished = true;
            return ((Exitable) currentRoom).exit(player);
        } else {
            return "Esta habitación no es exitable.";
        }
    }

    public String interactWithCurrentRoom() {
        if (currentRoom instanceof Interactable) {
            return ((Interactable) currentRoom).interact(player);
        } else {
            return "No hay nada con qué interactuar.";
        }
    }

    public String lootCurrentRoom() {
        if (currentRoom instanceof Lootable) {
            return ((Lootable) currentRoom).loot(player);
        } else {
            return "No hay nada que saquear.";
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
        return "Puntuación: " + player.getScore();
    }

    public String getPlayerInventory() {
        return player.getInventory();
    }

    public String getCurrentRoomDescription() {
        return currentRoom.getDescription();
    }

    public String getCurrentRoomExits() {
        return "Salidas: " + currentRoom.getExits();
    }

    public boolean isFinished() {
        return isFinished;
    }
}