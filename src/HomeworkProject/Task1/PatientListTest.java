package HomeworkProject.Task1;

public class PatientListTest {
    public static void main(String[] args) {
        PatientList  plist = new PatientList();

        plist.addPatient(new Patient(101, "John Doe", 5, 25));
        plist.addPatient(new Patient(102, "Lorem Ipsum", 10, 30));
        plist.addPatient(new Patient(103, "Sponge Bob", 6, 20));
        plist.addPatient(new Patient(104, "Patrick Star", 9, 21));
        plist.printList();
    }
}
