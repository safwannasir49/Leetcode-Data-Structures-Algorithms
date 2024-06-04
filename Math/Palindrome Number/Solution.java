class Solution {
    public boolean isPalindrome(int x) {
        int originalno = x;
        int reversedno=0;
        int digit;
        if(x<0)
        {
            return false;
        }
        while(x!=0)
        {
            digit = x%10;
            reversedno = reversedno * 10 + digit;
            x = x/10;
        }
         
         if(originalno == reversedno)
         {
            return true;
         }
         else {
            return false;
         }
    }
    public static void main(String[]args)
    {
        int[] words = {121,-121,515,241};
        for(int word: words)
        {
            System.out.println(word+" is Palindrome.");
        }
    }
}