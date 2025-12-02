package Lab3;

public class GrowthRateCounter {
    public static void main(String[] args) {
        int[] sizes = {10, 50, 100, 200, 400, 800};

        System.out.printf("%-8s%-12s%-12s%-12s%-12s%-12s\n",
                "n", "log n", "n", "n log n", "n^2", "n^3");

        for (int n : sizes) {

            long logN = countLogN(n);
            long nLinear = countN(n);
            long nLogN = countNLogN(n);
            long nSquare = countN2(n);
            long nCube = countN3(n);

            System.out.printf("%-8d%-12d%-12d%-12d%-12d%-12d\n",
                    n, logN, nLinear, nLogN, nSquare, nCube);
        }
    }

    static long countLogN(int n) {
        long count = 0;
        for (int i = n; i > 1; i /= 2) count++;  //logn
        return count;
    }

    static long countN(int n) {
        long count = 0;
        for (int i = 0; i < n; i++) count++;  //n
        return count;
    }

    static long countNLogN(int n) {
        long count = 0;
        for (int i = 0; i < n; i++)   //n
            for (int j = n; j > 1; j /= 2) //logn
                count++;
        return count;
    }

    static long countN2(int n) {  //n^2
        long count = 0;
        for (int i = 0; i < n; i++)   //n
            for (int j = 0; j < n; j++)    //n
                count++;
        return count;
    }

    static long countN3(int n) {   //n^3
        long count = 0;
        for (int i = 0; i < n; i++)  //n
            for (int j = 0; j < n; j++)   //n
                for (int k = 0; k < n; k++)   //n
                    count++;
        return count;
    }
}



