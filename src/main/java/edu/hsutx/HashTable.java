package edu.hsutx;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Todd Dole
 *
 * @param <V> - Type for the value portion of the Hash class
 */
public class HashTable<V> {

    // Node class for storing key-value pairs
    private static class Node<V> {
        String key;
        V value;


        Node(String key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    // Default initial capacity
    private static final int INITIAL_CAPACITY = 0;  // TODO - Pick an appropriate value for this
    private List<Node<V>>[] table; // Array of linked lists for chaining
    private int size;
    int collisions; //You can use this to keep track of how well your hash table is doing.  Each time you have a new collision, add 1
                    // Reset to 0 whenever you start to resize

    @SuppressWarnings("unchecked")
    public HashTable() {
        table = new LinkedList[INITIAL_CAPACITY];
        size = 0;
        collisions = 0;
    }

    // Basic hash function.  Returns an index value appropriate for table
    private int hashIndex(String key) {
        int hashCode = 0;
        // TODO - generate a hash code from key.
        // This is independent of the table size so do not use % in this function
        // Try to think through a scheme that will result in good distribution of hash codes
        // Do NOT use Java's built in hashCode() method
        // If your method generates numbers too large for int, you can change the variable types to long.
        // The function should return an int however, as table.length should never be too large for int.

        return hashCode % table.length;
    }

    // Method to put a key-value pair into the hash table
    public void put(String key, V value) {
        // TODO - Implement code
        // Make sure you add one to collisions if the new entry is a collision
    }

    // Method to get a value by its key
    public V get(String key) {
        // TODO - Implement code

        return null; // Key not found
    }

    // Method to remove a key-value pair
    public void remove(String key) {
        // TODO - Implement code
    }

    // Optional: Method to resize and rehash the table
    @SuppressWarnings("unchecked")
    private void resize() {
        // TODO - Implement code.  This one is optional, but good practice.
    }

    // Method to get the current size of the hash table
    public int size() {
        return size;
    }

    public int getCollisions() {
        return this.collisions;
    }
}
