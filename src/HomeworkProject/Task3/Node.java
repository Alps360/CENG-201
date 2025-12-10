package HomeworkProject.Task3;

public class Node {
    public DischargeRecord data;
    public Node next;

    public Node(DischargeRecord record) {
        data = record;
        next = null;
    }
}
