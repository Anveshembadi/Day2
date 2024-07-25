public class reverse {
    public static String rev(String s){
        String s2="";
        String[] words=s.split("");
        for(int i=s.length()-1;i>=0;i--){
            s2 = s2+words[i]; 
        }

        return s2;
    }
    public static void main (String[]args){
        String s = "Anvesh";
        System.out.println(rev(s));
    }
}
