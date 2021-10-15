public class Methods {

    public static void main(String[] args){

        welcome();

        multiply(5, 10);

        int c = 5;
        int d = 10;
        System.out.println(c * d);

        multiply(6, 8);

        divide(5, 10);
    }

//methods 
    public static void multiply(int a, int b) {

    System.out.println(a * b);

    }

//method 2

public static void welcome(){
    System.out.println("Welcome to our calculator");
}
    
public static void divide(int a, int b){
    System.out.println(a / b);
}

}
