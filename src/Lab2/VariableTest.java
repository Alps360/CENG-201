package Lab2;
public class VariableTest {
    int instanceVar = 10;

    public void printInstanceVar () {
        System.out.println("Instance variable inside method: " + instanceVar);
        int localVar = 5;
        System.out.println("Local variable inside method: " +localVar);
    }

    public static void main(String[] args) {
        VariableTest obj = new VariableTest();    
        obj.printInstanceVar();
    }
}
