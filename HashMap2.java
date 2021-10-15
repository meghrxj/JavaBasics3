import java.util.HashMap;

public class HashMap2 {

    public static void main(String[] args){

HashMap<String, String> fun = new HashMap<String, String>();

fun.put("String Key", "Value");
fun.put("bar", "baz");
fun.put("coolguyswag", "password123");

fun.remove("coolguyswag", "password123");

System.out.println(fun.containsValue("coolguyswag")); //it will print fale because consider "value"

System.out.println(fun.keySet()); 
System.out.println(fun); 

    }
    
}
