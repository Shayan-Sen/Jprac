import java.util.Scanner;
public class Grade{
    public static void main(String args[]) {
        Scanner obj= new Scanner(System.in);
        int a;
        System.out.print("Enter a number between 0 to 100:");
        a=obj.nextInt();
        System.out.print("Your grade is ");
        if (a>=90){
            System.out.println("A+");}
        else if (a>=80){
            System.out.println("A");
        }
        else if (a>=70){
            System.out.println("B");
        }
        else if (a>=60){
            System.out.println("C");
        }
        else if (a>=50){
            System.out.println("D");
        }
        else if (a>=40){
            System.out.println("E");
        }else {
            System.out.println("F");
        }
    }
}
