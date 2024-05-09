class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
        vector<int> sums((int)nums.size()+1);
        sums[0] = 0;
        int cnt = 1;
        for(int i :nums){
            sums[cnt] = sums[cnt-1] + i;
            cnt++;
        }
        for(int i :sums){
            cout<<i<<" ";
        }
        cout<<endl;
        map<int,int>mp;
        cnt = 0;
        for(int i:sums){
            int value = i - k;
            cout<<value<<" "<<mp[value]<<endl;
            if(mp[value] > 0){
                cnt+=mp[value];
            }
            mp[i]++;
        }
        return cnt;
    }
};