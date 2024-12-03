/** Cặp số có tổng bằng K
 *  Cho mảng a gồm n phần tử và số nguyên K. Hãy đếm số cặp số (a[i], a[j]) (i!=j) sao cho a[i] + a[j] < k.
 */

#include <bits/stdc++.h>

using namespace std;
int main()
{
    int n;
    cin >> n;
    int a[n];
    for (int &x : a)
    {
        cin >> x;
    }
    int k;
    cin >> k;
    int cnt = 0;
    sort(a, a + n);
    for (int i = 0; i < n; i++)
    {
        int x = k - a[i];
        auto it = lower_bound(a + i + 1, a + n, x);
        --it;
        cnt += it - (a + i);
    }
    cout << cnt;
}