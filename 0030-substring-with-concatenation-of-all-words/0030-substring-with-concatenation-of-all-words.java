class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            map.merge(words[i], 1, Integer::sum);
        }

        int s_length = s.length();
        int wordcount = words.length;
        int wordlength = words[0].length();
        List<Integer> indices = new ArrayList<>();

        for (int i = 0; i < wordlength; i++) {
            Map<String, Integer> currentCount = new HashMap<>();
            int left = i, right = i;
            int total_words = 0;

            while (right + wordlength <= s_length) {
                String sub = s.substring(right, right + wordlength);
                right += wordlength;

                if (!map.containsKey(sub)) {
                    currentCount.clear();
                    left = right;
                    total_words = 0;
                    continue;
                }

                currentCount.merge(sub, 1, Integer::sum);
                ++total_words;

                while (currentCount.get(sub) > map.get(sub)) {
                    String removed = s.substring(left, left + wordlength);
                    left += wordlength;
                    currentCount.merge(removed, -1, Integer::sum);
                    --total_words;
                }

                if (total_words == wordcount) {
                    indices.add(left);
                }
            }
        }

        return indices;
    }
}