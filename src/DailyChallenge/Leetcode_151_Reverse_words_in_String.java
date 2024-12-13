package DailyChallenge;


import java.util.Arrays;
import java.util.Stack;

/*
*
Given an input string s, reverse the order of the words.

A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.

Return a string of the words in reverse order concatenated by a single space.

Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.

Example 1:

Input: s = "the sky is blue"
Output: "blue is sky the"
Example 2:

Input: s = "  hello world  "
Output: "world hello"
Explanation: Your reversed string should not contain leading or trailing spaces.
Example 3:

Input: s = "a good   example"
Output: "example good a"
Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.
* */
class Reverse_words_in_String {

    public static void reverseWords(String s) {
        char[] ca=s.toCharArray();
        ca= reverse(ca,0,s.length());
        int start = 0;
        for(int i=0;i<=s.length();i++){
            if(i==s.length()||ca[i]==' ' ){
                reverse(ca,start,i);
                start=i+1;
            }
        }
        System.out.println(String.valueOf(ca));
    }

    public static char[] reverse(char[] s, int index, int l){
        for(int i=index,j = l-1; i<j;i++,j--){
            char temp = s[i];
            s[i]=s[j];
            s[j]=temp;
        }
        return s;
    }

    public static void main(String[] args) {
        String s= "the sky is blue";
        reverseWords(s);
    }
}
