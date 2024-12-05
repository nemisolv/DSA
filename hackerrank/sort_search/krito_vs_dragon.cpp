/**
 * Kirito đang bị mắc kẹt ở cấp độ của MMORPG mà anh ấy đang chơi hiện tại. Để tiếp tục trò chơi, anh ta phải đánh bại tất cả n con rồng sống ở cấp độ này. Kirito và những con rồng có sức mạnh, được biểu thị bằng một số nguyên. Trong cuộc đọ sức giữa hai đối thủ, kết quả của cuộc đọ sức được quyết định bởi sức mạnh của họ. Ban đầu, sức mạnh của Kirito bằng s.
• Nếu Kirito bắt đầu đầu tay đôi với rồng thứ i (1 si s n) và sức mạnh của Kirito không lớn hơn sức mạnh của rồng có sức mạnh là xi, thì Kirito thua trận đấu và chết. Nhưng nếu sức mạnh của Kirito lớn hơn sức mạnh của con rồng, thì anh ta sẽ đánh bại con rồng và được tăng thêm sức mạnh theo là MI
• Kirito có thể chiến đầu với những con rồng theo bất kỳ thứ tự nào. Xác định xem liệu anh ta có thể chuyến sang cấp độ tiếp theo của trò chơi hay không, tức là đánh bại tất cả những con rồng mà không bị thua một lần nào.
Input Format
• Dòng đầu tiên chứa hai số nguyên được phân tách bằng dầu cách n và s (1 ≤5 ≤ 10^6, 1 ≤ n ≤ 10^5).
• Sau đó n dòng tiếp theo: dòng thứ i chứa các số nguyên được phân tách bằng dầu cách là xi và yi (1 ≤ xi s 10^4, 0 ≤ yi s 10^4) - sức mạnh của con rồng thứ i và sức mạnh được tăng thêm khi đánh bại nó.
 *
 */

#include <bits/stdc++.h>
using namespace std;

int main() {
    int n; cin>>n;
    long long s; cin>>s;
    vector<pair<long long, long long>> a(n);
    for (int i = 0; i < n; i++) {
        cin >> a[i].first >> a[i].second;
    }
    sort(a.begin(), a.end());
    for (int i = 0; i < n; i++) {
        if (s <= a[i].first) {
            cout << "NO" << endl;
            return 0;
        }
        s += a[i].second;
    }
    cout << "YES" << endl;
}