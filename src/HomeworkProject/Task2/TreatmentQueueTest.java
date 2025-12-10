package HomeworkProject.Task2;

public class TreatmentQueueTest {
    public static void main(String[] args) {
        TreatmentQueue tQueue = new TreatmentQueue();
        System.out.println("Queue size: " + tQueue.size());

        tQueue.enqueue(new TreatmentRequest(101, 100000L));
        tQueue.enqueue(new TreatmentRequest(102, 200000l));
        tQueue.enqueue(new TreatmentRequest(103, 300000L));
        tQueue.enqueue(new TreatmentRequest(104, 400000L));
        tQueue.enqueue(new TreatmentRequest(105, 500000L));
        tQueue.enqueue(new TreatmentRequest(106, 600000L));
        tQueue.enqueue(new TreatmentRequest(107, 700000));
        tQueue.enqueue(new TreatmentRequest(108, 800000));

        System.out.println("Queue size: " + tQueue.size());

        tQueue.dequeue();
        tQueue.dequeue();
        tQueue.dequeue();

        System.out.println("Queue size: " + tQueue.size());

        tQueue.printQueue();
    }
}
