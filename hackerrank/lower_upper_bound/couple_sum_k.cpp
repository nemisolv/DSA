/** Cặp số có tổng bằng K
 *  Cho mảng a gồm n phần tử và số nguyên K. Hãy đếm số cặp số (a[i], a[j]) (i!=j) sao cho a[i] + a[j] = k.
 * Gợi ý: Sắp xếp mảng tăng dần sau dố với mỗi phần tử a[i] tỏng mảng tìm xem trong đoạn [i+1, n-1] có 
 * bao nhiêu phần tử có giá trị là k - a[i], bằng cách tìm vị trí đầu tiên(lower_bound) và vị trí cuối cùng(upper_bound) của phần tử có giá trị là k - a[i] trong mảng. => số lượng
 */

#include<bits/stdc++.h>

using namespace std;
int main() {
    int n;cin >>n;
    int a[n];
    for(int &x: a)  {
        cin >> x;
    }
    int k; cin >>k;
    int cnt = 0;
    sort(a,a+n);
    for(int i =0;i< n ;i++) {
      int x = k - a[i];
      auto it1 = lower_bound(a+i+1,a+n,x);
      auto it2 = upper_bound(a+i+1,a+n,x);
        cnt += (it2 - it1);

    }
    cout <<cnt;
}