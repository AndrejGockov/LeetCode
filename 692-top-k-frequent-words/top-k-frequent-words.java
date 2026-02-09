class Solution {
        public List<String> topKFrequent(String[] words, int k) {
            TreeMap<String, Integer>map = new TreeMap<>();

            for(String word : words){
                map.put(word, map.getOrDefault(word, 0) + 1);
            }

            System.out.println(map);
            
            return map.entrySet()
                    .stream()
                    .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                    .map(Map.Entry::getKey)
                    .limit(k)
                    .collect(Collectors.toList());
        }
    }