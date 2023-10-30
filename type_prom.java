import java.util.*;
public class type_prom {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        // income tac cal

        int income;
        System.out.print("Enter Income : ");
        income = sc.nextInt();
        double tax;
        if (income <= 500000) {
            System.out.println("There is no tax");
        }
        else if(income > 500000 && income <= 1000000) {
           tax = (income-500000)*0.2;
           System.out.println("You have to pay "+tax);
        } else {
            tax = (income-1000000)*0.3;
            System.out.println("You have to pay "+ tax);
        }
        
        


    }
    
}
