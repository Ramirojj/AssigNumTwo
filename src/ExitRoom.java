public class ExitRoom extends Room implements Exitable {
    public ExitRoom(String name) {
        super(name);
    }

    @Override
    public String getDescription() {
        return "Ves una puerta que lleva hacia afuera. Esta es tu oportunidad de escapar.";
    }

    @Override
    public String exit(Player player) {
        return "¡Has salido del laberinto! ¡Felicidades!";
    }
}