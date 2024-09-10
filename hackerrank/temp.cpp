
#include<iostream>
using namespace std;

bool isFibo(int n) {
    if(n < 2) return false;
    int a = 0, b = 1;
    while(b < n) {
        int c = a + b;
        a = b;
        b = c;
    }
    return b == n;
}

int main() {
    int n; cin >>n;
    int arr[n];
    for (int &x : arr) {
        cin >> x;

    }

    for(int x : arr) {
        if(isFibo(x)) {
            cout << x <<" ";
        }
    }

}

