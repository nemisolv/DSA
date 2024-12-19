#include <bits/stdc++.h>

using namespace std;

using ll = long long;

int searchInsert(vector<int> &a, int k)
{
  int l = -1;
  for(int i = 0;i <a.size();i++) {
    if(a[i] == k) {
      return i;
    }else if(a[i] < k) {
      l = i;
    }
  }

  return l + 1;
}

int main()
{

  int n;
  cin >> n;
  vector<int> a(n);
  for(int i = 0;i < n;i++) {
    cin >> a[i];
  }
  int k;
  cin >> k;
  cout << searchInsert(a, k) << endl;
}