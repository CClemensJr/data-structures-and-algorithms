package dataStructuresAndAlgorithms.challenges.treeIntersection;

import dataStructuresAndAlgorithms.dataStructures.hashtable.Hashtable;
import dataStructuresAndAlgorithms.dataStructures.tree.BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class TreeIntersection<T> {
    public List<T> treeIntersection(BinaryTree tree1, BinaryTree tree2) {
        try {
            List<T> tree1Values = tree1.preOrder(tree1.getRoot());
            List<T> tree2Values = tree2.preOrder(tree2.getRoot());
            List<T> commonValues = new ArrayList<>();

            int maxLength = (tree1Values.size() > tree2Values.size()) ? tree1Values.size() : tree2Values.size();

            for (int i = 0; i < maxLength; i++) {
                if (tree1Values.get(i) == tree2Values.get(i)) commonValues.add(tree1Values.get(i));
            }

            return commonValues;
        } catch (Exception err) {
            System.out.println("An error has occurred: " + err);
        }

        return null;
    }
}
