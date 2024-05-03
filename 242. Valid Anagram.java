class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        char[] array = s.toCharArray();
        char[] array2 = t.toCharArray();
        Arrays.sort(array);
        Arrays.sort(array2);
        for(int i = 0 ; i<s.length();i++){
            if(array[i] != array2[i]){
                return false;
            }
        }
        return true;
    }
}