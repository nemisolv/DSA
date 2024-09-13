// cho 1 dãy số nguyên dương có n phần tử. Hãy đém các cặp số nguyên tố cùng nhau trong mảng.


// => nguyên tó cùng nhau là 2 số nguyên tố mà ước chung lớn nhất của chúng là 1.
#include<bits/stdc++.h>

using namespace std;

int gcd(int a, int b) {
    if(b == 0) return a;
    return gcd(b, a%b);
}

int main() {
    int n;cin >>n;
    int a[n];
    for(int &x: a) cin >>x;
    int cnt = 0;
    for(int i = 0; i < n; i++) {
        for(int j = i+1; j < n; j++) {
            if(gcd(a[i], a[j]) == 1) {
                 cnt++;
                 cout << a[i] << " " << a[j] << endl;
            }
        }
    }

    cout << cnt;


    return 0;
}