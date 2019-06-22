package dataStructuresAndAlgorithms.dataStructures.tree;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchTree<T> extends BinaryTree {
/***************
 * Instance Variables
 * */
    private List treeList;

/***************
 * Constructors
 * */
    public BinarySearchTree() {}
    public BinarySearchTree(T value) { this.setRoot(value); }


/***************
 * Getters / Setters
 * */
    public List getTreeList() { return this.treeList; }

/***************
 * Instance methods
 * */
    public boolean contains(T value) {
        try {
            treeList = this.preOrder();

            if (treeList.contains(value)) return true;

            return false;

        } catch(Exception e) {
            System.out.println("An error has occurred: " + e);
        }

        return false;
    }
}
