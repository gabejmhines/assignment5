import java.util.Scanner;

public class charInput {
    public static String charInput() {
        String userInput;
        //this is a char input scanner, accepts strings
        Scanner input = new Scanner(System.in);
        userInput = input.nextLine();
        return userInput;
    } //accepts user char input
    public static int intInput(){

        int inputInteger = 0;
        Scanner userInput = new Scanner(System.in);
        if (userInput.hasNextInt()){
            inputInteger = userInput.nextInt();
        }
        else{
            inputInteger = -1;
        }


        return inputInteger;
    }
}
