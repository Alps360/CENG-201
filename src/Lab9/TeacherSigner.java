package Lab9;

public class TeacherSigner {
    private static final int N = 3233;
    private static final int E = 17;
    private static final int D = 2753;

    public static int simpleHash(String message) {
        int hash = 0;
        for (int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);
            hash = (hash + c) % 1000;
        }
        return hash;
    }

    public static int modPow(int base, int exponent, int mod) {
        long result = 1;
        long b = base % mod;
        int e = exponent;

        while (e > 0) {
            if ((e & 1) == 1) {
                result = (result * b) % mod;
            }
            b = (b * b) % mod;
            e = e >> 1;
        }

        return (int) result;
    }

    public static int signHash(int hashValue) {

        return modPow(hashValue, D, N);
    }

    public static int signMessage(String message) {
        int h = simpleHash(message);
        return signHash(h);
    }

    public static void main(String[] args) {
        String message = "Exam will be on Friday at 10:00.";

        int hashValue = simpleHash(message);
        int signature = signMessage(message);

        System.out.println("=== TEACHER SIDE ===");
        System.out.println("Message to send to students:");
        System.out.println(message);
        System.out.println();
        System.out.println("Internal hash (for teacher info): " + hashValue);
        System.out.println("Signature to send to students  : " + signature);

        System.out.println();
        System.out.println("Public key (students can know this) (N:modulus E:Public key):");
        System.out.println("N = " + N + ", E = " + E);
    }
}

