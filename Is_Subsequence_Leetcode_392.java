class Solution {
    public boolean isSubsequence(String s, String t) {
    
            //create pointer for s 
            int s_index = 0;

            //need to iterate through the t string to check
            for(int t_index = 0; t_index < t.length(); t_index++) {
                
                //if the s string matches the t string's value
               if(s_index < s.length() && s.charAt(s_index) == t.charAt(t_index)) { 
                    s_index++;
               }
        }
    return s_index == s.length();
}
}