// problems: Cho mảng số nguyên A[] gồm n phần tử và một số nguyên k. Hãy đếm số cặp phần tử (A[i], A[j]) sao cho A[i] + A[j] = k.
// Input Format
// Dòng đầu tiên chứa 2 số nguyên n, k (2 ≤ n ≤ 10^5, 1 ≤ k ≤ 10^3) – số lượng phần tử của mảng A[] và số nguyên k.
// Dòng thứ 2 chứa n số nguyên A1, A2, . . ., An (1 ≤ A[i] ≤ 10^3).
// Output Format
// Đưa ra một số nguyên – số cặp phần tử (A[i], A[j]) sao cho A[i] + A[j] = k.
// Sample Input
// 5 6
// 1 2 3 4 5
// Sample Output
// 2

#include <iostream>

using namespace std;
// c1
// int main() {
//     int n; cin >>n;
//     int k; cin >> k;
//     int arr[n];
//     int cnt = 0;
//     for(int &x: arr) cin >> x;

//     for(int i =0;i < n;i++) {
//         for(int j = i + 1;j < n;j++) {
//             if(arr[i] + arr[j] ==k) {
//                 cnt++;
//             }
//         }
//     }
//     cout << cnt;

//     return 0;
// }

// c2

int main()
{
    int n;
    cin >> n;
    int k;
    cin >> k;
    int arr[n];
    int cnt = 0;
    int d[1001] = {0};
    for (int &x : arr)
    {
        cin >> x;
        d[x]++;
    }

    for (int x = 0; x <= k / 2; x++)
    {
        int y = k - x;
        if (x != y)
        {
            cnt += d[x] * d[y];
        }
        else
        {
            cnt += d[x] * (d[x] - 1) / 2;
        }
    }
    cout << cnt;

    return 0;
}