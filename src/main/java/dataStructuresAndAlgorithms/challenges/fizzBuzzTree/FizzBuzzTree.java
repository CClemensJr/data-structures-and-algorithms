package dataStructuresAndAlgorithms.challenges.fizzBuzzTree;

import dataStructuresAndAlgorithms.dataStructures.tree.*;


// Vinh helped me out with this solution
public class FizzBuzzTree<T> {

    /**
     * This method takes a tree and sends it to the setNodes function if  not null
     * @param tree
     */
    public static void fizzBuzzTree(BinaryTree tree) {
        try {
            if (tree != null && tree.getRoot() != null) { setNodes(tree.getRoot()); }

        } catch (Exception e) {

            System.out.println("An error has occurred: " + e);
        }

    }


    /**
     * This method recursively takes a root node, sends it to the check values method, and then sets the value accordingly.
     * @param root
     */
    public static void setNodes(Node root) {
        try {
            root.setValue(checkValues(root.getValue()));

            setNodes(root.getLeftChild());
            setNodes(root.getRightChild());

        } catch (Exception e) {

            System.out.println("An error has occurred: " + e);
        }
    }


    /**
     * This method takes a value, converts it to "Fizz" "Buzz" or "FizzBuzz" if divisible by 3, 5, or 15, and then sends it back to the setNodes method.
     * @param value
     * @return
     */
    public static Object checkValues(Object value) {
        try {
            if ((int) value % 5 == 0 && (int) value % 3 == 0 ) { value = "FizzBuzz"; }
            else if ((int) value % 3 == 0) { value = "Fizz"; }
            else if ((int) value % 5 == 0) { value = "Buzz"; }

            return value;

        } catch (Exception e) {

            System.out.println("An error has occurred: " + e);
        }

        return value;
    }
}
