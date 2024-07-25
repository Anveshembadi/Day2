import java.util.Arrays;

public class sortArr {
    public static String[] convert(String[] str){
        Arrays.sort(str);
        return str;
    }
    public static void main (String[]args){
        String []s ={"Orange","Banana","Zepto","Benz","Tata","Anvesh"};
        convert(s);
        for(String st : s){
            System.out.print(st+" ");
        }
    }
}
