package HomeworkProject.Task2;

// Node class
public class Node {
    TreatmentRequest data;
    Node next;
    Node(TreatmentRequest new_data) {
        data = new_data;
        next = null;
    }
}
