public class dsa{
    public static void main(String args[]){
        int arr[] = {54,78,65,45,7,89,356};
        printArr(arr);
        quickSort(arr,0,arr.length-1);
        printArr(arr);


    }
    public static int partion(int arr[] , int low, int high){
        int pivot = arr[high];
        int i = low-1;

        for(int j = low ; j< high ; j++){
            if(arr[j] < pivot ){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot ;
        arr[high]=temp;
        return i;



    }

    public static void quickSort(int arr[] , int low , int high){
        if(low < high){
            int pidx = partion(arr,low,high);

            quickSort(arr, low, pidx-1);
            quickSort(arr, pidx+1, high);
        }
    }

    public static void selectionSort(int arr[]){
        for(int i = 0; i < arr.length ; i++){
            int minindex = i;
            for(int j = i+1; j < arr.length ; j++){
                if(arr[j] < arr[minindex]){
                    minindex = j;
                }
            }
            int temp = arr[minindex];
            arr[minindex] = arr[i];
            arr[i] = temp;
            
        }
    }
    public static void bubbleSort(int arr[]){
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i+1 ; j < arr.length-i ; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void insertionSort(int arr[],int n){
        int key,j;
        for(int i = 1; i < n ; i++){

            key = arr[i];
            j = i-1;
            while(j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;

        }

    }
    public static void printArr(int arr[]){
        for(int i = 0 ; i <arr.length ; i++){
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
    }
}