import java.util.Scanner;

public class Q2A {
    public static String convert(String str){
        StringBuffer sb= new StringBuffer(str);
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)<48 || sb.charAt(i)>57){
                sb.deleteCharAt(i);
                i--;
            }
        }
        return sb.toString() ;
    }
    public  static void main(String args[]){
        String str;
        Scanner s;
        s = new Scanner(System.in);
        System.out.print("Please enter an integer between 1 and 999,999:");
        str = s.nextLine();
        str = convert(str);
        System.out.println(str);
                                    //MafiaCode😊😊😊
    }
}
