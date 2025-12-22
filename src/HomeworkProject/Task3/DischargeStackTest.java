package HomeworkProject.Task3;

public class DischargeStackTest {
    public static void main(String[] args) {
        DischargeStack dStack = new DischargeStack();

        dStack.printStack();

        dStack.push(new DischargeRecord(101, 1000L));
        dStack.push(new DischargeRecord(102, 1100L));
        dStack.push(new DischargeRecord(103, 1200L));
        dStack.push(new DischargeRecord(104, 1300L));
        dStack.push(new DischargeRecord(105, 1400L));

        dStack.printStack();

        dStack.pop();
        dStack.pop();

        dStack.printStack();
    }
}
