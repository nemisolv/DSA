/** Vanya đi bộ vào ban đêm dọc theo 1 con đường thẳng có độ dài l, được thắp sáng bởi n chiếc đèn lồng.
 * Xét hệ trục tọa độ với điểm đầu con đường có tọa độ 0, điểm cuối con đường có tọa độ l. Khi đó đèn lồng thứ i ở điểm ai.
 * Đèn lồng chiếu sáng tất cả các điểm trên đường phố cách nó nhiều nhất là d, trong đó d là 1 số dương, chung cho tất cả
 * các đèn lồng. Vanya tự hỏi: bán kính ánh sáng tối thiểu d mà đèn lồng phải có để thắp sáng toàn bộ con đường.
 */

   // illustrate with image: road with lantern : @===@=====@=====@=====@ (road with lanterns)
   /**
    * problem can be solve by using binary search.
    * first, we need to sort the array of laterns.
    * then, we need to find the maximum distance of a[0] and a[n-1] to the road. -> d = max(a[0], l - a[n-1])
    * then, we need to find the maximum distance between two laterns. -> max(a[i+1] - a[i]) / 2 
    */

#include <bits/stdc++.h>
using namespace std;
int main() {
    int n, l;
    cin >> n >> l;
    vector<int> a(n);
    for (int i = 0; i < n; i++) {
        cin >> a[i];
    }
    sort(a.begin(), a.end());
    double d = max(a[0], l - a[n-1]);
    for (int i = 0; i < n-1; i++) {
        d = max(d, (double)(a[i+1] - a[i]) / 2);
    }
    cout << fixed << setprecision(10) << d << endl;
    return 0;
    
}