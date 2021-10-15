import java.util.HashMap;
public class HashMapAwes {

    public static void main(String[] args) {

    int a = 10;
    String b = "hello";
    int[] c = {1, 2, 3};
    //what if we have millions variables?

        //HASHMap
        HashMap<String, Integer> happy = new HashMap<String, Integer>();

            happy.put("a", 10);
            happy.put("b", 88);
            happy.put("c", 3);;

        System.out.println(happy.get("c"));
    }
}
