import java.util.Scanner;

public class AgeChecker {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter your age:");
        int age = in.nextInt();
        System.out.println("Do you have a drivers licence?");
        char driversLicence = in.next().charAt(0);
        if(age >= 21 && driversLicence == 'y')
            System.out.println("You are an adult and you can hire a car");
        else
            System.out.println("You are not an adult and you cannot hire a car");
        //endif
        in.close();
    }//end method main
}//end class AgeChecker
