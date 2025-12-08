package HomeworkProject.Task2;

public class TreatmentQueue {
    private Node front;
    private Node rear;
    private int queueSize;
    
    public TreatmentQueue() {
        queueSize = 0;
        front = rear = null;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void enqueue(int requestId) {
        Node  new_node = new Node(requestId);

        if(isEmpty()) {
            front = rear = new_node;
        }
        else {
            rear.next = new_node;
            rear = new_node;
        }

        queueSize++;
    }

    public int dequeue() {
        if(isEmpty()) {
            System.out.println("Queue Underflow");
            return -1;
        }

        Node temp = front;
        int removedData = temp.data;
        front = front.next;

        if(front == null) rear = null;

        queueSize--;
        return removedData;
    }

    public int size() {
        return queueSize;
    }

    public void printQueue() {
        if(isEmpty()) {
            System.out.println("Treatment Queue is empty.");
            return;
        }

        Node current = front;
        System.out.print("Treatment Queue Requests (Front -> Rear): ");
        while (current != null) {
            System.out.print(current.data);
            if(current.next != null) {
                System.out.print(" -> ");
            }
            
            current = current.next;
        }

        System.out.println();
    }
}
