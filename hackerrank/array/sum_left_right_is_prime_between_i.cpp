// problems: Cho mảng số nguyên arr[n]. Hãy liệt kê các chỉ số i thỏa mãn: tổng các phần tử bên trái chỉ số i và tổng các phần tử bên phải chỉ số i đều là số nguyên tố.

#include<iostream>
using namespace std;

bool isPrime(int n) {
    if(n < 2) return false;
    for(int i = 2;i * i <= n;i++) {
        if(n % i == 0) return false;
    }
    return true;
}

// O(n^2) bruteforce
// int main() {
//     int n; cin>>n;
//     int arr[n];
//     for(int &x: arr) cin >>x;

//     for(int i =1;i < n;i++) {
//         int sumLeft =0, sumRight = 0;
//         for(int j  = 0; j < i;j++) {
//             sumLeft += arr[j];
//         }
//         for(int j = i+1; j< n;j++) {
//             sumRight += arr[j];
//         }
//         if(isPrime(sumLeft) && isPrime(sumRight)) {
//             cout << i <<"\n";
//         }
    
//     }

//     return 0;
// }

// O(n)

int main() {
    int n; cin >>n;
    int arr[n];
    int sum = 0, sum_left = 0, sum_right = 0;
    for (int &x : arr) {
        cin >> x;
        sum+=x;
    }

    for(int x : arr) {
        sum_right == sum - sum_left - x;
        if(isPrime(sum_left) && isPrime(sum_right)) {
            cout << x <<"\n";
        }
        sum_left += x;

    }
}

