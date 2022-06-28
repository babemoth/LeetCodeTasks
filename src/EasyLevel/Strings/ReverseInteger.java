package EasyLevel.Strings;

public class ReverseInteger {
    public static void main(String[] args) {
        int x = 120;
        System.out.println(reverse(x));

    }
    public static int reverse(int x) {
        int res = 0;
        boolean zero = false;
        while(!zero){
            res = res * 10 +(x % 10);
            x = x/10;
            if (x == 0) {
                zero = true;
            }
        }
        return res;
    }
}
