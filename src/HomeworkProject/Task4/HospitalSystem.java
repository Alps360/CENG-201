package HomeworkProject.Task4;

import HomeworkProject.Task1.*;
import HomeworkProject.Task2.*;
import HomeworkProject.Task3.*;

import java.util.HashMap;

public class HospitalSystem {
    PatientList patientList = new PatientList();
    TreatmentQueue normalTreatmentQueue = new TreatmentQueue();
    TreatmentQueue priorityTreatmentQueue = new TreatmentQueue();
    DischargeStack dischargeStack = new DischargeStack();
    HashMap<Integer, Patient> patientLookUp = new HashMap<>();

    public void addPatient(Patient patient) {
        if(patientLookUp.containsKey(patient.getId())) {
            System.out.println("Error Id: " + patient.getId() + " already exists.");
            return;
        }
        patientList.addPatient(patient);
        patientLookUp.put(patient.getId(), patient);
    }

    public void addTreatmentRequest(int id, long arrivalTime, boolean isPriority ) {
        if (!patientLookUp.containsKey(id)) {
            System.out.println("Error Id: " + id + " does not exists.");
            return;
        }

        TreatmentRequest request = new TreatmentRequest(id, arrivalTime, isPriority );

        if(isPriority) {
            priorityTreatmentQueue.enqueue(request);
        }
        else {
            normalTreatmentQueue.enqueue(request);
        }
    }

    public void processTreatment() {
        TreatmentRequest request = null;
        
        if(priorityTreatmentQueue.size() > 0) {
            request = priorityTreatmentQueue.dequeue();
        }
        else if(normalTreatmentQueue.size() > 0) {
            request = normalTreatmentQueue.dequeue();
        }

        if(request != null) {
            dischargeStack.push(new DischargeRecord(request.getPatientId(), request.getArrivalTime()));
            patientList.removePatient(request.getPatientId());
            patientLookUp.remove(request.getPatientId());
        }
    }

    public void printSortedPatients() {
        System.out.println("\n*** Patients Sorted by Severity ***");
        patientList.sortBySeverity();
        patientList.printList();
    }

    public void printHospitalSystemState() {
        patientList.printList();
        System.out.println("*** Pending Priority Requests ***");
        System.out.println(priorityTreatmentQueue.size());
        System.out.println("*** Pending Normal Requests ***");
        System.out.println(normalTreatmentQueue.size());
        System.out.println("*** Discharge History ***");
        dischargeStack.printStack();
    }
}
