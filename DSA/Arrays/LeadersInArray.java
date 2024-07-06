package Arrays;

import java.util.*;

public class LeadersInArray {

    public static void main(String[] args) {
        int[] arr = {4,7,1,0};
        int[] arr2 = {10, 22, 12, 3, 0, 6};
        System.out.println(leaders(arr2, arr2.length));
        System.out.println(leaders(arr, arr.length));
    }

    public static ArrayList<Integer> leaders(int[] arr) {
        ArrayList<Integer> leadersArr = new ArrayList<Integer>();
        int n = arr.length;
        for(int i=0; i<n; i++) {
            boolean flag = true;
            for(int j=i+1; j<n; j++) {
                if(arr[i] < arr[j]) {
                    flag = false;
                    break;
                }
            }
            if(flag) {
                leadersArr.add(arr[i]);
            }
        }
        return leadersArr;
    }

    public static LinkedList<Integer> leaders(int[] arr, int n) {
        LinkedList<Integer> res = new LinkedList<Integer>();
        int leader = arr[n-1];
        res.addFirst(leader);
        for(int i=n-2; i>=0; i--) {
            if(arr[i] > leader) {
                leader = arr[i];
                res.addFirst(leader);
            }
        }
        return res;
    }
}
