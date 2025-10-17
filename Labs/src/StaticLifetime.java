public class StaticLifetime {
    static int counter =0;

    void incrementCounter() {
        counter++;
        System.out.println("Counter = " + counter);
    }

    public static void main(String[] args) {
        StaticLifetime obj1 = new StaticLifetime();
        StaticLifetime obj2 = new StaticLifetime();

        obj2.incrementCounter();
        obj1.incrementCounter();

    }
}