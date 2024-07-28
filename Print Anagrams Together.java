Print Anagrams Together
Given an array of strings, return all groups of strings that are anagrams. The groups must be created in order of their appearance in the original array.
Look at the sample case for clarification.
Note: The final output will be in lexicographic order.
  
class Solution {
    public List<List<String>> Anagrams(String[] string_list) {
        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> mp = new HashMap<>();
        
        for (String str : string_list) {
            char[] c = str.toCharArray();
            Arrays.sort(c);
            String sortedStr = new String(c);
            
            if (mp.containsKey(sortedStr)) {
                mp.get(sortedStr).add(str);
            } else {
                List<String> anagrams = new ArrayList<>();
                anagrams.add(str);
                mp.put(sortedStr, anagrams);
            }
        }
        
        result.addAll(mp.values());
        return result;
    }
}
