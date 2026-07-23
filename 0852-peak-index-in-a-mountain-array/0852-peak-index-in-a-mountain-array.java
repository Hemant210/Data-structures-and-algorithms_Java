class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        // int start = 0;
        // int end = arr.length - 1;

        // while(start < end){
        //     int mid = start + (end - start)/2;

        //     if(arr[mid] < arr[mid + 1]){
        //         start = mid + 1;
        //     } else {
        //         end = mid;
        //     }
        // }

        // return start;

        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[0]) {
                arr[0] = arr[i];
                index = i;
            }
        }

        return index;

    }
}