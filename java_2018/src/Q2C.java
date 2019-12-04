import java.util.LinkedList;
import java.util.Scanner;
import java.util.*;

public class Q2C {
    public  static  void main(String args[]){
        Scanner s;
        int a;
        int count=0;
        int sum=0;

        s = new Scanner(System.in);
        a = s.nextInt();

        Stack<Integer> stack = new Stack<Integer>();
        while (a > 0) {                                         //digeit to number
            stack.push( a % 10 );
            a = a / 10;
            count ++;
        }
        int arr[] = new int[count];
        for(int i =0;i<=count-1;i++){
            arr[i] = stack.pop();
           // System.out.println(stack.pop());
        }
        for(int j=0;j<count;j++) {                             //finding odd numbers
            if (arr[j] % 2 != 0) {
               // System.out.println(arr[j]);
                sum +=arr[j];

            }

        }
        System.out.println(sum);

        }                                                    //MafiaCode😊😊😊
}
