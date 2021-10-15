import java.util.ArrayList;

public class ExceptionsJava {

    public static void main(String[] args){


        String[] pets = {"dog", "cat", "monkey"};

        System.out.println(pets[3]);


        ArrayList<String> list = new ArrayList<String>();
        list.add("book");
        list.get(0);
        System.out.println(list.get(0));

        
    }
    
}
