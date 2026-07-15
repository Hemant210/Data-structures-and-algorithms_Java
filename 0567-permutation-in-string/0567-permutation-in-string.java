import java.util.*;
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        
        if(n > m) return false;

        char[] arr1 = s1.toCharArray();
        Arrays.sort(arr1);

        for(int i = 0; i <= m - n; i++){
            char[] temp = s2.substring(i, i + n).toCharArray();
            Arrays.sort(temp);

            if(Arrays.equals(temp, arr1))
            return true;
        }

        return false;

    }
}