import java.util.Arrays;
public class rotate {
    private static void leftRotation(int[] arr, int num) {
        for (int i = 0; i < num; i++) {
            int temp = arr[0];
            for (int j = 0; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[arr.length - 1] = temp;
        }
        System.out.println("after Left Rotation of " + num +" Positions :");

        System.out.println(Arrays.toString(arr));
    }

    private static void rightRotation(int[] arr, int num) {
        for (int i = 0; i < num; i++) {
            int temp = arr[arr.length - 1];
            for (int j = arr.length - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = temp;
        }
        System.out.println("after right rotation of " + num + " Positions :");

        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Before Rotaion :");
        for(int ar : arr){
        System.out.print(ar+" ");
    }
    System.out.println("");
        int num = 2;
        leftRotation(arr,num);
        rightRotation(arr, num);
    }
}

