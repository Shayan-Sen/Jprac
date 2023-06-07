import java.util.Scanner;
import java.lang.Math;
public class Armstrong {
    static void armstrong (int a){
        int x=0,b=a;
        while (a%10!=0){
            int d=b,c=1;
            while(d%10!=0){
                c=c*(a%10);
                d=d/10;
            }
            x=x+c;
            a=a/10;
        }
        if (x==b){System.out.println(b+" is an Armstrong number");}
        else{System.out.println(b+" is not an Armstrong number");}
    }
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        int c;
        c=obj.nextInt();
        armstrong(c);
    }
}
