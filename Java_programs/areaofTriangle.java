import java.util.Scanner;

public class areaofTriangle{
    public static void main(String args[]){
        double base , alt ;
        Scanner mysc = new Scanner(System.in);
        System.out.println("Enter the value of the base:");
        base = mysc.nextDouble();
        System.out.println("Enter the value of the altitude:");
        alt = mysc.nextDouble();
        double area = (base * alt)/2 ;
        System.out.println("The area of the triangle is :"+ area);
    }
}