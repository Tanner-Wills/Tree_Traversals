import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class Traverse_Test {

    public static void main(String[] args) {

        // Declare Nodes
        //Declare Nodes
        TreeNode<Integer> rooty = new TreeNode<>(50);

        TreeNode<Integer> left1 = new TreeNode<>(15);
        TreeNode<Integer> left2 = new TreeNode<>(5);
        TreeNode<Integer> left3 = new TreeNode<>(10);
        TreeNode<Integer> left4 = new TreeNode<>(25);
        TreeNode<Integer> left5 = new TreeNode<>(20);

        TreeNode<Integer> right1 = new TreeNode<>(75);
        TreeNode<Integer> right2 = new TreeNode<>(100);
        TreeNode<Integer> right3 = new TreeNode<>(85);


        //Link Nodes
        rooty.setLeft(left1);
        left1.setLeft(left2);
        left2.setRight(left3);

        rooty.setRight(right1);
        right1.setRight(right2);

        //Test Pre, In, Post, order Traversal
        Traversals<Integer> mist = new Traversals<>();
        System.out.println("Pre-Order " + mist.preorder(rooty));
        System.out.println("In-Order " +mist.inorder(rooty));
        System.out.println("Post-Order " +mist.postorder(rooty));

    }
}
