package HomeworkProject.Task2;

// TreatmentRequest class
public class TreatmentRequest {
    private int patientId;
    private long arrivalTime;
    private boolean isPriority;

    // TreatmentRequest constructor
    public TreatmentRequest(int patientId, long arrivalTime, boolean isPriority) {
        this.patientId = patientId;
        this.arrivalTime = arrivalTime;
        this.isPriority = isPriority;
    }

    // Getters and setters
    public int getPatientId() {
        return this.patientId;
    }

    public long getArrivalTime() {
        return this.arrivalTime;
    }

    public boolean getIsPriority() {
        return this.isPriority;
    }

    public void setPatientId(int newPatientId) {
        this.patientId = newPatientId;
    }

    public void setArrivalTime(long newArrivalTime) {
        this.arrivalTime = newArrivalTime;
    }

    public void setIsPriority(boolean newIsPriority) {
        this.isPriority = newIsPriority;
    }

    // toString method
    @Override
    public String toString() {
        return "* Patient's ID: " + patientId + ", Arrival Time: " + arrivalTime + ", Priority: " + isPriority + " *";
    }
}
