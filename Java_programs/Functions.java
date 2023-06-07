public class Functions {
    public static int func(int a){
        return a*a;
    }
    public static int func(int c,int d){
        int b = (c*c)+(d*d);
        return b;
    }
    public static void main(String[] args) {
        int s1 = func(8);
        int s2 = func(3,4);
        System.out.println(s1);
        System.out.println(s2);
    }
}
