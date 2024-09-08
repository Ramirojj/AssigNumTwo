
/* Basically in the room class we are dedicated to
managing the rooms and allowing movement between them, verifying possible exits.*/
public abstract class Room {
    protected String name;
    protected Room north, south, east, west, up, down;
/*A constructor that accepts a String for the name of the Room.*/
    public Room(String name) {
        this.name = name;
    }

    public abstract String getDescription();
//// Return methode  that must be implemented by subclasess/////////////////////////////////
    public Room getAdjoiningRoom(char direction) {
        switch (direction) {
            case 'n' : return north;
            case 's': return south;
            case 'e': return east;
            case 'w': return west;
            case 'u': return up;
            case 'd': return down;
            default: return null;
        }
    }
///// returns a string with the available directions of adjacent rooms/////

    public String getExits() {
        StringBuilder exits = new StringBuilder();
        if (north != null) exits.append("North ");
        if (south != null) exits.append("South ");
        if (east != null) exits.append("East ");
        if (west != null) exits.append("West ");
        if (up != null) exits.append("Up ");
        if (down != null) exits.append("Down ");
        return exits.toString().trim();
    }

    public String getName() {
        return name;
    }
////checking if the direction is valid
    /*A method named isValidDirection that accepts a char argument for the direction.
    If this Room is connected to another Room in the given direction, return true.
     Otherwise, return false.*/
    public boolean isValidDirection(char direction) {
        return getAdjoiningRoom(direction) != null;
    }
/*Six setter methods -- one for each direction --
 that accept a Room object and assign it to the appropriate field.
 */
    ////Methods to set the rooms in each direction////////////////////////
    public void setNorth(Room north) { this.north = north; }
    public void setSouth(Room south) { this.south = south; }
    public void setEast(Room east) { this.east = east; }
    public void setWest(Room west) { this.west = west; }
    public void setUp(Room up) { this.up = up; }
    public void setDown(Room down) { this.down = down; }
}
