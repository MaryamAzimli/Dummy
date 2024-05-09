import java.util.Scanner;
public class Lab03_Q2 {
    public static void main(String[] args){

        double weightOnDifferentPlanet;

        // input and choices
        System.out.print("Enter your weight: ");
        Scanner sc = new Scanner(System.in);
        int weight = sc.nextInt();
        System.out.println("Choose the planet: ");
        System.out.printf("%20s%n%19s%n%22s%n%21s%n%21s%n%22s%n","1-Venus", "2-Mars", "3-Jupiter",
            "4-Saturn", "5-Uranus" , "6-Neptune");
        System.out.print("Choice: ");
        int choice = sc.nextInt();

        //calculations using gravity
        double venus = 0.78;
        double mars = 0.39;
        double jupiter = 2.65;
        double saturn = 1.17;
        double uranus = 1.05;
        double neptune = 1.23;
        if(choice==1){
            weightOnDifferentPlanet= weight*venus;
        }
        else if(choice==2){
            weightOnDifferentPlanet=weight*mars;
        }
        else if(choice==3){
            weightOnDifferentPlanet=weight*jupiter;
        }
        else if(choice==4){
            weightOnDifferentPlanet=weight*saturn;
        }
        else if(choice==5){
            weightOnDifferentPlanet=weight*uranus;
        }
        else {
            weightOnDifferentPlanet=weight*neptune;
        }
        //String weightOnDifferentPlanet2 = Double.toString(weightOnDifferentPlanet);
        //weightOnDifferentPlanet2= String.format("%.1d",weightOnDifferentPlanet2);


        //output
        if(weight<0){
            System.out.println("Invalid weight, quitting..... ");
        }
        else if(choice>6||choice<=0){
            System.out.println("Invalid choice - quitting....");
        }
        else{
            System.out.printf("%s%s%s%2.1f","Your weight on planet " ,choice ," is ",weightOnDifferentPlanet);
        }

    sc.close();
    }
}
