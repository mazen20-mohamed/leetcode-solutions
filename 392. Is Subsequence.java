class Solution {
    public boolean isSubsequence(String s, String t) {
        // two pointers method
        int i = 0,j=0,flag = 0;
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        while(i<s.length() && j< t.length()){
            // System.out.println(i +" " +j);
            if(arr1[i] == arr2[j]){
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        if(flag == 1 || i != s.length()){
            return false;
        }
        return true;

    }
}