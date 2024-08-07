DFS of Graph
You are given a connected undirected graph. Perform a Depth First Traversal of the graph.
Note: Use the recursive approach to find the DFS traversal of the graph starting from the 0th vertex from left to right according to the graph.

class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        boolean[] visited = new boolean[V];
        ArrayList<Integer> ans = new ArrayList<>();
        
        dfs(0, adj, visited, ans);
        return ans;
    }
    public static void dfs(int v, ArrayList<ArrayList<Integer>> adj, boolean[] visited, ArrayList<Integer> ans){
        visited[v] = true;
        
        ans.add(v);
        for(Integer i: adj.get(v)){
            if(!visited[i]){
                dfs(i, adj, visited, ans);
            }
        }
    }
}
