/**Bộ phim "Die Hard" được phát hành . Có n người đứng thành hàng. Mỗi người trong số họ có 1 tờ tiền mệnh giá 100, 50 hoặc 25 rúp. Một vé là 25 rúp. Nhân viên đặt phòng có thể bán vé cho mỗi người và trả tiền thừa nếu ban đầu anh ta không có tiền và bán vé theo đúng thứ tự mọi người trong hàng không ?
 * Sample input:
 * 5
 * 
 25 25 25 50 50
 * Sample output: YES

 Sample input:
 5
 25 100 25 25 50
    * Sample output: NO
 * 
 */
#include<iostream>
using namespace std;

int d[101] = {0};
int check(int a[], int n) {
    for(int i =0; i<n;i++) {
        if(a[i] ==25) {
            d[25]++;
        }else if(a[i] ==50) {
            if(d[25] > 0) {
                d[25]--;
                d[50]++;
            }else return 0;
        }else {
            if(d[50] >0 && d[25] >0) {
                d[50]--;
                d[25]--;
                d[100]++;
            }else if(d[25] >= 3) {
                d[25] -= 3;
                d[100]++;
            }else return 0;
        }
    }
    return 1;
}
int main() {
    int n; cin >>n;
    int a[n];
    for(int &x: a) {
        cin >> x;
        // d[x]++;  -> wrong, because everyone is in the queue, so we need to check in the order of the queue
    }
    if(check(a,n)) cout << "YES";
    else cout << "NO";
    
    return 0;
}