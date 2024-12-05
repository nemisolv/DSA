

#include <bits/stdc++.h>

using namespace std;

vector<int> twoSum(vector<int> &a, int k)
{
  int cnt = 0, n = a.size();
  map<int, int> mp;
  for(int i =0;i< n;i++) {
    if(mp.find(k - a[i]) != mp.end()) {
      return {mp[k - a[i]], i};
    }
    mp[a[i]] = i;
  }
  return {};
}

int main()
{
}