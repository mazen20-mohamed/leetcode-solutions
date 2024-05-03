class Solution {
    public int[] twoSum(int[] nums, int target) {
        TreeMap<Integer,Integer> mp = new TreeMap<>();
        for(int i:nums){
            if(mp.get(i) == null){
                mp.put(i,1);
                continue;
            }
            int last = mp.get(i);
            mp.put(i,last+1);
        }
        int finalValue1 = 0,finalValue2= 0,index1 = 0;
        for(int i=0 ; i<nums.length;i++){
            int value = target - nums[i];
            if(mp.get(value) !=null ){
                if((mp.get(value)==1 && value !=nums[i]) || (mp.get(value) >1 && value ==nums[i])){
                index1= i;
                finalValue1 = nums[i];
                finalValue2 = value;
                break;
            }
            }
        }
        int index2 = 0;
        for(int i=0 ; i<nums.length;i++){
            if(nums[i] == finalValue2 && i!=index1){
                index2 = i;
                break;
            }
        }
        int[] arr = new int[2];
        arr[0] = index1;
        arr[1] = index2;
        return arr;
    }
}