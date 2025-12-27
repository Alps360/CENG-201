package HomeworkProject.Task3;

// DischargeRecord class
public class DischargeRecord {
    private int patientId;
    private long dischargeTime;

    // constructor
    public DischargeRecord(int patientId, long dischargeTime) {
        this.patientId = patientId;
        this.dischargeTime = dischargeTime;
    }

    // Getters and setters
    public int getPatientId() {
        return this.patientId;
    }

    public long getDischargeTime() {
        return this.dischargeTime;
    }

    public void setPatientId(int newPatientId) {
        this.patientId = newPatientId;
    }

    public void setDischargeTime(long newDischargeTime) {
        this.dischargeTime = newDischargeTime;
    }

    // toString method
    @Override
    public String toString() {
        return "* Patient's ID: " + patientId + ", Discharge Time: " + dischargeTime + " *";
    }
}
