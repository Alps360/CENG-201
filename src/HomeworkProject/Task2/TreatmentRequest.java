package HomeworkProject.Task2;

// TreatmentRequest class
public class TreatmentRequest {
    private int patientId;
    private long arrivalTime;

    // TreatmentRequest constructor
    public TreatmentRequest(int patientId, long arrivalTime) {
        this.patientId = patientId;
        this.arrivalTime = arrivalTime;
    }

    // Getters and setters
    public int getPatientId() {
        return patientId;
    }

    public long getArrivalTime() {
        return arrivalTime;
    }

    public void setPatientId(int newPatientId) {
        this.patientId = newPatientId;
    }

    public void setArrivalTime(long newArrivalTime) {
        this.arrivalTime = newArrivalTime;
    }

    // toString method
    @Override
    public String toString() {
        return "Patient Id: " + patientId + " Arrival Time: " + arrivalTime;
    }
}
