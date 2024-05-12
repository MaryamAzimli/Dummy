import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class MathSolver {
    
    static int numberOfQuestions = 0;
    static int correctAnswers = 0;
    public static void main(String[] args) throws IOException {

        Scanner a = new Scanner(System.in);
        int choice;
        //menu
        do {
            System.out.println("");
            System.out.println("\nPlease choose 1 question type:");

            // choice one
            System.out.println("1: Efficiency question");

            // choice two
            System.out.println("2: Common denominator");

            // choice three
            System.out.println("3: Age question");

            //choice four
            System.out.println("4: Generate 5 questions");

            System.out.println("5: Quit");

            System.out.print("\nYour choice: ");
            choice = a.nextInt();

            if (choice == 1) {
                numberOfQuestions++;
                System.out.print("Please enter number X: ");
                int X = a.nextInt();
                System.out.print("\nPlease enter number Y: ");
                int Y = a.nextInt();
                System.out.println("\n" + numberOfQuestions + ". Around a rectangular flowerbed with dimensions " + X + " meters and " + Y
                        + " meters are to be planted roses equally spaced so that the roses are found\nin every corner of the flowerbed and consumed as little as possible. At what distance are planted roses? ");
                System.out.print("\nThe answer for this question is: ");
                System.out.print(solvingFirstQuestion(X, Y));
                System.out.println();

            }

            else if (choice == 2) {
                numberOfQuestions++;
                
                System.out.print("\nPlease enter number A: ");
                int A = a.nextInt();
                System.out.print("\nPlease enter number B: ");
                int B = a.nextInt();
                System.out.print("\nPlease enter number X: ");
                int X = a.nextInt();
                System.out.print("\nPlease enter number Y: ");
                int Y = a.nextInt();
                System.out.print("\nPlease enter number Z: ");
                int Z = a.nextInt();
                System.out.println("\n"+numberOfQuestions+ ". Find whole numbers between "+ A + " and " + B +" that are divisible by " + X +" , " + Y+ " , and " + Z);
                int times=0;
                System.out.print("The answer for this question is: ");
                for (int k = 0; k < solvingSecondQuestion(A, B, X, Y, Z).length&& solvingSecondQuestion(A, B, X, Y,Z)[k]!= 0; k++) {
                        System.out.print(solvingSecondQuestion(A, B, X, Y, Z)[k] + " , ");
                        
                        if (times==0&&solvingSecondQuestion(A, B, X, Y, Z)[k] == 0) {
                            System.out.println("\nThere is no such numbers between the given range");
                            times++;
                        }
                }
                times = 0;
            }

            else if (choice == 3) {
                numberOfQuestions++;
                System.out.print("\nPlease enter mom's age: ");
                int X = a.nextInt();
                System.out.print("\nPlease enter daughters age: ");
                int Y = a.nextInt();

                System.out.println("\n"+numberOfQuestions+ ". Louise is "+ X +" years old. Her daughter is "+Y+" years old. In how many years will Louise be double her daughter's age?");
                System.out.print("\nhe answer for this question is: ");
                if (solvingThirdQuestion(X, Y) <= 0) {
                    System.out.println("\nNot possible or Daughter cant be older than the mother, lol");
                }
                System.out.print(solvingThirdQuestion(X, Y));
            }

            else if (choice == 4) {                
                solvingFourthQuestion();
                System.out.println("Congratulations! Number of correct answers is: " + correctAnswers + "/5");

            }
            else if (choice > 5 || choice<1) {
                System.out.println("Please choose between 1 and 5");
            }
        } while (choice != 5);
        numberOfQuestions = 0;
        a.close();
    }
    
    public static int solvingFirstQuestion(int x, int y) {
        int GreatesCommonDivisor = 1;

        for (int m = 1; m <= x && m <= y; m++) {
            if (y % m == 0&& x % m == 0)
                GreatesCommonDivisor = m;
        }
        return GreatesCommonDivisor;
    }
    
    public static int[] solvingSecondQuestion(int a, int b, int x, int y, int z) {
        int[] wholeNumbers = new int[100];
        int index=0;
        if(a<b){
            for(int k=a;k<=b;k++){
                if(k%x==0&&k%y==0&&k%z==0){
                    wholeNumbers[index]=k;
                    index++;
                }
            }
        }

        else{
            for(int k=b;k<=a;k++){
                if(k%x==0&&k%y==0&&k%z==0){
                    wholeNumbers[index]=k;
                    index++;
                }
            }
        }
        return wholeNumbers;
    }

    public static int solvingThirdQuestion(int x, int y) {

        int answer = x - y* 2;
        if (y > x) {
            answer = 0;
        }
        return answer;
    }
    
    public static void solvingFourthQuestion() throws IOException {
        int usersAnswer = 0;
        Scanner m = new Scanner(System.in);

        int times = 0;

        String file = "exportingTheQuestions";
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter outFile = new PrintWriter(bw);
        //File file = new File(
        //"C:\\Users\\Maryam Azimli\\Desktop\\UNIVERSITY\\cs\\cs102\\labs\\lab1\\test.txt");

        File file2 = new File("C:\\Users\\Maryam Azimli\\Desktop\\UNIVERSITY\\cs\\cs102\\labs\\lab1\\test.txt");
        Scanner sc = new Scanner(file2);
        System.out.println("\nI will generate 5 questions, please write answers for each one");
        Random one = new Random();
        for (int k = 0; k < 5; k++) {
            numberOfQuestions++;
            int random = one.nextInt(3) + 1;

            if (random == 1) {

                int X = sc.nextInt();
                int Y = sc.nextInt();

                //exporting to the rext file
                outFile.print("\n" + numberOfQuestions + ". Around a rectangular flowerbed with dimensions " + X
                        + " meters and " + Y
                        + " meters are to be planted roses equally spaced so that the roses are found\nin every corner of the flowerbed and consumed as little as possible. At what distance are planted roses? ");
                outFile.print("\r\n");
                outFile.print(solvingFirstQuestion(X, Y));
                outFile.print("\r\n");
                outFile.print("\r\n");

                System.out.println("\n" + numberOfQuestions + ". Around a rectangular flowerbed with dimensions " + X
                        + " meters and " + Y
                        + " meters are to be planted roses equally spaced so"
                        + "that the roses are found\nin every corner of the flowerbed and consumed as little as possible."
                        + "At what distance are planted roses?");
                System.out.print("\nWhat is the answer? ");
                usersAnswer = m.nextInt();

                if (usersAnswer == solvingFirstQuestion(X, Y)) {
                    System.out.println("Correct!");
                    correctAnswers++;
                } else
                    System.out.print("\nThe answer for this question is: " + solvingFirstQuestion(X, Y));

            } 
            else if (random == 2) {

                int A = sc.nextInt();
                int X = 2;
                int Y = 3;
                int Z = 6;
                int B = sc.nextInt();

                int[] string = new int[solvingSecondQuestion(A, B, X, Y, Z).length];

                outFile.print("\n" + numberOfQuestions + ". Find whole numbers between " + A + " and " + B
                        + " that are divisible by " + X + " , " + Y + " , and " + Z);
                outFile.print("\r\n");
                System.out.println("\n" + numberOfQuestions + ". Find whole numbers between " + A + " and " + B
                        + " that are divisible by " + X + " , " + Y + " , and " + Z);
                System.out.print("Your answer is: (put100 to stop)");
                int po = 0;
                while (string[po] != 100 && po < solvingSecondQuestion(A, B, X, Y, Z).length
                        && solvingSecondQuestion(A, B, X, Y, Z)[po] != 0) {

                    string[po] = m.nextInt();
                    po++;
                }
                // System.out.print(solvingSecondQuestion(A, B, X, Y, Z)[p] + " , ");
                int matchingAnswers = 0;
                int runTimes = 0;

                for (int p = 0; p < solvingSecondQuestion(A, B, X, Y, Z).length
                        && solvingSecondQuestion(A, B, X, Y, Z)[p] != 0; p++) {
                    if (solvingSecondQuestion(A, B, X, Y, Z)[p] == string[p]) {
                        matchingAnswers++;
                    }
                    
                    runTimes++;
                }
                if (matchingAnswers == runTimes) {
                    System.out.println("Your answer is correct!");
                    correctAnswers++;
                } else {
                    System.out
                            .println("Wrong! The correct answer is: ");
                    for (int p = 0; p < solvingSecondQuestion(A, B, X, Y, Z).length
                            && solvingSecondQuestion(A, B, X, Y, Z)[p] != 0; p++) {
                        outFile.print(solvingSecondQuestion(A, B, X, Y, Z)[p] + " , ");
                        System.out.println(solvingSecondQuestion(A, B, X, Y, Z)[p] + " , ");
                        //theAnswer = solvingSecondQuestion(A, B, X, Y, Z)[p] + ",";
                        if (times == 0 && solvingSecondQuestion(A, B, X, Y, Z)[p] == 0) {
                            System.out.println("\nThere is no such numbers between the given range");
                            outFile.print("There is no such numbers between the given range");
                            times++;
                        }
                    }
                }

                for (int p = 0; p < solvingSecondQuestion(A, B, X, Y, Z).length
                        && solvingSecondQuestion(A, B, X, Y, Z)[p] != 0; p++) {
                    outFile.print(solvingSecondQuestion(A, B, X, Y, Z)[p] + " , ");
                    //theAnswer = solvingSecondQuestion(A, B, X, Y, Z)[p] + ",";
                    if (times == 0 && solvingSecondQuestion(A, B, X, Y, Z)[p] == 0) {
                        System.out.println("\nThere is no such numbers between the given range");
                        outFile.print("There is no such numbers between the given range");
                        times++;
                    }
                }
                outFile.print("\r\n");
                outFile.print("\r\n");
            }

            else if (random == 3) {

                int X = sc.nextInt();
                int Y = sc.nextInt();

                //exporting data
                outFile.print(numberOfQuestions + ". Louise is " + X + " years old. Her daughter is " + Y
                        + " years old. In how many years will Louise be double her daughter's age?");

                outFile.print("\r\n");

                //asking the question
                System.out.println("\n" + numberOfQuestions + ". Louise is " + X + " years old. Her daughter is " + Y
                        + " years old. In how many years will Louise be double her daughter's age?");

                System.out.print("Your answer is: ");
                usersAnswer = m.nextInt();

                outFile.print(solvingThirdQuestion(X, Y));

                if (usersAnswer == solvingThirdQuestion(X, Y)) {
                    System.out.println("\nCorrect!");
                    correctAnswers++;
                } else {
                    System.out.println("\nIncorrect! Solution is: " + solvingThirdQuestion(X, Y));
                }

                outFile.print("\r\n");
                outFile.print("\r\n");

            }

            times = 0;

        }
        outFile.close();
        System.out.println("\nOutput file has been created: " + file);

    }
}
