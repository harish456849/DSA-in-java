import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
//Longest substring with non repeating characters
class LongestSubstring{
    public static int longestSubStringLen(String str){
        int n = str.length();
        Set<Character> set = new HashSet<>();
        int left=0,right=0,MaxLen=0,i=0;
        while(i<n){
            char c = str.charAt(i);
            if(set.contains(c)){
                set.remove(left);
                left++;
                
            }
            set.add(c);
            right++;
            i++;
            MaxLen = Math.max(MaxLen, right-left);
        }
        return  MaxLen;
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
