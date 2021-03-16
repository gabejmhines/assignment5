import java.util.Scanner;


public class menu {


    public static void menu() {
        System.out.println("Choose program you would like to run from assignment (INT selection only), then press enter : ");
        System.out.println(" 1 : Print Chars");
        System.out.println(" 2 : Print Matrix");
        System.out.println(" 3 : Avg Students");
        System.out.println(" 4 : Int counter");
        System.out.println(" 5 : Duplicate Removal");
        System.out.println(" 0 : Exit Program ");
    } //Offers user selection :  Opening to menuSelection()

    public static void menuSelection() {
        double problems = inputIntegerFunction();
        incorrectInput((int) problems);
        switch ((int) problems) {
            case 1:
                System.out.println("Hello, please  input the initial char you would like to compare! Then press enter.");
                String s1 = charInput.charInput();
                System.out.println("Hello, please  input the final char you would like to compare! Then press enter.");
                String s2 = charInput.charInput();
                System.out.println("Hello, please input how many chars you would like to display per line! Press enter when done.");
                int numPerline = charInput.intInput();


                char ch1 = s1.charAt(0);
                char ch2 = s2.charAt(0);

                Main.printChars(ch1, ch2, numPerline);
                break;
            case 2:
                System.out.println("Hello, please input the size of graph, then press enter");
                int graph = charInput.intInput();
                Main.matrixGraph(graph);
                break;
            case 3:
                int userInput = 0;
                System.out.println("Hello, input the ints you wish for, enter after each, the following numbers will be calculated accoridngly. ");
                Main.averageStudents = new String();
                while(userInput != -1) {
                    userInput = charInput.intInput();
                    Main.averageTest(userInput);
                    if(userInput == -100){
                        Main.assignment5();
                        break;
                    }
                }
                Main.assignment5();
                break;

            case 4:
                System.out.println("Integer counter is starting now!");
                Main.integerCount();
                break;
            case 5:
                System.out.println("Hello, enter the list you wish to have sorted! Space sepersted, press enter when done.");
                String input = charInput.charInput();
               Main.listComparison(input);
                break;
            case 0:
                System.out.println("Assignment 3 is over, thx!");
                break;
            default:
                System.out.println("You hit rock bottom, input number provided on menu!!");
                Main.assignment5();
                break;
        }
    } //Allows user to select question to be graded from assignment2


    public static int inputIntegerFunction() {
        int inputInteger = 0;
        Scanner userInput = new Scanner(System.in);
        if (userInput.hasNextInt()){
            inputInteger = userInput.nextInt();
        }
        else{
            inputInteger = -1;
        }


        return inputInteger;

    }//Handles user integer input!

    public static void incorrectInput(int userInput) {

        if (userInput < 0) {
            System.out.println("Sorry, you gotta input value greater then or equal to zero! You are being redirected to main menu!");
            Main.assignment5();
        }
        if (userInput > 6) {
            System.out.println("Sorry, you gotta input value less then 5! You are being redirected to main menu!");
            Main.assignment5();
        }
    } //Menu debugger


}
