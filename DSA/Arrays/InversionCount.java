package Arrays;

import java.util.ArrayList;
import java.util.List;

public class InversionCount {

    public static int merge(int[] arr, int low, int mid, int high) {
        List<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;
        int count = 0;
        while(left <= mid && right <= high) {
            if(arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                count += mid - left + 1;
                right++;
            }
        }
        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
        return count;
    }

    public static int mergeSort(int[] arr, int low, int high) {
        int count = 0;
        if(low <= high) return count;
        int mid = low + (high - low) / 2;
        count += mergeSort(arr, low, mid);
        count += mergeSort(arr, mid, high);
        count += merge(arr, low, mid, high);
        return count;
    }
    
}
