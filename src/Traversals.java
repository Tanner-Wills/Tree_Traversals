import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 * pre-order, in-order, and post-order
 */
public class Traversals<T extends Comparable<? super T>> {

    /**
     * Given the root of a binary search tree, generate a
     * pre-order traversal of the tree. The original tree
     * should not be modified in any way.
     *
     * This must be done recursively.
     *
     * Must be O(n).
     *
     * @param <T> Generic type.
     * @param root The root of a BST.
     */
    public List<T> preorder(TreeNode<T> root) {
        // C,L,R
        System.out.println(root.getData());

        if(root.getLeft() != null){
            preorder(root.getLeft());
        }
        else if (root.getRight() != null){
            preorder(root.getRight());
        }

    }

    /**
     * Given the root of a binary search tree, generate an
     * in-order traversal of the tree. The original tree
     * should not be modified in any way.
     *
     * This must be done recursively.
     *
     * Must be O(n).
     *
     * @param <T> Generic type.
     * @param root The root of a BST.
     */
    public List<T> inorder(TreeNode<T> root) {
        // L,C,R

        if(root.getLeft() != null){
            inorder(root.getLeft());
        }
        System.out.println(root.getData());

        if(root.getRight() != null){
            inorder(root.getRight());
        }


    }

    /**
     * Given the root of a binary search tree, generate a
     * post-order traversal of the tree. The original tree
     * should not be modified in any way.
     *
     * This must be done recursively.
     *
     * Must be O(n).
     *
     * @param <T> Generic type.
     * @param root The root of a BST.
     */
    public List<T> postorder(TreeNode<T> root) {
        // L,R,C
        if(root.getLeft() != null){
            postorder(root.getLeft());
        }

        if(root.getRight() != null){
            postorder(root.getRight());
        }
        System.out.println(root.getData());
    }
}