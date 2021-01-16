class Solution
{
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj)
    {
        // Code here
        ArrayList<Integer> result=new ArrayList<Integer>();
        boolean []visited =new boolean[V];
        LinkedList<Integer> queue=new LinkedList<Integer>();
        visited[0]=true;
        queue.add(0);
        result.add(0);
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i=0;i<size;i++){     
                int cur=queue.removeFirst();
                for(Integer neighbour:adj.get(cur)){
                    if(!visited[neighbour]){
                        visited[neighbour]=true;
                        queue.add(neighbour);
                        result.add(neighbour);
                    }
                }
            }
        }
        return result;
    }
}
