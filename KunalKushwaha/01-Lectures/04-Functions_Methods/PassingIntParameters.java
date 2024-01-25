public class PassingIntParameters {
    public static int Sum(int a, int b) {
        int add = a  + b;
        return add;
    }
    public static void main(String[] args) {
        System.out.println(Sum(10, 20));
    }
}
