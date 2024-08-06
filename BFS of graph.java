BFS of graph
Given a directed graph. The task is to do Breadth First Traversal of this graph starting from 0.
Note: One can move from node u to node v only if there's an edge from u to v. Find the BFS traversal 
of the graph starting from the 0th vertex, from left to right according to the input graph. Also, you 
should only take nodes directly or indirectly connected from Node 0 in consideration.

class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        boolean visited[] = new boolean[V];
        ArrayList<Integer> result = new ArrayList<>();
        Queue<Integer> que = new LinkedList<>();
        
        que.add(0);
        visited[0] = true;
        while(!que.isEmpty()){
            int node = que.poll();
            result.add(node);
            for(int i: adj.get(node)){
                if(!visited[i]) que.add(i);
                visited[i] = true;
            }
        }
        return result;
    }
}
