//00882673 Gabriel Hines, CSCD 210 Professor Tosic

import java.util.Arrays;

public class Main {
//hello world

    //the functions are to go as listed
    public static void main(String[] args) {
        assignment5();
    } //Main function call to assignment5()

    public static void assignment5() {
        System.out.println(" Type question you wish to test & grade : press enter when chosen. ");
        menu.menu();
        menu.menuSelection();

    } //Opening function call to menu() via the menu class

    //________________________________________________________________________________________________________________________________________
    public static int y = 0; //value
    //Prints to grid alpha based on space between two user seperated input
    public static void printChars(char ch1, char ch2, int numPerLine) {

        for (char i = ch1; i <= ch2; i++) {
            y++;
          //  divisibleTest.graphParameters(divisibleTest.printer(i));
            System.out.printf("%4c", i);
            if (y == numPerLine) {
                y = 0;
                System.out.println();
            }
        }
        System.out.println();
        assignment5();
    }
    //________________________________________________________________________________________________________________________________________
    //prints a graph size chosen by user
    public static void matrixGraph(int graph) {
        for (int i = 0; i < graph; i++) {
            System.out.println();
            double rand = Math.random() * 2;
            //this is then printed to a matrix table
            int randInt = (int)rand;
            for(int y = 0; y < graph; y++ ){
             System.out.printf("%3d", randInt);
           }
        }
        System.out.println();

        assignment5();
    }
    //________________________________________________________________________________________________________________________________________
    public static int totalStudents = 0, studentCounter = 0;
    public static String averageStudents = " ";
    public static int doorCheck = 0;
   // public static String truth = " ";
    //tests how many numbers are above the average of all inputs
    //upgrades average as inputs grow, does not change list of students who are above evg
    public static void averageTest(int userInput) {
            //-while -in main?si? idk how to organize this one\
            String averageStudents = averageSort(userInput);
            //printing number from main????
            System.out.println("Above average of initial scores: " + averageStudents);
    }

    public static String averageSort(int userInput) {
        String truth = new String();
        //this takes the input
        totalStudents += userInput;
        studentCounter++;
        int averageStudent = totalStudents / studentCounter;

        //if the user input is < the total average -- do nothing
        //if user input is above avg add to list

        if (userInput > averageStudent) {
            //new String ar[] = {};
            //keep track of students not in average,
            //once this ar recieves -1, print ln the array, no def fpr print :3
            String studentString = String.valueOf(userInput);
            studentString += " ";
            averageStudents += studentString;
        }
        //input into array (if for) then sort into order
        //  truth = belowAverage(averageStudents); //this is an upgrade to update the students who are below average using arrays!
        return averageStudents;
    }

    //________________________________________________________________________________________________________________________________________
    //computer input random char
    //100 ints between 0 & 9
    //display how many of each value occured!
    public static void integerCount() {
        //int ar[10];
        //might house all inside of this function.
        int one = 0, two = 0, three = 0, four = 0, five = 0, six = 0, seven = 0, eight = 0, nine = 0;
        for (int i = 0; i < 100; i++) {
            double rand = Math.random() * 10;
            switch ((int) rand) {
                case 1:
                    one++;
                case 2:
                    two++;
                case 3:
                    three++;
                case 4:
                    four++;
                case 5:
                    five++;
                case 6:
                    six++;
                case 7:
                    seven++;
                case 8:
                    eight++;
                case 9:
                    nine++;
            }
            if (i == 99) {
                System.out.println("one: " + one);
                System.out.println("two: " + two);
                System.out.println("three: " + three);
                System.out.println("four: " + four);
                System.out.println("five: " + five);
                System.out.println("six: " + six);
                System.out.println("seven: " + seven);
                System.out.println("eight: " + eight);
                System.out.println("nine: " + nine);

            }

        }
        System.out.println();
        assignment5();

    }
    //________________________________________________________________________________________________________________________________________
   //This accepts user input of list and finds instances of doubles after sorting the list
    public static void listComparison(String userInput) {
        //takes one list
        //takes second list
        String temp = new String();
        int[] array = new int[28]; //this holds all of the ints input by the user

        for (int z = 0; z < userInput.length(); z++) {
            array[z] = userInput.charAt(z);

        } //adds all to array
        Arrays.sort(array);

         for(int z = 0; z < 27; z++){
             if(array[z] != array[z+1]){
                 temp += (char)array[z] + " ";
                 if(z + 1 == 27) {
                     temp += (char) array[z + 1] + " ";
                 }
             }


        } //parses sorted array to string
        System.out.println("Sorted string, no duplicates: " + temp);

        assignment5();
    }
    }
//do the thing
