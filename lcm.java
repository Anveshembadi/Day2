public class lcm {
    public static int lcmis(int n1, int n2){
        int ans = Math.max(n1,n2);
        for(int i=ans;i<=n1*n2;i+=ans){
            if(i%n1==0 && i%n2==0){
                ans= i;
                break;
            }

        }
        return ans;
    }
     public static void main(String[]args){
        int n1=58;
        int n2 =6;
        System.out.println("LCM is:"+ lcmis(n1, n2));

     }
}
