package Module13;



public class MinMaxBST {

    static class Node {
        int data;
        Node left, right;

        Node(int value) {
            data = value;
        }
    }

    static int findMin(Node root) {
        while (root.left != null)
            root = root.left;
        return root.data;
    }

    static int findMax(Node root) {
        while (root.right != null)
            root = root.right;
        return root.data;
    }

    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);

        System.out.println("Minimum: " + findMin(root));
        System.out.println("Maximum: " + findMax(root));
    }
}