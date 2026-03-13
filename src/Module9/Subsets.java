package Module9;

public class Subsets {

    static void printSubsets(int arr[], int n, int index, String current) {
        if (index == n) {
            System.out.println(current);
            return;
        }

        printSubsets(arr, n, index + 1, current);
        printSubsets(arr, n, index + 1, current + arr[index] + " ");
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        printSubsets(arr, arr.length, 0, "");
    }
}
