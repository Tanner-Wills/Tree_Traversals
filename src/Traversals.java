import java.util.List;

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
        if(root == null){
            return (List<T>) root.getData();
        }
        System.out.print(root.getData() + " ");

        preorder(root.getLeft());

        preorder(root.getRight());
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

        if(root == null){
            return (List<T>) root.getData();
        }
        inorder(root.getLeft());

        System.out.print(root.getData() + " ");

        inorder(root.getRight());
    }

    /**
     * Given the root of a binary search tree, generate a
     * post-order traversal of the tree. The original tree
     * should not be modified in any way.
     *
     * This must be done recursively.
     *
     * Must be O(n).
     *  @param <T> Generic type.
     * @param root The root of a BST.
     */
    public void postorder(TreeNode<T> root) {
        // L,R,C

        if(root == null){
            return;
        }
        postorder(root.getLeft());

        postorder(root.getRight());

        System.out.print(root.getData() + " ");
    }

}