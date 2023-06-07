import java.util.Scanner;
public class Fibonnaci {
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        int a,x,y,z;
        a= obj.nextInt();
        x=0 ;
        y=1;
        System.out.print(x+" ");
        while(y<a){
            z=y;
            y=x+y;
            x=z;
            System.out.print(x+" ");
        }
    }
}
