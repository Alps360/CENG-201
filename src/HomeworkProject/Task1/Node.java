package HomeworkProject.Task1;

// Node class
public class Node {
    Patient data;
    Node next;
    Node prev;

    public Node(Patient data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
