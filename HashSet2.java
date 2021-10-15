import java.util.HashSet;
import java.util.Iterator;

public class HashSet2 {

    public static void main(String[] args) {

        HashSet<Integer> hashbrowns = new HashSet<Integer>();

        hashbrowns.add(13);
        hashbrowns.add(24);
        hashbrowns.add(5);

       // hashbrowns.remove(5); 

        //Object[] h = hashbrowns.toArray();
      //  System.out.println(hashbrowns);

        //System.out.println(h[1]); 

        Iterator<Integer> it = hashbrowns.iterator();
        
        while(it.hasNext()) {
            System.out.println(it.next());
        }


    }
    
}
