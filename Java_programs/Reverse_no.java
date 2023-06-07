import java.util.Scanner;
public class Reverse_no {
   static int reverse(int a){
        int x=0;
        while(a%10!=0){
            x=x*10+a%10;
            a=a/10;
        }
        return x;}
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int z=obj.nextInt();
        //z=obj.nextInt();
        int val = reverse(z);
        System.out.println(val);
    }
}
