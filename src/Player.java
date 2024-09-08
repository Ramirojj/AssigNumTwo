/*.  Basically this part of the code is
dedicated to managing the player's score by adding objects and points.*/

import java.util.ArrayList;

public class Player {
    private int score;
    private ArrayList<String> inventory;

    public Player() {
        this.score = 0;
        this.inventory = new ArrayList<>();//Player investory represented as a list of strings
    }
///////method to add an object to the inventory
    /*A method named addToInventory that accepts a
    String argument and adds it to the Player's inventory list.
     */
    public void addToInventory(String item) {
        inventory.add(item);
    }
    ///// method to add points  to the player's score
    /*A method named addToScore that accepts an int argument and adds it to the Player's score.*/
    public void addToScore(int points) {
        score += points;
    }


    //// method that returns a string with the inventory objects
    //// if the inventory is empty, returns a message indicating that
    /*A method named getInventory that returns a String.
     The String should contain the contents of the Player's */
    public String getInventory() {
        if (inventory.isEmpty()) {
            return "Inventory is empty .";
        }
        return String.join(", ", inventory);
    }
//// // method that returns the player's current score
    /*A method named getScore that return's the Player's score field (an int).*/
    public int getScore() {
        return score;
    }
}