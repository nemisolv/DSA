/*
Bạn được cho biết thời gian đến và đi của n khách hàng trong một nhà hàng. Số lượng khách hàng có mặt tại cửa hàng ở 1 thời điểm nhiều nhất là bao nhiêu?
Input Format
Dòng nhập đầu tiên có số nguyên n: số lượng khách hàng. Sau đó, có n dòng mô tả khách hàng. Mỗi dòng có hai số nguyên a và b: thời gian đến và đi của một khách hàng. Bạn có thể cho rằng tất cả thời gian đến và đi là khác nhau.
Constraints
1s n, m ≤2.10^5; 1s a, b ≤10^9
Output Format
In một số nguyên: số lượng khách hàng tối đa.
*/

/**
 * Thời gian:     1   2   3   4   5   6   7   8   9
---------------------------------------------------
Khách hàng 1:     +   +   +   +   +   +   +   +   x
Khách hàng 2:         +   +   x
Khách hàng 3:             +   +   x
Khách hàng 4:                         +  +   x
---------------------------------------------------

1(1) -> 2(1) -> 3(1) -> 4(-1) -> 5(-1) -> 6(1) -> 8(-1) -> 9(-1)
dem = 1-> 2 -> 3 -> 2 -> 1 -> 2 -> 1 -> 0
Khách hàng đông nhất tại thời điểm 3 với 3 khách hàng
solve: đén +1, đi -1 -> sort lại theo thời gian -> duyệt từ đầu đến cuối, cộng dồn số khách hàng
  * 
 */

#include <bits/stdc++.h>
using namespace std;

int main() {
    int n;cin >>n;
    vector<pair<int, int>> a(n);
    for (int i = 0; i < n; i++) {
        int x, y; cin >> x >> y;
        a.push_back({x, 1});
        a.push_back({y, -1});
    }
    int res = 0;
    int ans = 0;
    sort(a.begin(), a.end());
    for(auto x: a) {
        res += x.second;
        ans = max(ans, res);
    }
    cout << ans;
}