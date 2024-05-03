class Solution {
    public boolean containsDuplicate(int[] nums) {
        TreeMap<Integer,Integer> mp = new TreeMap<>();
        for(int i : nums){
            if(mp.get(i) == null){
                mp.put(i,1);
                continue;
            }
            int last = mp.get(i);
            mp.put(i,last+1);
        }
        int flag = 0;
        for(Map.Entry<Integer,Integer> i:mp.entrySet()){
            if(i.getValue() > 1)
                flag=1;
        }
        if(flag == 1){
            return true;
        }
        return false;
    }
}