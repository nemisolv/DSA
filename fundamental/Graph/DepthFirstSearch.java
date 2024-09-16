package fundamental.Graph;

import java.util.Stack;

public class DepthFirstSearch {
    public static void DFS(int[][] graph) {
        Stack<Integer> stack = new Stack<>();
        boolean visited[] = new boolean[graph.length];
        stack.add(0);
        visited[0] = true;
        while (!stack.isEmpty()){
            int u = stack.pop();
            System.out.printf("%d ",u);
            for (int i = 0; i < graph.length; i++) {
                if(graph[u][i]==1 && visited[i]==false){
                    stack.add(i);
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
