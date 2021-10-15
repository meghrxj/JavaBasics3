public class returnStatments2 {

    public static void main(String[] args){

        int[] firstArray = ArrayFromInt(3, 7, 1);
        System.out.println(firstArray[0]);
        System.out.println(firstArray[1]);
        System.out.println(firstArray[2]);

    }

    public static int[] ArrayFromInt(int a, int b, int c) {
        int[] array = new int[3];

        array[0] = a;
        array[1] = b;
        array[2] = c;
        return array; 
    }
    
}
