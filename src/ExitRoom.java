public class ExitRoom extends Room implements Exitable {
    public ExitRoom(String name) {
        super(name);
    }

    @Override
    public String getDescription() {
        return "You see a door that leads outside. This is the oportunity to scape.";
    }

    @Override
    public String exit(Player player) {
        return "Game Over. You have escaped the room.";
    }
}

