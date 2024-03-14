package Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ActivitySelection {

    public static void main(String[] args) {

        int[] start = {1, 3, 0, 5, 8, 5};
        int[] end = {2, 4, 6, 7, 9, 9};

         activitySelection(start, end);
         activitySelection1(start, end);
    }


    // the end is sorted here
    private static void activitySelection(int[] start, int[] end) {

        List<Integer> activityList = new ArrayList<Integer>();
        activityList.add(0);
        int maxAct = 1;
        int lastChosen = end[0];
        for(int i=1; i<end.length; i++) {
            if(start[i] >= lastChosen) {
                maxAct++;
                lastChosen = end[i];
                activityList.add(i);
            }
        }

        System.out.println("Maximum Activities = " + maxAct);
        for(Integer activity: activityList) {
            System.out.print("A" + activity + " ");
        }
        System.out.println();
    }




    // if the end is not sorted
    private static void activitySelection1(int[] start, int[] end) {


        int[][] activities = new int[start.length][3];

        for(int i=0; i<start.length; i++) {
             activities[i][0] = i;
             activities[i][1] = start[i];
             activities[i][2] = end[i];
        }

        // now sort the Activities based on end times
        // i guess the it must be a row here
        Arrays.sort(activities, Comparator.comparingDouble(it -> it[2]));



        List<Integer> activityList = new ArrayList<Integer>();


        activityList.add(activities[0][0]);
        int maxAct = 1;

        int lastChosen = activities[0][2];
        for(int i=1; i<activities.length; i++) {
            if(activities[i][1] >= lastChosen) {
                maxAct++;
                lastChosen = activities[i][2];
                activityList.add(activities[i][0]);
            }
        }

        System.out.println("Maximum Activities = " + maxAct);
        for(Integer activity: activityList) {
            System.out.print("A" + activity + " ");
        }
        System.out.println();
    }
}
