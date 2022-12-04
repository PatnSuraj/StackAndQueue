//package Labs.Lab3Fall2020.StudentFiles;

import java.util.ArrayList;

/**
 * basic stack example
 * References: https://en.wikipedia.org/wiki/Stack_(abstract_data_type), Class notes
 * @param <T>
 */

// Generic stack class
public class GenericStack<T> {
    // Instance variable
    private ArrayList<T> storage;

    // Constructor
    public GenericStack() {
        storage = new ArrayList<T>();
    }

    //YOUR WORK STARTS HERE

    // Returns the size of a stack
    public int size() { return storage.size(); }

    // Returns the primary value of stack
    public T peek() { return storage.get(size()-1); }

    // Removes the value from stack
    public T pop() { return storage.remove(storage.size()-1); }

    // Adds the element to the stack
    public void push (T element) { storage.add(element); }

    // Returns nothing by making the stack empty
    public boolean isEmpty() { return size() == 0; }
}











