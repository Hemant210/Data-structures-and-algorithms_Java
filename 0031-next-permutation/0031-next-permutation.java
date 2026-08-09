public class Solution {
    public void nextPermutation(int[] A) {
        int n = A.length;
        int pivot = -1;

        // Step 1: Find pivot
        for (int i = n - 2; i >= 0; i--) {
            if (A[i] < A[i + 1]) {
                pivot = i;
                break;
            }
        }

        // Step 2: Reverse entire array if no pivot found
        if (pivot == -1) {
            reverse(A, 0, n - 1);
            return;
        }

        // Step 3: Find element to swap with pivot
        for (int i = n - 1; i > pivot; i--) {
            if (A[i] > A[pivot]) {
                swap(A, i, pivot);
                break;
            }
        }

        // Step 4: Reverse the suffix
        reverse(A, pivot + 1, n - 1);
    }

    private void reverse(int[] A, int left, int right) {
        while (left < right) {
            swap(A, left++, right--);
        }
    }

    private void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}
