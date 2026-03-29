package Module13;


public class DeleteBST {

    static class Node {
        int data;
        Node left, right;

        Node(int value) {
            data = value;
        }
    }

    static Node delete(Node root, int key) {
        if (root == null)
            return null;

        if (key < root.data)
            root.left = delete(root.left, key);
        else if (key > root.data)
            root.right = delete(root.right, key);
        else {
            // Case 1: No child
            if (root.left == null && root.right == null)
                return null;

            // Case 2: One child
            if (root.left == null)
                return root.right;
            if (root.right == null)
                return root.left;

            // Case 3: Two children
            Node minNode = root.right;
            while (minNode.left != null)
                minNode = minNode.left;

            root.data = minNode.data;
            root.right = delete(root.right, minNode.data);
        }
        return root;
    }

    static void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);

        root = delete(root, 30);

        System.out.print("After Deletion: ");
        inorder(root);
    }
}