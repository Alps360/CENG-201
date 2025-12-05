package HomeworkProject;

public class Patient {
    private int id;
    private String name;
    private int severity;
    private int age;

    public Patient(int id, String name, int severity, int age) {
        this.id = id;
        this.name = name;
        this.severity = severity;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSeverity() {
        return severity;
    }

    public int getAge() {
        return age;
    }

    public void setId(int newId) {
        this.id = newId;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setSeverity(int newSeverity) {
        this.severity = newSeverity;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Severity: " + severity + ", Age: " + age;
    }
}
