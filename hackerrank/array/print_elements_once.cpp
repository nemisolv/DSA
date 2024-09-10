// problems: Cho mảng số nguyên A[] gồm n phần tử. Hãy in ra các phần tử xuất hiện đúng 1 lần trong mảng theo thứ tự xuất hiện trong mảng cùng tần suất xuất hiện của chúng.

#include <iostream>

using namespace std;

int d[10000001] = {0};
int main()
{
    int n;
    cin >> n;
    int arr[n];
    // O(n^2) bruteforce
    // for(int &x: arr) cin >>x;

    // for(int i = 0;i <n;i++) {
    //     bool isAppear = false;
    //     for(int j = 0; j < i;j++ ) {
    //         if(arr[i] == arr[j]) {
    //             isAppear = true;
    //             break;
    //         }
    //     }
    //     if(!isAppear) {
    //         cout << arr[i] <<" ";
    //     }
    // }

    // O(n) using mark array
    int max_val = INT_MIN;
    for (int &x : arr)
    {
        cin >> x;
        d[x]++;
        max_val = max(max_val, x);
    }

    for (int i = 0; i <= max_val; i++)
    {
        if (d[i] >= 1)
        {
            cout << i << " " << d[i] << "\n";
            d[i] = 0;
        }
    }

    return 0;
}