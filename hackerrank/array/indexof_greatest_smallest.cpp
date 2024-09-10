/**
 * Cho mảng số nguyên arr[n], hãy tìm vị trí(từ 0) cuối cùng của giá trị nhỏ nhất trong mảng
 * vả vị trí đầu tiên của giá trị lớn nhất trong mảng. Tức là nếu có nhiều số nhỏ nhất thì vị trí cuối cùng của số nhỏ nhất đó được chọn, và nếu có nhiều số lớn nhất thì vị trí đầu tiên của số lớn nhất đó được chọn.
 * 
 * Sample Input
 * 5
 * 1 3 5 3 7
 * Sample Output
 * 4 0
 */

#include<iostream>
using namespace std;

int main() {
    int n;cin >>n;
    int arr[n];
    for(int &x: arr) cin >>x;
    int idx_min_val = 0, idx_max_val = 0;
    for(int i = 1;i < n;i++) {
        if(arr[i] <= arr[idx_min_val]) {
            idx_min_val = i;
        }
        if(arr[i] > arr[idx_max_val]) {
            idx_max_val = i;
        }
    }
    cout << idx_max_val <<" "<<idx_min_val;
}