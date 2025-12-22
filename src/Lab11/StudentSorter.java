package Lab11;

public class StudentSorter {

    /*
     * Student Side (Exercise):
     *
     * Goal:
     * You will implement Insertion Sort for an array of Student objects.
     * The same method should be able to sort in two different ways:
     *   - byGrade = true  -> sort by grade (ascending)
     *   - byGrade = false -> sort by studentId (ascending)
     *
     * What you need to do:
     * 1) Complete the insertion sort logic inside the loop.
     * 2) Use the byGrade flag to decide which field to compare.
     *
     * Important note about stability:
     * When sorting by grade, we want a STABLE sort.
     * That means if two students have the same grade, their relative order
     * (who appeared first in the original list) should stay the same.
     * To keep it stable, only shift when the left student's grade is STRICTLY greater:
     *     students[j].grade > key.grade
     * Do NOT use >=, because that would move equal-grade students and break stability.
     */
    public static void insertionSortStudent(Student[] students, boolean byGrade) {
        for (int i = 1; i < students.length; i++) {
            Student key = students[i];
            int j = i - 1;

            if (byGrade) {
                while (j >= 0 && students[j].getGrade() > key.getGrade()) {
                    students[j + 1] = students[j];
                    j--;
                }
            } else {
                while (j >= 0 && students[j].getStudentId() > key.getStudentId()) {
                    students[j + 1] = students[j];
                    j--;
                }
            }
            students[j + 1] = key;
        }
    }


    //EXERCISE-2-
    // Binary Insertion Sort:
    // - Find insert position using binary search on the sorted left part [0..i-1]
    // - Shift elements to make room
    // - Insert key
    //
    // byGrade = true  -> sort by grade (ascending, stable)
    // byGrade = false -> sort by studentId (ascending)
    public static void binaryInsertionSortStudent(Student[] students, boolean byGrade) {
        // Step 1: start from the second element
        for (int i = 1; i < students.length; i++) {
            // Step 2: store the current student
            Student key = students[i];

            // Step 4: find insertion position in [0..i-1]
            int pos = binarySearchInsertPos(students, key, 0, i - 1, byGrade);

            // Step 5: shift elements to make room
            for (int j = i - 1; j >= pos; j--) {
                students[j + 1] = students[j];
            }

            // Step 6: insert the student
            students[pos] = key;
        }
    }

    // Returns insertion index in sorted range [left..right].
    // This version is STABLE: it returns the position AFTER the last equal element (upper bound).
    private static int binarySearchInsertPos(Student[] a, Student key, int left, int right, boolean byGrade) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            boolean goRight;
            if (byGrade) {
                goRight = a[mid].getGrade() <= key.getGrade();
            } else {
                goRight = a[mid].getStudentId() <= key.getStudentId();
            }

            if (goRight) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}
