class Solution {
    public int hIndex(int[] citations) {

        Arrays.sort(citations);

        int idx = 0;

        for(int i = citations.length - 1; i >= 0; i--){
            if(citations[i] > idx) idx++;
            else break;
        }

        return idx;
    }
}