package fundamental.Graph;

import java.util.LinkedList;
import java.util.Queue;

public class BreathFirstSearch {
    public static void DFS(int[][] graph) {
        Queue<Integer> queue = new LinkedList<>();
        boolean visited[] = new boolean[graph.length];
        queue.add(0);
        visited[0] = true;
        while (!queue.isEmpty()){
            int u = queue.poll();
            System.out.printf("%d ",u);
            for (int i = 0; i < graph.length; i++) {
                if(graph[u][i]==1 && visited[i]==false){
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        int [][]graph = {
                {0,1,0,0,0,0,0},
                {1,0,1,1,1,0,0},
                {0,1,0,0,0,1,0},
                {0,1,0,0,0,1,1},
                {0,1,0,0,0,0,1},
                {0,0,1,1,0,0,0},
                {0,0,0,1,1,0,0}
        };
        DFS(graph);


    }
}
