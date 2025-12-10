package HomeworkProject.Task2;

// TreatmentQueue class
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

    // enqueue method, time complexity = O(1)
    public void enqueue(TreatmentRequest request) {
        Node  new_node = new Node(request);

        if(isEmpty()) {
            front = rear = new_node;
        }
        else {
            rear.next = new_node;
            rear = new_node;
        }

        queueSize++;
    }

    // dequeue method, time complexity = 0(1)
    public TreatmentRequest dequeue() {
        if(isEmpty()) {
            System.out.println("Queue Underflow");
            return null;
        }

        Node temp = front;
        TreatmentRequest removedData = temp.data;
        front = front.next;

        if(front == null) rear = null;

        queueSize--;
        return removedData;
    }

    // size method, time complexity = 0(1)
    public int size() {
        return queueSize;
    }

    // printQueue method
    public void printQueue() {
        if(isEmpty()) {
            System.out.println("Treatment Queue is empty.");
            return;
        }

        Node current = front;
        System.out.print("Treatment Queue Requests (Front -> Rear): ");
        while (current != null) {
            System.out.print(current.data.toString());
            if(current.next != null) {
                System.out.print(" -> ");
            }
            
            current = current.next;
        }

        System.out.println();
    }
}
