import java.util.*;
import java.util.Collections;
public class array {

    public static int FindLArgest(int arr[]){

        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length ; i++){
            if (largest < arr[i]){
                largest = arr[i];
            }
        }
        return largest;
    }

    public static int BinarySearch(int arr[], int key){

         int start = 0, end = arr.length-1;
         
         while (start <= end){
            int mid = (start+end)/2;
            if (key == arr[mid]){
                return mid;
            } // left
            if (key > arr[mid]){
                start = mid+1;
            } else {
                end = mid-1;
            }
         }
         return -1;

        
    }

    public static void ReverseArray(int arr[]){
        int mid = (arr.length-1)/2;
        for(int i = 0, j = arr.length-1 ; i < mid ; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            

        }


          
    }

    public static void printPairs(int arr[]){

        for(int i = 0 ; i <arr.length ; i++) {
            for(int j = i+1 ; j < arr.length ; j++){
                System.out.print(arr[i]+ " " + arr[j] + "\t");
            }
            System.out.println();
        }

    }

    public static void printSubArray(int arr[]){
        int sum;
        int n = arr.length;
        int subarr = (n*(n+1))/2;
        System.out.print("TOtal Sub array = "+ subarr);
        int maxi = Integer.MIN_VALUE;
        System.out.println();
        int mini = Integer.MAX_VALUE;
        

        for(int i = 0; i < arr.length ; i++) {
            for(int j = i ; j < arr.length; j++){
                sum = 0;
                for(int k = i; k <= j ; k++){
                    sum +=arr[k];
                    System.out.print(arr[k]+ "  ");
                }
                if (sum > maxi){
                    maxi = sum;
                }
                if (mini > sum){
                    mini = sum;
                }
                System.out.print(" = "+ sum);
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Minimum sum of a subarray = "+ mini);
        System.out.print("Maximum sum of a subarray = "+ maxi);

    }

    public static void kadane(int arr[]) {

        int cs = 0,ms = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length ; i++){
              cs += arr[i];
              if(cs < 0){
                cs = 0;
              }
              ms = Math.max(ms, cs);
        }
        System.out.print(ms);

    }

    public static int trappedwater(int arr[]){

        int n = arr.length;
        //left max boundry

        int leftMAx[] = new int[n];
        leftMAx[0] = arr[0];
        for(int i = 1; i < n; i++){
            leftMAx[i] = Math.max(leftMAx[i-1],arr[i] );
        }
        //right max

        int rightMax[] = new int[n];
        rightMax[n-1] = arr[n-1];
        for(int i = n-2; i >= 0 ; i--){
            rightMax[i] = Math.max(arr[i], rightMax[i+1]);
        }

        int trappedWater = 0;
        for(int i = 0; i < n ; i++) {

        
        int waterLevel = Math.min(rightMax[i], leftMAx[i]);

        trappedWater += waterLevel - arr[i];
        }

        return trappedWater;


    }
    public static void bubbleSort(int arr[]){
        int n = arr.length;
        
        for(int i = 0; i < n-1 ; i++){
            int swap = 0;
            for(int j = 0; j < n-1-i ; j++){
                int temp;
                
                if(arr[j] > arr[j+1]){
                    swap++;
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            if(swap ==0){
                break;
            }
        }

        
    }

    public static void selectionSort(int arr[]){
        for(int i = 0; i < arr.length-1 ;i++){
            int minPos = i;
            for(int j = i+1 ; j < arr.length;j++){
                if (arr[minPos] > arr[j]){
                    minPos = j;
                }
            }
            //swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }


    public static void insertionSort(int arr[]){

        for(int i = 1; i < arr.length ; i++){
            int curr = arr[i];
            int prev = i-1;

            while(prev >= 0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }


    }

    public static void countingSort(int arr[]){

        int largest = Integer.MIN_VALUE;
        for(int i = 0;i < arr.length ; i++){
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest+1];
        for(int i = 0 ; i<arr.length ; i++){
            count[arr[i]]++;
        }

        for(int i = 0, j = 0;i < count.length ; i++){
            while(count[i] > 0){
                arr[j] = i;  
                j++;              
                count[i]--;
            }
        }

    }

    public static void printArr(int arr[]){
        for(int i = 0; i <arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
    
        int arr[] = {3,56,645,8584 ,564,78};
        //insertionSort(arr);
        //Arrays.sort(arr,0,arr.length, Collections.reverseOrder(null));
        countingSort(arr);
        printArr(arr);
        
        // System.out.print(arr[3]);

        
        
        
    }
}
