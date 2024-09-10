#include<iostream>
using namespace std;

typedef long long ll;
ll F[100];
void fibo() {
    F[0] = 0;
    F[1] = 1;
    for(int i = 2;i < 93;i++) {
        F[i] = F[i-1] + F[i-2];
    }
}

bool isFibo(ll n) {
    for(int i = 0;i < 93;i++) {
        if(F[i] == n) return true;
    }
    return false;
}


int main() {
    int n; cin >>n;
    int arr[n];
    for (int &x : arr) {
        cin >> x;
    }

    fibo();
    for(int x : arr) {
        if(isFibo(x)) {
            cout << x <<" ";
        }
    }
}