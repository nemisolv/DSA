/** 
 * Cho mảng A[] gồm n phần tử. Tìm giá trị nhỏ nhất(phải thuộc A[] và lớn hơn a[i]).
 * Đưa ra _ nếu không tồn tại.
 */

#include <bits/stdc++.h>

using namespace std;
int main()
{
    int n;
    cin >> n;
    int a[n];
    for (int &x : a)
    {
        cin >> x;
    }
    int cloneA[n];
    copy(a, a + n, cloneA);
    sort(cloneA, cloneA + n);
    for(int x : a) {
        int *it = upper_bound(cloneA, cloneA + n, x);
        if(it == cloneA + n) {
            cout << "_ ";
        }else {
            cout << *it << " ";
        }
    }
    
}