class Solution {
    public boolean isAnagram(String s, String t) {
        int [] temp1= new int[26];
        int [] temp2= new int[26];
        int index;
        if(s.length() != t.length()){
            return false;
        }
        for(int i=0; i<s.length(); i++){
            index= s.charAt(i)-'a';
            temp1[index]+=1;
        }
         for(int i=0; i<t.length(); i++){
            index= t.charAt(i)-'a';
            temp2[index]+=1;
        }
         for(int i=0; i<26; i++){
            if(temp1[i]!=temp2[i]){
                return false;
            }
        }

        return true;

    }
}
