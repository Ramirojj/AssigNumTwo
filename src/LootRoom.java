public class LootRoom extends Room implements Lootable {
    public LootRoom(String name) {
        super(name);
    }

    @Override
    public String getDescription() {
        return "Te encuentras en una habitación llena de cofres misteriosos.";
    }

    @Override
    public String loot(Player player) {
        player.addToInventory("Espada de fuego");
        player.addToScore(100);
        return "¡Has saqueado una Espada de fuego y ganado 100 puntos!";
    }
}
