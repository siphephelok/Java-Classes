package Arrays;
//An array is a collection of values of the same data type stored in a container object
import java.util.Scanner;

public class UniqueNums {
    public static void main(String[]args){
        int[] numbers = new int[5];
        int num = 0;
        int numValues = 0;
        boolean valid = true;
        Scanner in = new Scanner(System.in);
        while(numValues < numbers.length){
            do{
                valid=true;
                System.out.print("Please enter a value:");
                num = in.nextInt();
                for(int i = 0;i <numValues; i++){
                    if(num == numbers[i]){
                        System.out.println("Number already exists");
                        valid = false;
                        break;
                    }//endif

                }//endfor
            }while(!valid);
            numbers[numValues] = num;
            numValues++;
        }//endwhile
        in.close();//Close scanner object
        for(int numV: numbers)
            System.out.println("Number Value: " + numV);
    }//end method main
}//end class UniqueNums
