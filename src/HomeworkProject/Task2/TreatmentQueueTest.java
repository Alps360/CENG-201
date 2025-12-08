package HomeworkProject.Task2;

public class TreatmentQueueTest {
    public static void main(String[] args) {
        TreatmentQueue tQueue = new TreatmentQueue();
        System.out.println("Queue size: " + tQueue.size());

        tQueue.enqueue(101);
        tQueue.enqueue(102);
        tQueue.enqueue(103);
        tQueue.enqueue(104);
        tQueue.enqueue(105);
        tQueue.enqueue(106);
        tQueue.enqueue(107);
        tQueue.enqueue(108);

        System.out.println("Queue size: " + tQueue.size());

        tQueue.dequeue();
        tQueue.dequeue();
        tQueue.dequeue();

        System.out.println("Queue size: " + tQueue.size());

        tQueue.printQueue();
    }
}
