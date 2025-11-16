class Solution {
    public void DFS(int[][] connect, int V, boolean[] visited){
        visited[V] = true;
        int n = connect.length;
        for(int i=0;i<n;i++){
            if(connect[V][i] == 1 && !visited[i]){
                DFS(connect,i,visited);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int numberOfComponent = 0;
        int n = isConnected.length;
        boolean[] visit = new boolean[n];
        for(int i =0;i<n;i++){
            if(!visit[i]){
                numberOfComponent++;
                DFS(isConnected,i,visit);
            }
        }
        return numberOfComponent;
    }
}