package Lab9;

public class StudentVerifier {
    private static final int N = 3233;
    private static final int E = 17;

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

    public static boolean verifyMessage(String message, int signature) {
        int hashFromMessage = simpleHash(message);

        int hashFromSignature = modPow(signature, E, N);

        return hashFromMessage == hashFromSignature;
    }

    public static void main(String[] args) {
        String receivedMessage = "Exam will be on Friday at 10:00.";
        int receivedSignature = 330;

        System.out.println("=== STUDENT SIDE ===");
        System.out.println("Received message  : " + receivedMessage);
        System.out.println("Received signature: " + receivedSignature);

        boolean isValid = verifyMessage(receivedMessage, receivedSignature);

        System.out.println("\nIs the message valid (from the real teacher)? " + isValid);

        String tamperedMessage = "Exam will be on Monday at 10:00.";
        boolean isValidTampered = verifyMessage(tamperedMessage, receivedSignature);
        System.out.println("\nIf someone changes the message to:");
        System.out.println(tamperedMessage);
        System.out.println("Is it still valid with the same signature? " + isValidTampered);
    }
}

