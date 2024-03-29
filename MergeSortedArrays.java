public class MergeSortedArrays {

    public static void mergeArrays(int[] arr1, int[] arr2, int n, int m) {
        int i = n - 1; // Index of last element in arr1
        int j = 0;     // Index of first element in arr2

        // Traverse both arrays from right to left
        while (i >= 0 && j < m) {
            // If element of arr1 is greater than element of arr2
            // Move the element of arr1 to the end of arr2
            if (arr1[i] > arr2[j]) {
                // Swap elements
                int temp = arr1[i];
                arr1[i] = arr2[j];
                arr2[j] = temp;
                i--;
                j++;
            } else {
                // If element of arr1 is less than or equal to element of arr2
                // Move to the next element in arr1
                i--;
            }
        }

        // Sort both arrays separately
        sort(arr1);
        sort(arr2);
    }

    // Sort an array using insertion sort
    private static void sort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {0, 2, 6, 8, 9};
        int n = arr1.length;
        int m = arr2.length;

        mergeArrays(arr1, arr2, n, m);

        System.out.println("Modified arr1: " + java.util.Arrays.toString(arr1));
        System.out.println("Modified arr2: " + java.util.Arrays.toString(arr2));

        int[] arr3 = {10, 12};
        int[] arr4 = {5, 18, 20};
        int n2 = arr3.length;
        int m2 = arr4.length;

        mergeArrays(arr3, arr4, n2, m2);

        System.out.println("Modified arr3: " + java.util.Arrays.toString(arr3));
        System.out.println("Modified arr4: " + java.util.Arrays.toString(arr4));
    }
}
