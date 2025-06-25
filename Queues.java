// Queue is an extension of Collection. It stores and processes the data in order, meaning elements are inserted
// at the end and removed at the front. (FIFO -> First In, First Out)
// Most implementations do not allow null elements, like PriorityQueue.
// It is commonly used for task scheduling, message passing, and buffer management in applications.
// It supports iterating through elements, the order of iteration depends on the implementation.

import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Queues {
    public static void main(String[] args) {
        System.out.println("Queue 1:");
        // An integer queue with a maximum capacity of 3 elements
        Queue<Integer> queue1 = new ArrayBlockingQueue<Integer>(3);

        // Throws NoSuchElementException, because the queue is empty.
        // System.out.println("Head of the queue is: " + queue1.element());

        queue1.add(10);     // Head is the front of the queue
        queue1.add(20);
        queue1.add(30);     // Tail is the last in the queue

        // Returns the element at the front of the queue without removing it
        System.out.println("Head of the queue is: " + queue1.element());

        // Adding a 4th element will cause an IllegalStateException
        try {
            queue1.add(40);
        } catch (IllegalStateException e) {
            System.out.println("Too many items in the queue.");
        }

        // Prints each value in the queue
        for (int value: queue1) {
            System.out.println("Queue Value: " + value);
        }

        //  Removes and returns the element at the front of the queue. If the queue is empty, it throws an exception.
        System.out.println("Removed from queue: " + queue1.remove());
        System.out.println("Removed from queue: " + queue1.remove());
        System.out.println("Removed from queue: " + queue1.remove());

        try {
            System.out.println("Removed from queue: " + queue1.remove());
        } catch (NoSuchElementException e) {
            System.out.println("Tried to remove too many items from the queue.");
        }

        // Code for 2nd queue example //
        System.out.println("\nQueue 2:");
        Queue<Integer> queue2 = new ArrayBlockingQueue<Integer>(3);

        // Returns the element at the front of the queue without removing it. If the queue is empty, it returns null.
        System.out.println("Queue 2 Peek: " + queue2.peek());

        queue2.add(40);
        queue2.add(50);
        queue2.add(60);

        // Prints each value in the queue
        for (int value: queue2) {
            System.out.println("Queue 2 Value: " + value);
        }

        // Attempts to add an element to the rear of the queue. If the queue is full, it returns false.
        if (queue2.offer(70) == false) {
            System.out.println("Offer failed to add fourth item for queue 2.");
        }

        // Removes and returns the element at the front of the queue. If the queue is empty, it returns null.
        System.out.println("Queue 2 Poll: " + queue2.poll());
        System.out.println("Queue 2 Poll: " + queue2.poll());
        System.out.println("Queue 2 Poll: " + queue2.poll());
        System.out.println("Queue 2 Poll: " + queue2.poll());       // Returns null because there is no fourth value to poll
    }
}
