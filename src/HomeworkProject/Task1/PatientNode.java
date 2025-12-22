package HomeworkProject.Task1;

// Node class
public class PatientNode {
    Patient data;
    PatientNode next;
    PatientNode prev;

    public PatientNode(Patient data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
