public class returnStatements {

    public static void main(String[] args){

        printAMessage();
        add(1, 2, 3);

        int sum = addsum(2, 3);
        System.out.println(sum);

        String shouting = caps("shut the hell up!");
        System.out.print(shouting);
    }

    public static void printAMessage(){
        System.out.println("This is a method!");
    }

    public static void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public static int addsum(int o, int p){
        return o + p;
    }
    
    public static String caps(String s){
        return s.toUpperCase();
    }
}
