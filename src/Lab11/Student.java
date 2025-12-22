package Lab11;

public class Student {
    private int rowNo;
    private int studentId;
    private String firstName;
    private String lastName;
    private int section;
    private double grade;

    public Student(int rowNo, int studentId, String firstName, String lastName, int section, double grade) {
        this.rowNo = rowNo;
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.section = section;
        this.grade = grade;
    }

    public int getStudentId() {
        return studentId;
    }

    public double getGrade() {
        return grade;
    }

    public String studentInfo() {
        return rowNo + "|" + studentId + "|" + firstName + "|" + lastName + "|" + section + "|" + grade;
    }

    public static void insertionSort(Student[] students) {
        for (int i = 1; i < students.length; i++) {
            Student key = students[i];
            int j = i - 1;

            // Sort by grade (primary) and studentId (secondary)
            while (j >= 0 && (students[j].grade > key.grade ||
                    (students[j].grade == key.grade && students[j].studentId > key.studentId))) {
                students[j + 1] = students[j];
                j = j - 1;
            }
            students[j + 1] = key;
        }
    }

    @Override
    public String toString() {
        return "Student{id=" + studentId + ", grade=" + grade + "}";
    }
}
