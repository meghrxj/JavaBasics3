public class TryCatch2 {

    public static void main(String[] args){

        try {
            int[] a = null;
            System.out.println(a[1]);

        } catch(NullPointerException e) {
            System.out.println("Your arrays is null");

        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Your index is out of bounds");

        } catch(Exception e) {
            System.out.println("Something Else went wrong");
        }


    }
    
}
