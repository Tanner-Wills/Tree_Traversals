import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
/**
 * pre-order, in-order, and post-order
 */
public class Traversals<T extends Comparable<? super T>> {

    /**
     * Pre Order Traversal
     */
    public List<T> preorder(TreeNode<T> root) {
        // C,L,R

        // Declare a new list
        List<T> returnVals = new ArrayList<T>();

        // Base Case
        if (root.getLeft() == null && root.getRight() == null) {
            returnVals.add(root.getData());
            return returnVals;

        // Recursive Method
        } else {
            returnVals.add(root.getData());
            List<T> leftVals = preorder(root.getLeft());
            List<T> rightVals = preorder(root.getRight());
            returnVals.addAll(leftVals);
            returnVals.addAll(rightVals);
            return returnVals;
        }
    }


    /**
     * In Order Traversal
     * */
    public List<T> inorder(TreeNode<T> root) {
        // L,C,R
        // Declare a new list
        List<T> returnVals = new ArrayList<T>();

        // Base Case
        if (root.getLeft() == null && root.getRight() == null) {
            returnVals.add(root.getData());
            return returnVals;

        // Recursive Method
        } else {
            returnVals.add(root.getData());
            List<T> leftVals = inorder(root.getLeft());
            List<T> rightVals = inorder(root.getRight());
            returnVals.addAll(leftVals);
            returnVals.addAll(rightVals);
            return returnVals;
        }
    }

    /**
     * Post Order Traversal
     */
    public List<T> postorder(TreeNode<T> root) {
        // L,R,C
        //Declare a new list
        List<T> returnVals = new ArrayList<T>();

        //Base Case
        if (root.getLeft() == null && root.getRight() == null) {
            returnVals.add(root.getData());
            return returnVals;

        //Recursive Method
        } else {
            returnVals.add(root.getData());
            List<T> leftVals = postorder(root.getLeft());
            List<T> rightVals = postorder(root.getRight());
            returnVals.addAll(leftVals);
            returnVals.addAll(rightVals);
            return returnVals;
        }
    }

    //Base Case helper method

}