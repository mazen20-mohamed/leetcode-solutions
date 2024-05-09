class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        ArrayList<Pair<String,Integer>> list = new ArrayList<>();
        for(int i = 0 ; i < strs.length; i++){
            char[] arr = strs[i].toCharArray();
            Arrays.sort(arr);
            String s = new String(arr);
            list.add(new Pair<>(s,i));
        }
        Collections.sort(list, new Comparator<Pair<String, Integer>>() {
            @Override
            public int compare(Pair<String, Integer> p1, Pair<String, Integer> p2) {
                return p1.getKey().compareTo(p2.getKey());
            }
        });
        // System.out.println(list);
        List<List<String>> out = new ArrayList<>();
        List<String> values = new ArrayList<>();
        if(list.size() == 0){
            out.add(values);
            return out;
        }
        values.add(strs[list.get(0).getValue()]);
        if(list.size()==1){
            out.add(values);
            return out;
        }
        for(int i = 1 ; i< (int)list.size();i++){
            if(list.get(i).getKey().equals(list.get(i-1).getKey())){
                values.add(strs[list.get(i).getValue()]);
            }
            else{
                out.add(values);
                // System.out.println(out);
                values = new ArrayList<>();
                values.add(strs[list.get(i).getValue()]);
            }
        }
        out.add(values);
        // System.out.println(out);
        return out;
    }
}
