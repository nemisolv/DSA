/** Cho 2 mảng số nguyên a,b gồm n, m phần tử đôi một khác nhau.Các phần tử trong 2 mảng đã được sắp xép tăng dần. Hãy tìm mảng giao và mảng hợp của 2 mảng này.
 * 
 * 
 */
#include <bits/stdc++.h>
using namespace std;

int main()
{
    int n;
    cin >> n;
    int m; cin >>m;


    // mark array
    int a[n];
    for (int &x : a) {
        cin >> x;
    }
    int b[m];
    for(int &x: b)  {
        cin >>x;
    }

    vector<int> giao, hop;
    int i = 0, j = 0;
    while(i <n && i <m) {
        if(a[i] == b[j]) {
            giao.push_back(a[i]);
            hop.push_back(a[i]);
            i++;
            j++;
        } else if(a[i] < b[j]) {
            hop.push_back(a[i]);
            i++;
        } else {
            hop.push_back(b[j]);
            j++;
        }
    }
    while(i < n) {
        hop.push_back(a[i]);
        i++;
    }
    while(j < m) {
        hop.push_back(b[j]);
        j++;
    }

    cout << "giao: ";
    for(int x: giao) {
        cout << x << " ";
    }
    cout << endl;
    cout << "hop: ";
    for(int x: hop) {
        cout << x << " ";
    }

    return 0;
}