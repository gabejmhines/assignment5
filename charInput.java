import java.util.Scanner;

public class charInput {
    public static String charInput() {
        //this is a char input scanner, accepts strings
        Scanner input = new Scanner(System.in);
        String userInput = input.nextLine();
        return userInput;
    } //accepts user char input
    public static int intInput(){
        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();
        return userInput;
    }
}
