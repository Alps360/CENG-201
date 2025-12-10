package Lab7;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        int[] data = {50, 30, 70, 20, 40, 60, 80, 35, 45, 65};
        
        for (int v : data) tree.insert(v);
        AsciiTreePrinter.print(tree.root);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to insert into the Binary Search Tree: ");
        int userNum = sc.nextInt();
        tree.insert(userNum);

        System.out.println(" Binary Search Tree after inserting " + userNum + ":");
        AsciiTreePrinter.print(tree.root);

        System.out.println("Search 45: " + (tree.search(45) ? "Found" : "Not found"));

        tree.delete(30);
        System.out.println(" Binary Search Tree after deleting 30:");
        AsciiTreePrinter.print(tree.root);
        System.out.println();
    }
}

