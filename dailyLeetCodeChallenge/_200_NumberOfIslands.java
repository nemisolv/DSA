package dailyLeetCodeChallenge;

public class _200_NumberOfIslands {
    boolean visited[][] = new boolean[300][300];
    int soHang;
    int soCot;

    public boolean isValid(int i, int j) {
        return i >= 0 && j >= 0 && i < soHang && j < soCot;
    }

    public void DFS(char[][] a, int i, int j) {
        if (isValid(i, j) == false) {
            return;
        }
        if (a[i][j] == '0' || visited[i][j] == true) {
            return;
        }
        visited[i][j]=true;

        DFS(a,i,j+1);
        DFS(a,i,j-1);
        DFS(a,i+1,j);
        DFS(a,i-1,j);
    }

    public int numIslands(char[][] a) {
        int count = 0;
        soHang = a.length;
        soCot = a[0].length;
        for (int i = 0; i < soHang; i++) {
            for (int j = 0; j < soCot; j++) {
                if (a[i][j] == '1' && visited[i][j] == false) {
                    DFS(a, i, j);
                    count++;
                }
            }
        }
        return count;
    }
}
