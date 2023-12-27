public class bitmanu{

    public static boolean evenorOdd(int n){

        if((n & 1 )== 0){
            return true;
        }
        return false;
    }

    public static void countSetBit(int n){
        int count = 0;
        while(n>0){
            if(n%10==1){
                count++;
            }
            n = n >> 1;
        }
        System.out.print("Total count is: " + count);
    }

    public static void main(String args[]){
        
       System.out.print(3^3);
        
        





    }






}