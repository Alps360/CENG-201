public class StaticLifetime {
    static int counter = 0;

    public void incrementCounter() {
        counter++;
        System.out.println("Counter value: " + counter);
    }

    public static void main(String[] args) {
        StaticLifetime obj1 = new StaticLifetime();
        StaticLifetime obj2 = new StaticLifetime();

        obj1.incrementCounter();
        obj2.incrementCounter();

    }
}