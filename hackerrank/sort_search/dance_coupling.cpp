/*
Đại học Bang Berland đang tổ chức một buổi khiêu vũ trong lễ kỷ niệm 100500 năm thành lập! n các chàng trai và m cô gái đã bận rộn luyện tập các động tác nhảy múa. Chúng tôi biết rằng một số cặp nam và nữ sẽ được mời tham dự vũ hội. Tuy nhiên, kỹ năng khiêu vũ của các đối tác trong mỗi cặp khác nhau nhiều nhất là một đơn vị. Đối với mỗi cậu bé, chúng tôi biết kỹ năng nhảy của cậu ấy. Tương tự, đối với mỗi cô gái, chúng tôi biết kỹ năng khiêu vũ của cô ấy. Viết mã xác định số cặp lớn nhất có thể được hình thành từ n trai và m gái.
Input Format
Dòng đầu tiên chứa số nguyên n và m (1 ≤ n, m ≤ 10^5) - số bé trai và số bé gái. Dòng thứ hai chứa dầy Dòng thứ ba chứa dầy b1, b2, ..., bm (1 ≤ bj ≤ 10^5), trong đó bị là kỹ năng nhảy của cô gái thứ j.
Constraints
1 ≤ n, m ≤ 10^5; 0 ≤ ai ≤ 10^5; 0 ≤ bj ≤ 10^5
*/

#include <bits/stdc++.h>
using namespace std;
int main() {
    int n; cin >> n;
    int m; cin >> m;
    vector<int> a(n), b(m);

    for (int &x: a) cin >> x;
    for (int &x: b) cin >> x;

    sort(a.begin(), a.end());
    sort(b.begin(), b.end());
    int i = 0, j = 0, ans = 0;

    // must be a couple
    while(i < a.size() && j < b.size()) {
        if(abs(a[i] - b[j]) <=1) {
            i++; j++; ans++;
        }else if(a[i] < b[j]) {
            i++;
        }  else {
            j++;
        }
    }
    cout << ans << endl;
}