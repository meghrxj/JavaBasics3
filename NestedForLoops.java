public class NestedForLoops{

    public static void main(String [] args){


        //for loop

        for(int i=0; i < 5; i++){
            System.out.println("bro");
        }

    System.out.println("-------------------------------------------------");
        //nested 
        String[] colors = {"Red", "Blue", "Green", "White", "Black", "Grey", "Orange"};

        for(int i = 0; i < 3; i++){
            System.out.println(colors[i]);
        }
    System.out.println("--------------------------------------------------");

String[] [] fancyColors = { {"Red", "Green", "Yellow"}, 
                            {"Cyan", "MintGreen", "Magenta"} };

        for(int row = 0; row < 2; row++){
            for(int coloumn = 0; coloumn < 3; coloumn++) {
                System.out.println(fancyColors[row][coloumn]);
            }
        }

    System.out.println("--------------------");

    for(int i = 0; i < 6; i++){
        for(int j = 0; j < 11; j++){
            System.out.println("i: "+ i + ", j: "+ j);
        }
    }

    }
}