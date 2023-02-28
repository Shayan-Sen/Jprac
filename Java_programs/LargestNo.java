import java.util.Scanner;
public class LargestNo{
    public static void main(String args[]){
        int a,b,c;
        Scanner myobj = new Scanner(System.in);
        System.out.println("Input the three numbers");
        a = myobj.nextInt();
        b = myobj.nextInt();
        c = myobj.nextInt();
        if(a>=b && a>=c){
            System.out.println("The maximum number is :"+a);
        }
        else if(b>=c && b>=a){
            System.out.println("The maximum number is : "+b);
        }
        else if(c>=a && c>=b){
            System.out.println("The maximum number is : "+c);
        }
    }
}
