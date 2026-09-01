import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class jobsche {
    static class Job{
        int id;
        int deadline ; 
        int profit ;

        public  Job(int i , int d , int p
        ){
             id = i;
            deadline = d;
            profit = p;
           
        }
    }

    public static void main(String[] args) {
        int jobinfo[][] = {{4,20} , {1,10} , {1,40} , {1,30}};
        ArrayList<Job> jobs = new ArrayList<>(); // arraylist in which we store jobs

        for(int i = 0 ;  i<jobinfo.length ; i++){
            jobs.add(new Job(i , jobinfo[i][0] , jobinfo[i][1])); // storing jobs like job 0 = (0,4,20);
        }
        Collections.sort(jobs , (a,b) -> b.profit -a.profit);// sorting in dec

        ArrayList<Integer> s = new ArrayList<>(); // keep the id of highprofit job
        int time = 0; // initally no job schedule
        for(int i = 0 ; i<jobs.size() ; i++){
            Job curr = jobs.get(i); // on curr we add job whic come first after dec ord so curr = job 2
            if(curr.deadline >time){ // chcking deadline of job2 which in curr
                s.add(curr.id); // add index of job like 2
                time ++; // now one job schedule so increse by 1
            }
        }
        System.out.println(s.size());
    }
}
