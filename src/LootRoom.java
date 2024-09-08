public class LootRoom extends Room implements Lootable {
    public LootRoom(String name) {
        super(name);
    }

    @Override
    public String getDescription() {
        return "You are in the mistery room.";
    }

    @Override
    public String loot(Player player) {
        player.addToInventory("Fire sword");
        player.addToScore(100);
        return "¡You got the sword! and 100 points!";
    }
}
