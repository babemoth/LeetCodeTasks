package EasyLevel.Strings;

public class FirstUniqueCharacterInAString {
    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(firstUniqChar(s));

    }
    public static int firstUniqChar(String s) {
        int count=-1;
        if(s == null || s.length() < 1) {
            return -1;
        }
        else if (s.length() == 1) {
            return 0;
        }

        for(Character ch:s.toCharArray()){
            if(s.indexOf(ch)==s.lastIndexOf(ch)){
                count=s.indexOf(ch);
                break;
            }

        }
        return count;
    }
}
