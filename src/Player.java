import java.util.ArrayList;

public class Player {
    private int score;
    private ArrayList<String> inventory;

    public Player() {
        this.score = 0;
        this.inventory = new ArrayList<>();
    }

    public void addToInventory(String item) {
        inventory.add(item);
    }

    public void addToScore(int points) {
        score += points;
    }

    public String getInventory() {
        if (inventory.isEmpty()) {
            return "Tu inventario está vacío.";
        }
        return String.join(", ", inventory);
    }

    public int getScore() {
        return score;
    }
}