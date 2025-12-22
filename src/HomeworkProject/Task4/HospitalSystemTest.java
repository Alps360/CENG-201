package HomeworkProject.Task4;

import HomeworkProject.Task1.Patient;
import HomeworkProject.Task3.DischargeRecord;

public class HospitalSystemTest {
    public static void main(String[] args) {
        HospitalSystem hospitalSystem = new HospitalSystem();

        hospitalSystem.addPatient(new Patient(101, "Sponge Bob", 10, 20));
        hospitalSystem.addPatient(new Patient(102, "Patrick Star", 6, 25));
        hospitalSystem.addPatient(new Patient(103, "Mr Crabs", 4, 30));
        hospitalSystem.addPatient(new Patient(104, "Ryan Gosling", 6, 32));
        hospitalSystem.addPatient(new Patient(105, "John Cena", 10, 40));
        hospitalSystem.addPatient(new Patient(106, "Hüseyin Alp", 10, 20));
        hospitalSystem.addPatient(new Patient(107, "John Doe", 6, 22));
        hospitalSystem.addPatient(new Patient(108, "Lorem Ipsum", 8, 18));
        hospitalSystem.addPatient(new Patient(109, "Memento Mori", 4, 90));
        hospitalSystem.addPatient(new Patient(110, "Veni Vidi Vici", 1, 23));

        hospitalSystem.addTreatmentRequest(101, 800, false);
        hospitalSystem.addTreatmentRequest(102, 900, false);
        hospitalSystem.addTreatmentRequest(103, 1000, false);
        hospitalSystem.addTreatmentRequest(104, 1100, false);
        hospitalSystem.addTreatmentRequest(105, 1200, false);

        hospitalSystem.addTreatmentRequest(108, 1300, true);
        hospitalSystem.addTreatmentRequest(109, 1400, true);
        hospitalSystem.addTreatmentRequest(110, 1500, true);

        hospitalSystem.dischargeStack.push(new DischargeRecord(106, 1600));
        hospitalSystem.dischargeStack.push(new DischargeRecord(107, 1700));

        hospitalSystem.processTreatment();
        hospitalSystem.processTreatment();
        hospitalSystem.processTreatment();
        hospitalSystem.processTreatment();

        hospitalSystem.printSortedPatients();

        hospitalSystem.printHospitalSystemState();
    }
}
