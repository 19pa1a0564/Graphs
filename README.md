# Graphs
class Solution
{
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj)
    {
        // Code here
        ArrayList<Integer> answer = new ArrayList<Integer>();
        boolean visited []=new boolean[V];
        dfs(0,adj,answer,visited);
        return answer;
    }
    public void dfs(int point, ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> answer,boolean visited[]){
        visited[point]=true;
        answer.add(point);
        for (Integer neighbour:adj.get(point)){
            if(!visited[neighbour]){
                dfs(neighbour,adj,answer,visited);
            }
            
        }
    }
}
