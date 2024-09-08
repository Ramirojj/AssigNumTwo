public class StartRoom extends Room {
    public StartRoom(String name) {
        super(name);
    }

    @Override
    public String getDescription() {
        return "You are at the beggining of a small room.";
    }
}