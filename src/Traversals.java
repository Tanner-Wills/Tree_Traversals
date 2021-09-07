import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;


public class Traversals<T extends Comparable<? super T>> {

    /**
     * Pre Order Traversal
     */
    public List<T> preorder(TreeNode<T> root) {
        // C,L,R

        List<T> returnVals = new ArrayList<T>();
        if (baseCase(root) == true){
            returnVals.add(root.getData());
        }
        else {
            List<T> leftVals = preorder(root.getLeft());
            List<T> rightVals = preorder(root.getRight());
            returnVals.add(root.getData());
            returnVals.addAll(leftVals);
            returnVals.addAll(rightVals);
        }
        return returnVals;
    }

    /**
     * In Order Traversal
     */
    public List<T> inorder(TreeNode<T> root) {
        // L,C,R

        List<T> returnVals = new ArrayList<T>();
        if (baseCase(root) == true){
            returnVals.add(root.getData());
        }
        else {
            List<T> leftVals = inorder(root.getLeft());
            List<T> rightVals = inorder(root.getRight());
            returnVals.addAll(leftVals);
            returnVals.add(root.getData());
            returnVals.addAll(rightVals);
        }
        return returnVals;
    }

    /**
     * Post Order Traversal
     */
    public List<T> postorder(TreeNode<T> root) {
        // L,R,C

        List<T> returnVals = new ArrayList<T>();
        if (baseCase(root) == true){
            returnVals.add(root.getData());
        }
        else {
            List<T> leftVals = postorder(root.getLeft());
            List<T> rightVals = postorder(root.getRight());
            returnVals.addAll(leftVals);
            returnVals.addAll(rightVals);
            returnVals.add(root.getData());
        }
        return returnVals;
    }

    /**
     * Base Case Helper Method
     */
    private boolean baseCase(TreeNode<T> root){
        if(root != null){
            if (root.getLeft() == null && root.getRight() == null)
                return true;
        }
        return false;
    }
}