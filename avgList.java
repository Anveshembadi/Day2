import java.util.*;

public class avgList {
    public static int avrg(List<Integer> arl)throws ArithmeticException{
        //List <Integer> al = new ArrayList<>();
        int avg;
        int sum =0;
        if(arl.size()==0){
            System.out.print("null");
        }
        for(int i=0;i<arl.size();i++){
            sum = sum + arl.get(i);
        }
        avg = sum/arl.size();

        return avg;
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter count of numbers");
        int n= sc.nextInt();
        List <Integer> arl = new ArrayList<>();
        for(int i=0;i<n;i++){
            System.out.println("Enter "+i+1+"th number");
            arl.add(sc.nextInt());
        }
    
        System.out.println("The avg of list is "+
        avrg(arl));
    
    }
}
