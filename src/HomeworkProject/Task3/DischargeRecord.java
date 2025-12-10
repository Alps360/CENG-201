package HomeworkProject.Task3;

public class DischargeRecord {
    private int patientId;
    private long dischargeTime;

    public DischargeRecord(int patientId, long dischargeTime) {
        this.patientId = patientId;
        this.dischargeTime = dischargeTime;
    }

    public int getPatientId() {
        return patientId;
    }

    public long getDischargeTime() {
        return dischargeTime;
    }

    public void setPatientId(int newPatientId) {
        this.patientId = newPatientId;
    }

    public void setDischargeTime(long newDischargeTime) {
        this.dischargeTime = newDischargeTime;
    }

    @Override
    public String toString() {
        return "Patient Id: " + patientId + " discharge time: " + dischargeTime;
    }
}
