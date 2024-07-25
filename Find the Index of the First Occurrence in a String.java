28. Find the Index of the First Occurrence in a String
Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.



class Solution {
    public int strStr(String haystack, String needle) {
  if (needle.isEmpty()) {
    return 0; // Empty needle is always found at index 0
  }

  for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
    if (haystack.substring(i, i + needle.length()).equals(needle)) {
      return i; // Found the needle
    }
  }

  return -1; // Needle not found
    }
}
