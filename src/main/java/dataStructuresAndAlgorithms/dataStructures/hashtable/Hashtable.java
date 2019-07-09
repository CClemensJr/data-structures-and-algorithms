package dataStructuresAndAlgorithms.dataStructures.hashtable;

public class Hashtable {
/****************
 * Instance Variables
 * */
    private Node[] map;


/****************
 * Constructors
 * */
    public Hashtable (int size) {
        this.map = new Node[size];
    }


/****************
 * Setters/Getters
 * */
    public Node[] getMap() { return this.map; }


/****************
 * Instance Methods
 * */
    // add: takes in both the key and value. This method should hash the key, and add the key and value pair to the table,
    // handling collisions as needed.
    public void add (String key, String value) {

    }

    // get: takes in the key and returns the value from the table.
    public String get (String key) {
        try {
            int index  = this.hash(key);

            if (this.map[index] != null) return this.map[index].getValue();

        } catch (Exception err) {

            System.out.println("An error has occurred: " + err);
        }

        return null;
    }


    // contains: takes in the key and returns a boolean, indicating if the key exists in the table already.
    public boolean contains (String key) {
        try {
            int index  = this.hash(key);

            if (this.map[index] != null) return true;

        } catch (Exception err) {

            System.out.println("An error has occurred: " + err);
        }

        return false;
    }


    // hash: takes in an arbitrary key and returns an index in the collection.
    public int hash (String key) {
        try {
            int index = 0;
            char[] keyCharacters = key.toCharArray();

            for (int i = 0; i < this.map.length; i++) {
                index += keyCharacters[i];
            }

            index = (index * 2048) % this.map.length;

            return index;
        } catch (Exception err) {

            System.out.println("An error has occurred: " + err);
        }

        return 0;
    }
}
