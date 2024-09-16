
// Cho mảng số nguyên a[n] gồm n phần tử, có q truy vấn. Mỗi truy ván là 2 số l, r. Bạn hãy tính tổng các số từ l đến r trong mảng a.
// topic: prefix sum

#include<bits/stdc++.h>
using namespace std;

int main() {
    int n; cin >>n;
    int a[n];
    for(int &x: a) cin >>x;
    int d[n+1];
    d[0] = a[0];
    for(int i=1; i<n; ++i) d[i] = d[i-1] + a[i];
    int q; cin >>q;
    while(q--) {
        int l, r; cin >>l >>r;
        if(l == 0) cout <<d[r] <<endl;
        else
        cout <<d[r] - d[l-1] <<endl;
    }
}