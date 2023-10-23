public class Ex06 {

    public static double multadd(double a, double b, double c) {
        return a*b + c;
    }
    public static double expSum(double x) {
        double a = Math.exp(-x);
        return multadd (Math.exp(-x), x, Math.sqrt(1-a));
    }
    
    public static void main(String[] args) {
        double tmp = multadd (1.0, 2.0, 3.0); // 5.0
        System.out.printf("invoking multadd() with simple parameters = %.2f \n", tmp);
        tmp = expSum(1.0);
        System.out.printf("invoking expSum(1.0) = %.2f \n", tmp);
    }
}
