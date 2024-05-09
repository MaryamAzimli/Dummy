import java.util.Scanner;
public class Lab03_Q1{
    public static void main(String[] args){

        //input
        System.out.println("");
        System.out.print("Enter names of passengers: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        // getting initials
        int dash = input.indexOf("-");
        String firstPassanger = input.substring(0,1).trim();
        String secondPassanger = input.substring(dash+1, dash+2).trim();

        /* 
            Surname Group
            A – F Boarding Group 1
            G – N Boarding Group 2
            O – T Boarding Group 3
            U – Z Boarding Group 4
        
        
        */
        if(firstPassanger.compareTo("F")<=0||secondPassanger.compareTo("F")<=0)
            System.out.println("Boarding Group 1");
        else if(firstPassanger.compareTo("N")<=0||secondPassanger.compareTo("N")<=0)
            System.out.println("Boarding Group 2");
        else if(firstPassanger.compareTo("T")<=0||secondPassanger.compareTo("T")<=0)
            System.out.println("Boarding Group 3");
        else
            System.out.println("Boarding Group 4");

        sc.close();
    }
}