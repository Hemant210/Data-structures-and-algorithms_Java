class Solution {
    public boolean palivalid(String s){
        int left = 0;
        int right = s.length() - 1;

        while(left < right){
            if(s.charAt(left) != s.charAt(right))
            return false;
            left++;
            right--;
        }

        return true;
    }

    public void getvalid(String s, List<String> partitions, List<List<String>> ans){
        if(s.length() == 0){
            ans.add(new ArrayList<>(partitions));
            return;
        }

        for(int i = 0; i < s.length(); i++){
            String part = s.substring(0, i + 1);

            if(palivalid(part)){
                partitions.add(part);

                getvalid(s.substring(i + 1), partitions, ans);
                partitions.remove(partitions.size() - 1);
            }
        }
    }

    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> partion = new ArrayList<>();
        
        getvalid(s, partion, ans);

        return ans;
    }
}