package one;

public class HashTable {
    private int size = 0;
    private String[] fr;
    private String[] eng;

    public HashTable(int capacity) {

        fr = new String[capacity];
        eng = new String[capacity];

    }


    public void put(String key, String value) {
        //is hashtable full?

        if ( size == fr.length )
        {
            System.out.println("Hash table is full");
            return;
        }


        //use hash function to convert key to hash index

        int index = hashFunction(key);


        //add new value to the array at the computed position

        fr[index] = key;
        eng[index] = value;
        size++;

        System.out.println("Putting " + key + " is successful.");


    }

    public int getSize() {

        return size;

    }

    public int hashFunction(String key) {

        int hash = (key.hashCode() & 0x7FFFFFF) % eng.length;
        return hash;

    }

    public void printHashTable() {

        System.out.println("--- Hash Table ---");

        for (int i = 0; i < fr.length; i++)
        {
            System.out.println( i+" "+fr[i] + " " + eng[i]);
        }

    }
}
