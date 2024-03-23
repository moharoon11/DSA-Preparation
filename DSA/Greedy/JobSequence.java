package Greedy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class JobSequence {


    private static class Job {

        private int id;
        private int deadline;
        private int profit;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getDeadline() {
            return deadline;
        }

        public void setDeadline(int deadline) {
            this.deadline = deadline;
        }

        public int getProfit() {
            return profit;
        }

        public void setProfit(int profit) {
            this.profit = profit;
        }

        Job(int id, int deadline, int profit) {
            this.id = id;
            this.deadline = deadline;
            this.profit = profit;
        }



    }

    public static void main(String... args) {

        int[][] jobsInfo = { {4, 20}, {1, 10}, {1, 40}, {1, 30}};

        List<Job> jobs = new ArrayList<>();

        for(int i=0; i<jobsInfo.length; i++) {
            jobs.add(new Job(i, jobsInfo[i][0], jobsInfo[i][1]));
        }

        Collections.sort(jobs, (obj1, obj2) -> obj2.profit - obj1.profit);

        List<Integer> jobSeq = new ArrayList<>();

        int time = 0;

        for(int i=0; i<jobs.size(); i++) {
            Job current = jobs.get(i);
            if(current.deadline > time) {
                time++;
                jobSeq.add(current.id);
            }
        }


        System.out.println("Total number of jobs = " + jobSeq.size());
        System.out.println(jobSeq);
    }
}
