/*
Có n vẻ xem hóa nhạc có sẵn, mỗi vẻ có một mức giá nhất định. Sau đó, m khách hàng lần lượt đến. Mỗi khách hàng thông báo mức giá tối đa mà họ sẵn sàng trả cho một vẻ và sau đó, họ sẽ nhận được một vẻ với mức giá gần nhất có thế sao cho không vượt quá mức giá tối đa.
Input Format
Dòng đầu tiên chứa các số nguyên n và m: số lượng vẻ và số lượng khách hàng. Dòng tiếp theo ghi n số nguyên h1, h2,..., hn: giá của từng vé. Dòng cuối cùng chứa m số nguyên t1, t2,..., tm: giá tối đa cho mỗi khách hàng theo thứ tự họ đến.
Constraints
1s n, m ≤2.10^5; 1s ti, hi ≤10^9
Output Format
In, cho mỗi khách hàng, giá mà họ sẽ trả cho vé của họ. Sau đó, vé không thể được mua lại lần nữa. Nếu khách hàng không lấy được vẻ nào, hãy in -1.
Sample Input 0
5 3
5 3 7
8 5
4 8 3
Sample Output 0
3
-1
30
*/
#include <bits/stdc++.h>

using namespace std;
//v1 -> O(nlogn + mlogn) => not good, should use multiset
// int main() {
//     int n, m;
//     cin >> n >> m;
//     vector<int> h(n), t(m);
//     for (int i = 0; i < n; i++) {
//         cin >> h[i];
//     }
//     for (int i = 0; i < m; i++) {
//         cin >> t[i];
//     }
//     sort(h.begin(), h.end());
//     for (int i = 0; i < m; i++) {
//         int pos = upper_bound(h.begin(), h.end(), t[i]) - h.begin();
//         if (pos == 0) {
//             cout << -1 << endl;
//         } else {
//             cout << h[pos - 1] << endl;
//             h.erase(h.begin() + pos - 1);
//         }
//     }
//     return 0;
// }

// v2 -> multiset
int main() {
    int n, m;
    cin >> n >> m;
   multiset<int> ms;
   for(int i = 0; i < n; i++) {
       int x;
       cin >> x;
       ms.insert(x);
   }
   for(int i = 0; i < m; i++) {
       int x;
       cin >> x;
    // ve lon nhat <= x
       auto it = ms.upper_bound(x);
       // if it == ms.begin() => not found => -1 (all tien ve lon hon x)
       if(it != ms.begin()) {
           it--;
           cout << *it << endl;
           ms.erase(it);
       } else {
           cout << -1 << endl;
       }
   }
}