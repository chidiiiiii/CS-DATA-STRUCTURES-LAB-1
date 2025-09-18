/*
 * QueueCharArray.java
 * fall 2025
 * prof. lehman
 * Chidi Emenike
 *
 * Queue approach has first and last pointers
 * to first and last elements in array.
 * The variable size is used to denote
 * an empty vs. full queue.
 */
public class QueueCharArray {

    // data
    char data[];
    int front;
    int back;
    int size;
    int MAX;

    // default constructor
    public QueueCharArray() {
        MAX = 5;
        data = new char[MAX];
        front = 0;
        back = -1;
        size = 0;
    }

    // alternate constructor
    public QueueCharArray(int m) {
        MAX = m;
        data = new char[MAX];
        front = 0;
        back = -1;
        size = 0;
    }

    // delete all items in queue
    public void clear() {
        front = 0;
        back = -1;
        size = 0;
    }

    // add to back of queue
    public void add(char v) {
        if (!full()) {
            back = (back + 1) % MAX;
            data[back] = v;
            size++;
        }
    }

    // see if queue is empty
    public boolean empty() {
        return size == 0;
    }

    // see if queue is full
    public boolean full() {
        return size == MAX;
    }

    // return element from front of queue
    public char front() {
        if (!empty()) {
            return data[front];
        }
        return '?'; // replaced 'X' with '?'
    }

    // remove element from front of queue
    public boolean remove() {
        if (!empty()) {
            front = (front + 1) % MAX;
            size--;
            return true;
        }
        return false;
    }

    // return number of elements in queue
    public int size() {
        return size; // replaced -1 with actual queue size
    }

    /**
     * use with println to display queue
     * 
     * @return queue as a String
     */
    public String toString() {
        if (empty()) {
            return "QUEUE: [empty]";
        }

        String result = "QUEUE: ";
        int idx = front;

        for (int i = 0; i < size; i++) {
            result = result + data[idx] + " ";
            idx = (idx + 1) % MAX;
        }

        return result.trim();
    }
}
