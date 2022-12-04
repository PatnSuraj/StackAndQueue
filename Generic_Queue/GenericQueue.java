//package Labs.Lab3Fall2020.StudentFiles;

/**
 This class tests the code for Lab2: Exercise4. It describes a simple
 GenericQueue class using generics.
 It expands upon a framework provided by Srini.
 */

import java.util.ArrayList;

public class GenericQueue<T>{
    // declare all required fields
    private ArrayList<T> queue;
    private int size;
    private int cursor;

    /**
     Constructor 1
     No args.
     */
    public GenericQueue(){
        queue = new ArrayList<>();
        size = 0;
        cursor = 0;
    }

    //YOUR WORK STARTS HERE

    // Returns the size of queue
    public int size() {
        return queue.size();
    }

    // Returns the primary value of the queue
    public T peek() {
        return queue.get(0);
    }

    // Removes the element
    public T dequeue() {
        return queue.remove(0);
    }

    // Adds the element
    public void enqueue(T element) {
        queue.add(element);
    }

    // Returns nothing by making the queue empty
    public boolean isEmpty() {
        return size() == 0;
    }

    // Clears everything
    public void clear() {
        queue.clear();
    }

    // Returns the position of specified item and -1 if not found
    public int positionOf(T item) {
        for(int Position=0;Position<queue.size();Position++) {
            if(item.equals(queue.get(Position))) { return Position; }
        }
        return -1;
    }

    // Removes the first occurrence of specified item
    public void remove(T item) {
        for(int First_occurrence=0;First_occurrence<queue.size();First_occurrence++) {
            if (item.equals(queue.get(First_occurrence))) { queue.remove(First_occurrence); }
        }
    }

    // Returns the first item in the Queue, null if empty
    public T first() {
        if (queue.size() != 0) { return queue.get(cursor); }
        else { return null; }
    }

    //  Return the next item in the Queue relative to the previous call and null if empty
    public T next() {
        if(cursor < queue.size()) { return queue.get(cursor); }
        else { return null; }
    }
}


