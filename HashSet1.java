import java.util.HashSet;

public class HashSet1 {

    public static void main(String[] args){


        HashSet<String> h = new HashSet<String>();
        h.add("Lemur");
        h.add("orangatang");
        h.add("spider monkey");
        h.add("Gorilla");

        h.remove("Gorilla");
        //h.clear(); 
        System.out.println(h.contains("spider monkey"));
        System.out.println(h);


    }
}
