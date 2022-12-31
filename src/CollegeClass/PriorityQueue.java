package CollegeClass;

import java.util.Iterator;

public class PriorityQueue {
    public static void main(String[] args) {
        java.util.PriorityQueue<String> pq = new java.util.PriorityQueue<String>();
        pq.add("Ravi");
        pq.add("Aman");
        pq.add("Pulkit");
        System.out.println(pq);
        Iterator p = pq.iterator();
        while(p.hasNext()){
            System.out.println(p.next());
        }
    }
}
