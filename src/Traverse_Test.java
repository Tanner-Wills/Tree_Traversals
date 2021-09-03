import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class Traverse_Test {

    public static void main(String[] args) {

        // Declare Nodes
        TreeNode<Integer> rooty = new TreeNode<>(1);
        TreeNode<Integer> left1 = new TreeNode<>(2);
        TreeNode<Integer> right1 = new TreeNode<>(6);

        TreeNode<Integer> left2 = new TreeNode<>(3);
        TreeNode<Integer> right2 = new TreeNode<>(7);

        TreeNode<Integer> left3 = new TreeNode<>(4);
        TreeNode<Integer> left4 = new TreeNode<>(5);

        TreeNode<Integer> left5 = new TreeNode<>(10);
        TreeNode<Integer> right5 = new TreeNode<>(11);

        // Connect Nodes
        rooty.setLeft(left1);
        rooty.setRight(right1);

        left1.setRight(right5);
        left1.setLeft(left2);
        left2.setLeft(left3);
        left2.setRight(left5);

        right1.setLeft(left4);
        right1.setRight(right2);

        //Test Pre, In, Post, order Traversal
        Traversals<Integer> mist = new Traversals<>();
        System.out.println(mist.preorder(rooty));


    }
}
