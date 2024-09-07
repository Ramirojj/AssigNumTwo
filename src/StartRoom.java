public class StartRoom extends Room {
    public StartRoom(String name) {
        super(name);
    }

    @Override
    public String getDescription() {
        return "Te encuentras en la habitación de inicio. Es simple y pequeña.";
    }
}