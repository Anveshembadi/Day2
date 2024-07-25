public class sorting {
    public static int [] sort(int []arr , int n){
        for (int i=0;i<n-1;i++){
            boolean swapped= false;
            for(int j=0;j<n-1-i;j++){
            if(arr[j]>arr[j+1]){
                int temp = arr[j+1];
                arr[j+1]= arr[j];
                arr[j]=temp;
                swapped = true;
            }
            }
            if (swapped == false){
                return arr;
            }
        }
        return arr;
    }
    public static void print(int [] arr,int n){
        for(int i=0;i<=n-1;i++){
        System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[]args){
        int [] arr= {21,23,4,2,5,345,1,23,5,1,5,56};
        int n= arr.length;
        System.out.println(n);
        sort(arr,n);
        print(arr,n);
    }
}