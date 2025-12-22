package HomeworkProject.Task2;

public class TreatmentQueueTest {
    public static void main(String[] args) {
        TreatmentQueue tQueue = new TreatmentQueue();
        System.out.println("Queue size: " + tQueue.size());

        tQueue.enqueue(new TreatmentRequest(101, 1000L, true));
        tQueue.enqueue(new TreatmentRequest(102, 2000L, true));
        tQueue.enqueue(new TreatmentRequest(103, 2200L, true));
        tQueue.enqueue(new TreatmentRequest(104, 1800L, true));
        tQueue.enqueue(new TreatmentRequest(105, 2030L, false));
        tQueue.enqueue(new TreatmentRequest(106, 1030L, false));
        tQueue.enqueue(new TreatmentRequest(107, 830L, false));
        tQueue.enqueue(new TreatmentRequest(108, 900L, false));

        System.out.println("Queue size: " + tQueue.size());

        tQueue.dequeue();
        tQueue.dequeue();
        tQueue.dequeue();

        System.out.println("Queue size: " + tQueue.size());

        tQueue.printQueue();
    }
}
