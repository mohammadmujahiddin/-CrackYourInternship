71. Simplify Path
Given an absolute path for a Unix-style file system, which begins with a slash '/', transform this path into its simplified canonical path.
In Unix-style file system context, a single period '.' signifies the current directory, a double period ".." denotes moving up one directory level, 
and multiple slashes such as "//" are interpreted as a single slash. 
In this problem, treat sequences of periods not covered by the previous rules (like "...") as valid names for files or directories.
The simplified canonical path should adhere to the following rules:

It must start with a single slash '/'.
Directories within the path should be separated by only one slash '/'.
It should not end with a slash '/', unless it's the root directory.
It should exclude any single or double periods used to denote current or parent directories.
Return the new path.


class Solution {
    public String simplifyPath(String path) {
        String[] s = path.split("/");
        String result = "";
        int i = 0;
        Stack<String> stack = new Stack<>();
        while(i < s.length){
            if(s[i].equals("")){
                i++;continue;
            }else if(s[i].equals(".")){
                i++;continue;
            }else if(!stack.isEmpty() && s[i].equals("..")){
                stack.pop();
            }else if(s[i].equals("..")){

            }
            else{
                stack.push(s[i]);
            }
            i++;            
        }
        while(!stack.isEmpty()){
            String str = stack.pop();
            if(str.equals("..")) continue;
            result = "/" + str + result;
        }
        if(result.equals("")) result += "/";
        return result;
    }
}
