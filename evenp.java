//import java.util.*;

public class evenp{
    public static void main(String args[]){
        //Scanner sc = new Scanner(System.in);
        printEven(1000, 3000);

    }
    public static void printEven(int start,int end){
        Boolean a = true;
        for(int i = start ; i <= end ; i++){
            int temp = i;
            while(temp > 0){
                if((temp%10)%2!=0){
                    a = false;
                    break;
                }
                temp /= 10;
            }
            if(a){
                System.out.println(i);
            }
        }
    }
}