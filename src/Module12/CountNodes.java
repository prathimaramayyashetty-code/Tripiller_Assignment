package Module12;


public class CountNodes  {

    // Node class inside (avoids duplicate error)
    static class Node {
        int data;
        Node left, right;

        Node(int value) {
            data = value;
            left = right = null;
        }
    }

    // Function to count nodes
    static int countNodes(Node root) {
        if (root == null)
            return 0;

        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    public static void main(String[] args) {

        // Creating binary tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println("Number of Nodes: " + countNodes(root));
    }
}