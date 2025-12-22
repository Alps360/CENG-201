package HomeworkProject.Task2;

// Node class
public class TreatmentQueueNode {
    TreatmentRequest data;
    TreatmentQueueNode next;
    TreatmentQueueNode(TreatmentRequest new_data) {
        data = new_data;
        next = null;
    }
}
