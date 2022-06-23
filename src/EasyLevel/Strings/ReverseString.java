package EasyLevel.Strings;

public class ReverseString {
    public static void main(String[] args) {
        char[] s = new char[]{'h', 'e', 'l', 'l', 'o'};
        System.out.println(reverseString(s));

    }
    public static char[] reverseString(char[] s) {
        int left = 0;
        int end = s.length-1;
        while (left < end) {
            char temp = s[left];
            s[left] = s[end];
            s[end] = temp;

            left ++;
            end --;
        }
        return s;
    }
}
