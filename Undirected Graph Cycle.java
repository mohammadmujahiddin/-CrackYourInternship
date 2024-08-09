Undirected Graph Cycle
Given an undirected graph with V vertices labelled from 0 to V-1 and E edges, 
check whether it contains any cycle or not. Graph is in the form of adjacency list where adj[i] contains all the nodes ith node is having edge with.

class Solution {
    // Function to detect cycle in an undirected graph.
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] vis = new boolean[V];
        for(int i = 0; i < V; i++){
            if(vis[i]==false){
                if(dfs(i,vis,adj,V,-1) ) return true;
            }
        }
        return false;
    }
    
    public boolean dfs(int node, boolean[] vis, ArrayList<ArrayList<Integer>> adj,int V,int parentNode ){
        vis[node] = true;
        for(int adjacentNode :adj.get(node) ){
            if( vis[adjacentNode] == false ){
                if (dfs(adjacentNode,vis,adj,V, node)) return true;
            }
            else if( vis[adjacentNode] == true ){
                if( adjacentNode != parentNode  ) return true;
            }
            
        }
        return false;
    }
}
