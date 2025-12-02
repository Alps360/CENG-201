package Lab2;

public class VariableScopeDemo {
    
    static int classVar = 100;
    
    String instanceVar = "Hello";
    public void scopeExample(int paramVar) {

        int localVar = 20;
        System.out.println("--- Inside scopeExample Method ---");

        System.out.println("Static Variable (classVar): " + classVar);
        System.out.println("Instance Variable (instanceVar): " + instanceVar);
        System.out.println("Local Variable - Method Scope(localVar): " + localVar);
        System.out.println("Local Varaible - Parameter Scope (paramVar): " + paramVar);

        if (localVar > 10) {

            int blockVar = 5;
            System.out.println("Local Variable - Block Scope (blockVar): " + blockVar);
        }

    }
    public static void main(String[] args) {

        System.out.println("Static Variable in main (classVar): " + classVar);

        VariableScopeDemo obj = new VariableScopeDemo();

        System.out.println("Instance Variable in main (obj.instanceVar): " + obj.instanceVar);
        obj.scopeExample(30);
    }
}
