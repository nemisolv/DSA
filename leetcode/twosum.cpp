#include <bits/stdc++.h>

using namespace std;

// O(1) for search,
// O(n) for loop
// overall O(n) time complexity in the best case, otherwise O(nlogn) in the worst case
vector<int> twoSum(vector<int> &a, int k)
{
  int n = a.size();
  // use 'unordered_map' instead of 'map' to reduce time complexity -> but not stable -> in the worst case it will be O(n), because of hash collision
  unordered_map<int, int> mp;
  for(int i =0;i< n;i++) {
    if(mp.find(k - a[i]) != mp.end()) {
      return {mp[k - a[i]], i};
    }
    mp[a[i]] = i;
  }
  return {};
}
// O(n^2) 
//  vector<int> twoSum(vector<int>& a, int k) {
//         int cnt =0, n = a.size();
//         for(int i = 0;i < n;i++) {
//             for(int j = i+1;j< n;j++) {
//                 if(a[i] + a[j] ==k) {
//                     return {i,j};
//                 }
//             }
//         }
//         return {};
//     }

int main()
{
  vector<int> a = {2, 7, 11, 15};
  int k = 9;
  vector<int> res = twoSum(a, k);
  for(auto x: res) {
    cout << x << " ";
  }
  cout << endl;
}



