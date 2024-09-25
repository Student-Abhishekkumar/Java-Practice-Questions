
import java.util.Scanner;

public class SearchProgram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        int[] A = {30, 70, 20, 40, 50, 90}; 

        System.out.print("Enter the value to search: ");
        int key = sc.nextInt(); 

        do {
            System.out.println("\n\t\tMENU:-\n1. Perform Linear Search\n2. Perform Binary Search (with Bubble Sort)\n3. Exit\n\nEnter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    performLinearSearch(A, key);
                    break;
                case 2:
                    performBinarySearch(A, key);
                    break;
                case 3:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);

        sc.close();
    }

    public static void performLinearSearch(int[] A, int key) {
        for (int i = 0; i < A.length; i++) {
            if (A[i] == key) {
                System.out.println("Value " + key + " found at position " + (i + 1));
                return;
            }
        }
        System.out.println("Value " + key + " not found in the array.");
    }

    // Binary Search method with Bubble Sort
    public static void performBinarySearch(int[] A, int key) {
        bubbleSort(A);
        int result = binarySearch(A, 0, A.length - 1, key);

        if (result != -1) {
            System.out.println("Value " + key + " found at position " + (result + 1));
        } else {
            System.out.println("Value " + key + " not found in the array.");
        }
    }

    public static void bubbleSort(int[] A) {
        int n = A.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (A[j] > A[j + 1]) {
                    int temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                }
            }
        }

        System.out.println("Array after sorting:");
        for (int i : A) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static int binarySearch(int[] A, int left, int right, int key) {
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (A[mid] == key) {
                return mid;
            }

            if (A[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
