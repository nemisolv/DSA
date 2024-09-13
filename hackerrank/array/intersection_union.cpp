
#include <bits/stdc++.h>
using namespace std;

int dA[10000001], dB[10000001];
int main()
{
    int n;
    cin >> n;
    int m; cin >>m;

    // set map -> not perfect
    // set <int> c;
    // set<int> d;

    // int a[n];
    // for (int &x : a) {
    //     cin >> x;
    //     c.insert(x);
    // }
    // int b[m];
    // for(int &x: b)  {
    //     cin >>x;
    //     d.insert(x);
    // }

    // cout << "intersection"<<endl;
    // for(int x : c) {
    //     if(d.find(x) != d.end()) {
    //         cout << x << " ";
    //     }
    // }
    // cout << endl;

 
    // // union
    // cout << "union"<<endl;
    // for(int x: d) {
    //     c.insert(x);
    // }
    // for(int x: c) {
    //     cout << x << " ";
    // }



    // mark array
    int a[n];
    for (int &x : a) {
        cin >> x;
        dA[x]++;
    }
    int b[m];
    for(int &x: b)  {
        cin >>x;
        dB[x]++;
    }

    vector<int> giao, hop;
    for(int i = 0; i < 10000001; i++) {
        if(dA[i] > 0 && dB[i] > 0) {
            giao.push_back(i);
        }
        if(dA[i] > 0 || dB[i] > 0) {
            hop.push_back(i);
        }
    }
    for(int x: giao) {
        cout << x << " ";
    }
    cout << endl;
    for(int x: hop) {
        cout << x << " ";
    }
    




    return 0;
}