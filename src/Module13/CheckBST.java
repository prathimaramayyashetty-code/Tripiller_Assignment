package Module13;


public class CheckBST {

    static class Node {
        int data;
        Node left, right;

        Node(int value) {
            data = value;
        }
    }

    static boolean isBST(Node root, int min, int max) {
        if (root == null)
            return true;

        if (root.data <= min || root.data >= max)
            return false;

        return isBST(root.left, min, root.data) &&
                isBST(root.right, root.data, max);
    }

    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);

        if (isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE))
            System.out.println("Valid BST");
        else
            System.out.println("Not a BST");
    }
}