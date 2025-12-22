package HomeworkProject.Task3;

// Node class
public class DischargeStackNode {
    public DischargeRecord data;
    public DischargeStackNode next;

    public DischargeStackNode(DischargeRecord record) {
        data = record;
        next = null;
    }
}
