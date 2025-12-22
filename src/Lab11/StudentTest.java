package Lab11;

import java.util.Arrays;

public class StudentTest {
    public static void main(String[] args) {
        // Create sample data
        // Note: s1 and s4 have the same grade to test stability and secondary sorting
        Student s1 = new Student(1, 103, "Alice", "Smith", 1, 85.5);
        Student s2 = new Student(2, 101, "Bob", "Jones", 2, 90.0);
        Student s3 = new Student(3, 105, "Charlie", "Brown", 1, 70.0);
        Student s4 = new Student(4, 102, "David", "White", 2, 85.5);
        Student s5 = new Student(5, 104, "Eve", "Black", 1, 95.0);

        Student[] students = {s1, s2, s3, s4, s5};

        System.out.println("--- Original Array ---");
        printArray(students);

        // Test 1: Student.insertionSort 
        // Logic: Sort by Grade (ASC), if equal then by StudentId (ASC)
        Student[] test1 = Arrays.copyOf(students, students.length);
        Student.insertionSort(test1);
        System.out.println("\n--- Test 1: Student.insertionSort (Grade ASC, then ID ASC) ---");
        printArray(test1);

        // Test 2: StudentSorter.insertionSortStudent (byGrade = true)
        // Logic: Sort by Grade (ASC), Stable (Original order preserved for equals)
        Student[] test2 = Arrays.copyOf(students, students.length);
        StudentSorter.insertionSortStudent(test2, true);
        System.out.println("\n--- Test 2: StudentSorter.insertionSortStudent (byGrade=true, Stable) ---");
        printArray(test2);

        // Test 3: StudentSorter.insertionSortStudent (byGrade = false)
        // Logic: Sort by StudentId (ASC)
        Student[] test3 = Arrays.copyOf(students, students.length);
        StudentSorter.insertionSortStudent(test3, false);
        System.out.println("\n--- Test 3: StudentSorter.insertionSortStudent (byGrade=false) ---");
        printArray(test3);

        // Test 4: StudentSorter.binaryInsertionSortStudent (byGrade = true)
        Student[] test4 = Arrays.copyOf(students, students.length);
        StudentSorter.binaryInsertionSortStudent(test4, true);
        System.out.println("\n--- Test 4: StudentSorter.binaryInsertionSortStudent (byGrade=true) ---");
        printArray(test4);

        // Test 5: StudentSorter.binaryInsertionSortStudent (byGrade = false)
        Student[] test5 = Arrays.copyOf(students, students.length);
        StudentSorter.binaryInsertionSortStudent(test5, false);
        System.out.println("\n--- Test 5: StudentSorter.binaryInsertionSortStudent (byGrade=false) ---");
        printArray(test5);

        // Test 6: studentInfo()
        System.out.println("\n--- Test 6: studentInfo() Output ---");
        System.out.println(s1.studentInfo());
    }

    private static void printArray(Student[] students) {
        for (Student s : students) {
            System.out.println(s);
        }
    }
}