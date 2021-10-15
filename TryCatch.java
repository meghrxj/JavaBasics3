import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args){
     
    try{
        int[] a = {4, 5, 1};
        System.out.println(a[0]);
    } catch(Exception e){
            System.out.println("An Exception happened!");
    }

//real-wrold example 

    Scanner scan = new Scanner(System.in);
    System.out.println("what's your fav number?");

    try{
        int n = scan.nextInt();
        System.out.println(n);
    } catch(Exception e){
        System.out.println("please enter a number");
    }

scan.close();
}
    }
