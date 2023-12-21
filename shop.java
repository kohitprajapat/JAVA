import java.util.*;
public class shop {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String food;
        Boolean a = true;
        int BQ = 0,PQ = 0;
        double BP = 49.00,PP = 29.00,total;
        while(a){
            System.out.print("Enter Food : \n1. Burger\n2. PaniPuri\n3. Done\n");
            food = sc.nextLine();
            switch (food) {
                case "Burger":
                    System.out.print("How much burger you want: ");
                    {int temp = sc.nextInt();
                    BQ += temp;}
                    break;

                case "PaniPuri":
                    System.out.print("How much PaniPuri Plates you want: ");
                    {int temp = sc.nextInt();
                    PQ += temp;}
                    break;

                case "Done" :
                        a = false;  
            }
        }
        total = (BQ*BP)+(PQ*PP);
        System.out.print("Your Total is: " + total);
    }
}