package Module13;


public class SearchBST {

    static class Node {
        int data;
        Node left, right;

        Node(int value) {
            data = value;
        }
    }

    static boolean search(Node root, int key) {
        if (root == null)
            return false;

        if (root.data == key)
            return true;
        else if (key < root.data)
            return search(root.left, key);
        else
            return search(root.right, key);
    }

    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);

        int key = 30;

        if (search(root, key))
            System.out.println("Element Found");
        else
            System.out.println("Element Not Found");
    }
}