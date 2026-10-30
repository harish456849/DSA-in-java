import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
//Longest substring with non repeating characters
class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int start=0, maxLen=0, n=s.length();
        for(int i=0; i<n; i++){
            char c = s.charAt(i);
            while(set.contains(c)){
                set.remove(s.charAt(start));
                start++;
            }
            set.add(c);
            maxLen = Math.max(maxLen,i-start+1);

        }
        return maxLen;
    }
}
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = new String();
        System.out.println("Enter the Length of String: ");
        int len = sc.nextInt();
        System.out.println("Enter the String: ");
        for(int i=0; i<len; i++){
            str = str + sc.nextLine();
        }
        int k = longestSubStringLen(str);
        System.out.println("The Longest Sub String is of length: "+ k);
        
        


    }
}
