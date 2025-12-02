package Lab2;

class Student {
    String name;
    int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", id=" + id + "]";
    }
}

public class ReferenceDemonstration {

    public static void makeChanges(int number, Student studentParam) {

        System.out.println("--- Inside Method: Start ---");
        System.out.println("Parameter Student (studentParam) reference/value: " + studentParam);
        System.out.println("Parameter int (number) value: " + number);

        number = 99;
        System.out.println("\n*** Primitive Type Change (number = 99) ***");
        System.out.println("Inside Method New int Value (number): " + number);

        studentParam.name = "Ayşe";
        studentParam.id = 101;
        System.out.println("\n*** Changing the Object's Content (studentParam.name = Ayşe) ***");
        System.out.println("Inside Method Student Object State: " + studentParam);


        studentParam = new Student("NEW OBJECT", 555);
        System.out.println("\n*** Re-directing the Local Reference ***");
        System.out.println("Inside Method New Reference State: " + studentParam);

        System.out.println("--- Inside Method: End ---");
    }

    public static void main(String[] args) {

        int x = 10;


        Student student1 = new Student("Ahmet", 100);

        makeChanges(x, student1);

        System.out.println("\n--- AFTER METHOD CALL STATE ---");

        System.out.println("RESULT 1 (int): main: x = " + x + " (Did NOT change!)");

        System.out.println("RESULT 2 (Object Content): main: student1 = " + student1 + " (Content CHANGED!)");

        System.out.println("---------------------------------");
    }
}
