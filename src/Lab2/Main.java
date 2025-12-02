package Lab2;

public class Main {
    public static void main(String[] args) {

        ClassCreator firstObject = new ClassCreator();
        ClassCreator secondObject = new ClassCreator();
        firstObject.data=6;
        secondObject.data=7;
        firstObject =secondObject;
        firstObject.data=8;
        System.out.printf(String.valueOf(secondObject.data));

    }
}