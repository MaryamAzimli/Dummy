import java.util.Scanner;
public class Lab03_Q3 {
    public static void main(String[] args){

        //input
        System.out.println("");
        System.out.print("Is the object an Animal/Vegetable/Mineral?\nAnswer: ");
        Scanner sc = new Scanner(System.in);
        String firstAnswer = sc.nextLine();

        // second question & conditions & output
        if(firstAnswer.equalsIgnoreCase("animal")||firstAnswer.equalsIgnoreCase("vegetable")||firstAnswer.equalsIgnoreCase("mineral")){
            System.out.println("Is the object bigger than a shoe box?");
            String secondAnswer = sc.nextLine();

            if(secondAnswer.equalsIgnoreCase("yes")){
                if(firstAnswer.equalsIgnoreCase("animal")){
                    System.out.println("You're thinking of a elephant right?");
                }
                else if(firstAnswer.equalsIgnoreCase("vegetable")){
                    System.out.println("You're thinking of a pumpkin right?");
                }
                else{
                    System.out.println("You're thinking of a bus right?");
                }

            }

            else if(secondAnswer.equalsIgnoreCase("no")){
                if(firstAnswer.equalsIgnoreCase("animal")){
                    System.out.println("I know, it's a squirrel!");
                }
                else if(firstAnswer.equalsIgnoreCase("vegetable")){
                    System.out.println("I know, it's a carrot!");
                }
                else{
                    System.out.println("I know, it's a pencil!");
                }

            }
            
            else{
                System.out.println("I don't understand, '" +secondAnswer+ "'' is not a valid answer.");
            }
        }
        else {
            System.out.println("I don't understand, " +firstAnswer+ " is not a valid answer.");
        }
        sc.close();
    }
}
