
/*. Lootable: Contains one method named loot that takes a Player object as an argument and returns a String.
The String will be displayed to the Player after they loot the Room.*/
public interface Interactable {
    String interact(Player player);
    // //takes a Player object as a parameter and returns a String that describes the interaction
}