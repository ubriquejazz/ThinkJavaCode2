public class Ex01 {
    public static void main(String[] args) {

        boolean yes = true;
        boolean no = false;
        if ( no && !no || yes && !yes ) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}
