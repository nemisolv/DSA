/**
 * 
 * 
 */

#include<iostream>

using namespace std;

int main() {
    int n; cin >>n;
    int a[n];
    for(int &x: a) cin >> x;

 
    // first
    cout << a[1] - a[0] << " " << a[n-1] - a[0] << endl;
    for(int i = 1; i< n-1;i++) {
        int mini = min(a[i] - a[i-1], a[i+1] - a[i]);
        int maxi = max(a[i] - a[0], a[n-1] - a[i]);
        cout << mini << " " << maxi << endl;
    }
    // last
    cout << a[n-1] - a[n-2] <<  " " << a[n-1] - a[0] << endl;

    return 0;
}