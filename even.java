import java.util.Arrays;

public class even {
    public static int[] evens(int[]arr,int n){
        int count=0;
        for(int i=0;i<n;i++){
        if(arr[i]%2==0){
            count++;
        }
        }
        int []arr1= new int[count];
        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){ 
                arr1[j++]=arr[i];
            }
        }
        return arr1;
    }
    public static void print(int[]arr1){
        for(int ev : arr1){
            System.out.print(ev+" ");
        }
    }
    public static void main(String[]args){
        int []arr = {1, 11,31,34,22,45,6,34,5,881,9,34,80,444,2};
        int n= arr.length;
        Arrays.sort(arr);
        print(evens(arr,n));

    }
}
