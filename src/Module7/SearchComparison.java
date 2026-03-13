package Module7;

public class SearchComparison {

    // Linear Search
    public static int linearSearch(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    // Binary Search
    public static int binarySearch(int arr[], int key) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                return mid;
            }
            else if (arr[mid] < key) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int arr[] = {10,20,30,40,50,60,70,80,90,100};
        int key = 70;

        // Linear Search Time
        long start1 = System.nanoTime();
        int result1 = linearSearch(arr, key);
        long end1 = System.nanoTime();

        // Binary Search Time
        long start2 = System.nanoTime();
        int result2 = binarySearch(arr, key);
        long end2 = System.nanoTime();

        System.out.println("Linear Search Index: " + result1);
        System.out.println("Linear Search Time: " + (end1 - start1) + " ns");

        System.out.println("Binary Search Index: " + result2);
        System.out.println("Binary Search Time: " + (end2 - start2) + " ns");
    }
}
