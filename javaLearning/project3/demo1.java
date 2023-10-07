// package javaLearning.project3;

public class demo1 {
    public static void main(String[] args) {
        int[] array = {4,2,5,1,3};
        array=arraySort(array); 
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
        itemSearch(array, 4);
        
    }
    public static int[] arraySort(int[] arr){
        int len =arr.length;
        for(int i=0;i<len;i++){
            for(int j =len-1;j>i;j--){
                if(arr[j]>arr[i]){
                    int temp = arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        return arr;
    }
    public static int itemSearch(int[] arr,int target){
        int low =0;
        int high= arr.length-1;
        //int mid = high >>1;
        while(low<=high){
            int mid =low+(high-low)/2;
            System.out.println("mid is "+arr[mid]);
            if(arr[mid]==target){
                System.out.println(target+" on "+mid);
                return mid;
            }
            else if(arr[mid]<target){
                high =mid-1;
            }else{
                low=mid+1;
            }
             
        }
        return -1;
        // System.out.println("not found");
    }
}
