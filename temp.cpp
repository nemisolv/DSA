


#include<bits/stdc++.h>


using namespace std;



int main() {
    int n;cin >>n;
    int a[n];
    for(int &x: a)  {
        cin >> x;
    }

    int k; cin >>k;
    int cnt = 0;
    for(int i =0;i< n ;i++) {
      int x = k - a[i];
      auto it = lower_bound(a+i+1,a+n,x); // >=
      if(it != a+n ) {
        if(a[*it] == x) {
            cnt+= (*it -i);
        }else {
            cnt++;
        }
      }

    }
    cout <<cnt;

  

  
}