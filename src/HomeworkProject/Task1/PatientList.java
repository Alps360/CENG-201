package HomeworkProject.Task1;

// Patient list class
public class PatientList {
    Node head;
    Node tail;

    // Patient list constructor
    public PatientList() {
        this.head = null;
    }

    // addPatient method, time complexity = O(1)
    public void addPatient(Patient person) {
        Node newNode = new Node(person);

        if (head == null) {
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }

        System.out.println("Added: " + person.getName());
    }

    // removePatient method, time complexity = O(n)
    public void removePatient(int id) {
        Node current = head;

        while(current != null && current.data.getId() == id) {
            current = current.next;
        }

        if(current == null) {
            System.out.println("Patient ID: " + id + " not found.");
            return;
        }

        if(current.prev != null) {
            current.prev.next = current.next;
        }
        else {
            head = current.next;
        }

        if(current.next != null) {
            current.next.prev = current.prev;
        }
        else {
            tail = current.prev;
        }

        System.out.println("Removed patient, Name: " + current.data.getName() + " ID: " + id);
    }

    // findPatient method, time complexity = O(n)
    public Patient findPatientin(int id) {
        Node current = head;

        while(current != null) {
            if(current.data.getId() == id) {
                return current.data;
            }
            current = current.next;
        }

        return null;
    }    

    // printList method
    public void printList() {
        Node current = head;

        if (current == null) {
            System.out.println("The patient list is empty.");
            return;
        }

        System.out.println("\n*** Current Patient List ***");
        while(current != null) {
            System.out.println(current.data);
            current = current.next;
        }

        System.out.println("****************************");
    }
}