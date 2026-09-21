class Solution {
    public boolean isPalindrome(String s) {

        // logic for just comparing letters 
        StringBuilder newString = new StringBuilder();

        for( int i = 0 ; i < s.length(); i ++){

            if(Character.isLetterOrDigit(s.charAt(i))){
                
                newString.append(Character.toLowerCase(s.charAt(i)));
            }
        }
        

        // logic for palindrome

        int rightTracker = newString.length()-1 ; 

        for( int i = 0 ; i < newString.length() / 2; i ++){

            if(newString.charAt(i) != newString.charAt(rightTracker)){
                return false; 
            }
            rightTracker--; 
        }

        return true; 
        
    }
}

// ok so if we have tab a cat we can start reading the spaces with 
// two pointers, one form the back one from the front, 
// then we get it all the way up to half of the word 
// for (int i = 0 ; i < s.length / 2 )
// t a b a c a t odd - 7 length 
// 1 2 3   1 2 3 7 /2 = 3 and we know the last one will be the same 
// under the circumstance its odd we do  s.length / 2 
// t a b a c a t t 
// 1 2 3 4 4 3 2 1 8 / 2 = 4 so that checks it 
// if its even then the condition would be 