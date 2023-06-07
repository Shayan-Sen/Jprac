import java.util.Scanner;
public class prime{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        int a;
        a= obj.nextInt();
        for (int i=2;i<a;i++){
            if (a%i==0){
                System.out.println("Number isnt prime");
                return;
            }
        }
        System.out.println("Number is prime");
    }
}
