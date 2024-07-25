import java.util.Arrays;

public class anagram {
    public static boolean isanagram(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        else
        return checkanagram(s1,s2);
    }
    public static boolean checkanagram(String s1, String s2){
        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        for(int i=0;i<s1.length();i++){
            if (chars1[i]!=chars2[i]){
                return false;
            }
        }
        return true;

    }
    public static void main (String args[]){
        String s1= "Anvesh";
        String s2= "Anandi";
        if(isanagram(s1, s2)){
            System.out.println("Its an anagram");
        }
        else{
            System.out.println("Not an anagram");
        }
    }
}
