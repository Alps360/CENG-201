package HomeworkProject.Task3;

// DischargeStack Class
public class DischargeStack {
    private DischargeStackNode top;

    // constructor
    public DischargeStack() {
        top = null;
    }

    // push method, time complexity = O(1)
    public void push(DischargeRecord record) {
        DischargeStackNode temp = new DischargeStackNode(record);
        temp.next = top;
        top = temp;
    }

    // pop method , time complexity = O(1)
    public DischargeRecord pop() {
        if(top == null) {
            System.out.println("Stack Underflow");
            return null;
        }

        DischargeStackNode temp = top;
        top = top.next;
        DischargeRecord record = temp.data;

        temp = null;
        return record;
    }

    // peek method, time complexity = O(1)
    public DischargeRecord peek() {
        if(top == null) {
            System.out.println("There are no records.");
            return null;
        }

        return top.data;
    }

    // printStack method
    public void printStack() {
        if(top == null) {
            System.out.println("There are no records.");
            return;
        }

        DischargeStackNode current = top;
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
