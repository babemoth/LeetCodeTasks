package EasyLevel.Strings;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = new String[]{"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }
    public static String longestCommonPrefix(String[] strs) {
        int a = strs.length;
        Arrays.sort(strs);

        int end = Math.min(strs[0].length(), strs[a-1].length());

        int i = 0;
        while (i < end && strs[0].charAt(i) == strs[a-1].charAt(i) )
            i++;

        String pre = strs[0].substring(0, i);
        return pre;
    }
}
