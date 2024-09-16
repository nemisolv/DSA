package dailyLeetCodeChallenge;

public class _1672_RichestCustomerWealth {
    public static int maximumWealth(int[][] accounts) {
        int wealthOfCustomer = 0;
        int max =0;
        for (int i = 0; i < accounts.length; i++) {
            wealthOfCustomer = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                wealthOfCustomer+=accounts[i][j];
            }
            if(max < wealthOfCustomer) {
                max = wealthOfCustomer ;
            }
        }
        return max;
    }
    public static void main(String[] args) {
int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(maximumWealth(a));
    }
}
