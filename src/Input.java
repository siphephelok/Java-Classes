import java.util.Scanner;

public class Input {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name:");
        String txtInput = in.nextLine();
        System.out.println("Your name is:" + txtInput);

    }
}
