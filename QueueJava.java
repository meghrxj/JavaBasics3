import java.util.LinkedList;
import java.util.Queue;

public class QueueJava {
    public static void main(String[] args){


        Queue<String> q = new LinkedList<String>();

        q.add("A");
        q.add("B");
        q.add("C");

        //q.peek();
        //q.poll();
        //System.out.println(q.poll());

        //more methods 

        System.out.println(q.size()); 
        System.out.println(q.contains("A"));
        System.out.println(q.toArray()[2]);


        System.out.println(q);
        



















    }
}
