// problems: Cho mảng số nguyên A[] gồm n phần tử. Hãy đếm số lượng phần tử có giá trị nhỏ nhất trong mảng.
// Input Format
// Dòng đầu tiên chứa một số nguyên n (1 ≤ n ≤ 10^5) – số lượng phần tử của mảng A[].
// Dòng thứ 2 chứa n số nguyên A1, A2, . . ., An (1 ≤ A[i] ≤ 10^9).
// Output Format
// Đưa ra một số nguyên – số lượng phần tử có giá trị nhỏ nhất trong mảng.
// Sample Input
// 6
// 1 2 3 4 1 2
// Sample Output
// 2

#include<iostream>

using namespace std;

int main() {
    int n; cin >>n;
    int arr[n];
    int min_val = INT_MAX;
    int count = 0;
    for(int &x: arr)  {
        cin >> x;
        if(x < min_val) {
            count = 1;
            min_val = x;
        }else if(x == min_val) {
            count++;
        }
    }

    cout << count <<"\n";


   

    return 0;
}