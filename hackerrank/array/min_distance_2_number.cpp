// Cho mảng số nguyên A[] gồm n phần tử. Hãy tìm độ chênh lệch nhỏ nhất giữa 2 phần tử bất kỳ trong mảng.
// Input Format
// Dòng đầu tiên chứa một số nguyên n (2 ≤ n ≤ 10^5) – số lượng phần tử của mảng A[].
// Dòng thứ 2 chứa n số nguyên A1, A2, . . ., An (1 ≤ A[i] ≤ 10^9).
// Output Format
// Đưa ra m
// Một số nguyên – độ chênh lệch nhỏ nhất giữa 2 phần tử bất kỳ trong mảng.
// Sample Input
// 5
// 1 5 3 19 18
// Sample Output
// 1

#include <iostream>
#include <algorithm>

using namespace std;

int main()
{
    int n;
    cin >> n;
    int arr[n];
    int count = 0;
    for (int &x : arr)
    {
        cin >> x;
    }
    sort(arr, arr + n);

    int min_val = INT_MAX;

    for (int i = 0; i < n - 1; i++)
    {
        int diff = arr[i + 1] - arr[i];
        if (diff < min_val)
        {
            min_val = diff;
        }
    }

    cout << min_val << "\n";

    return 0;
}

// bruteforce: O(n^2)
// int main() {
//     int n; cin >>n;
//     int arr[n];
//     int min_val = INT_MAX;
//     for(int &x: arr)  {
//         cin >> x;
//     }

//     for(int i = 0;i < n;i++) {
//         for(int j = i + 1;j < n;j++) {
//             int diff = abs(arr[i] - arr[j]);
//             if(diff < min_val) {
//                 min_val = diff;
//             }
//         }
//     }

//     cout << min_val <<"\n";

//     return 0;
// }