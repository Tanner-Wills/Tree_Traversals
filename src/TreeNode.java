public class TreeNode<T extends Comparable<? super T>> {

    private T data;
    private TreeNode<T> left;
    private TreeNode<T> right;

    /**
     * Constructor
     */
    TreeNode(T data) {
        this.data = data;
    }

    /**
     * Methods
     */
    T getData() {
        return data;
    }

    /**
     * Gets the left child.
     */
    TreeNode<T> getLeft() {
        return left;
    }

    /**
     * Gets the right child.
    */
    TreeNode<T> getRight() {
        return right;
    }

    /**
     * Sets the data.
     */
    void setData(T data) {
        this.data = data;
    }

    /**
     * Sets the left child.
     */
    void setLeft(TreeNode<T> left) {
        this.left = left;
    }

    /**
     * Sets the right child.
      */
    void setRight(TreeNode<T> right) {
        this.right = right;
    }
}