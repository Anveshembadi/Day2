import java.util.Scanner;

import javax.sql.rowset.spi.SyncResolver;

public class gcd {
    public static int isGCD(int n1, int n2){
        int min=Math.min(n1,n2);
        int gcd =1;
        if(n1==0 || n2==0){
            return 0;
        }
            for(int i=1;i<=min;i++){
                if(n1%i==0 && n2%i==0){
                 gcd= i;
                }
            
        }
        return gcd;
    }
    public static void main(String []args){
        {
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter n1: ");
            int n1=sc.nextInt();
            System.out.println("Enter n2: ");
            int n2=sc.nextInt();
            System.out.println("GCD is :" + isGCD(n1, n2));


        }
    }
}
