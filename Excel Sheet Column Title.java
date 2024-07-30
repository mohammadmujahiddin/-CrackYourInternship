Excel Sheet Column Title
Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.

For example:

A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28 
...

class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();
        while(columnNumber > 0){
            columnNumber--;
            char c = (char) ('A' + columnNumber%26);
            result.insert(0, c);
            columnNumber /= 26;
        }
        return result.toString();
    }
}
