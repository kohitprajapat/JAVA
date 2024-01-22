import java.util.*;

public class arraylist{

    public static int contMost(ArrayList<Integer> arr){
        int area = -1;
        int lp = 0;
        int rp = arr.size()-1;
        while(lp < rp){
            int currarea = Math.min(arr.get(lp), arr.get(rp))*(rp-lp);
            if(currarea > area){
                area = currarea;
            }
            if(lp < rp){
                lp++;
            }else{
                rp--;
            }
        }
        return area;
    }

    public static void lonely(ArrayList<Integer> samp){
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i < samp.size() ; i++){
            if(samp.contains(samp.get(i)+1) || samp.contains(samp.get(i)-1) || samp.contains(samp.get(i))){
            }else{
                ans.add(samp.get(i));
            }
        }
        System.out.println(ans);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       /*  ArrayList<Integer> height = new ArrayList<>();
        System.out.println("Enter 9 heights");
        for(int i = 0 ; i < 9 ; i++){
            height.add(sc.nextInt());
        }
        System.out.println("Max area is: " + contMost(height));

*/
        ArrayList<Integer> que = new ArrayList<>();
        que.add(1);
        que.add(3);
        que.add(5);
        que.add(3);
        
        lonely(que);


    }
} 