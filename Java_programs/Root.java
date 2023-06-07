public class Root {
    static int square(int a){
        return a*a;
    }
    static double square(double b){
        return b*b;
    }
    public static void main(String args[]) {
        int s1 = square(11);
        System.out.println(s1);
        double s2 = square(5.8);
        System.out.println(s2);
    }
}
