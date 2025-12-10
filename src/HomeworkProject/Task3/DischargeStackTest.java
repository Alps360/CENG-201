package HomeworkProject.Task3;

public class DischargeStackTest {
    public static void main(String[] args) {
        DischargeStack dStack = new DischargeStack();

        dStack.printStack();

        dStack.push(new DischargeRecord(101, 3141592653589L));
        dStack.push(new DischargeRecord(102, 9223372036854775807L));
        dStack.push(new DischargeRecord(103, 123456789012L));
        dStack.push(new DischargeRecord(104, 500000000000L));
        dStack.push(new DischargeRecord(105, 0L));

        dStack.printStack();

        dStack.pop();
        dStack.pop();

        dStack.printStack();
    }
}
