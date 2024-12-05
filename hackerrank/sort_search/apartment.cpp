/*
CóNngười nộp đơn và m căn hộ miễn phí. Nhiệm vụ của bạn là phân phối căn hộ sao cho càng nhiều người nộp đơn càng tốt sẽ nhận được căn hộ. Mỗi người nộp đơn đều có một kích thước căn hộ mong muốn và họ sẽ chấp nhận bất kỳ căn hộ nào có kích thước gần với kích thước mong muốn. Đầu vào

Dòng đầu tiên chứa ba số nguyên N,m, Và k: số lượng người nộp đơn, số lượng căn hộ và mức chênh lệch tối đa được phép.

Dòng tiếp theo chứa N số nguyêna1, a2, , an: kích thước căn hộ mong muốn của mỗi người nộp đơn. Nếu kích thước mong muốn của một người nộp đơn là x, anh ấy hoặc cô ấy sẽ chấp nhận bất kỳ căn hộ nào có kích thước từ x - k Và x+k. Dòng cuối cùng chứa m số nguyênb1, b2, , bm: diện tích của mỗi căn hộ.

Đầu ra

In ra một số nguyên: số người nộp đơn sẽ nhận được căn hộ.

Hạn chế

1 < n, m \< 10^5

0 < k <10^9

1 <ai, b_i <10^9</p>

Ví dụ

Đầu vào:

4 3 5

60 45 80 60

30 60 75

Đầu ra:

2
*/

#include <bits/stdc++.h>
using namespace std;
int main() {
    int n, m, k; cin >> n >> m >> k;
    vector<int> a(n), b(m);
    for (int &x: a) cin >> x;
    for (int &x: b) cin >> x;
    sort(a.begin(), a.end());
    sort(b.begin(), b.end());
    int i = 0, j = 0, ans = 0;
    while(i < a.size() && j < b.size()) {
        if(abs(a[i] - b[j]) <= k) {
            i++; j++; ans++;
        }else if(a[i] < b[j]) {
            i++;
        }  else {
            j++;
        }
    }
    cout << ans << endl;
}