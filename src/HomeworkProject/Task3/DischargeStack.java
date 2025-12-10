package HomeworkProject.Task3;

public class DischargeStack {
    private Node top;

    public DischargeStack() {
        top = null;
    }

    public void push(DischargeRecord record) {
        Node temp = new Node(record);
        temp.next = top;
        top = temp;
    }

    public DischargeRecord pop() {
        if(top == null) {
            System.out.println("Stack Underflow");
            return null;
        }

        Node temp = top;
        top = top.next;
        DischargeRecord record = temp.data;

        temp = null;
        return record;
    }

    public DischargeRecord peek() {
        if(top == null) {
            System.out.println("There is no records.");
            return null;
        }

        return top.data;
    }

    public void printStack() {
        if(top == null) {
            System.out.println("There is no records.");
            return;
        }

        Node current = top;
        System.out.print("Records (Top > Bottom): ");
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) {
                System.out.println(" -> ");
            }
            
            current = current.next;
        }

        System.out.println();
    }
}
