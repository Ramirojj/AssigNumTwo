

import java.util.ArrayList;

public class Player {
    private int score;
    private ArrayList<String> inventory;

    public Player() {
        this.score = 0;
        this.inventory = new ArrayList<>();//Player investory represented as a list of strings
    }

    public void addToInventory(String item) {
        inventory.add(item);
    }

    public void addToScore(int points) {
        score += points;
    }



    public String getInventory() {
        if (inventory.isEmpty()) {
            return "Inventory is empty .";
        }
        return String.join(", ", inventory);
    }

    public int getScore() {
        return score;
    }
}