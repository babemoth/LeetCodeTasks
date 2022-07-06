package EasyLevel.Strings;

public class ImplementStrStr {
    public static void main(String[] args) {
        String haystack = "hello" ;
        String needle = "ll";
        System.out.println(strStr(haystack,needle));
    }
    public static int strStr(String haystack, String needle) {

        char[] hArray = haystack.toCharArray();
        char[] nArray = needle.toCharArray();
        int i=0;
        int j=0;
        while(i<hArray.length && j<nArray.length){
            if(hArray[i]==nArray[j]){
                i++;
                j++;
            }else{
                i=i-j+1;
                j=0;
            }
        }
        if(j==nArray.length){
            return i-j;
        }
        return -1;
    }
}
