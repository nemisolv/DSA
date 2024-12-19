// https://leetcode.com/problems/search-insert-position/description/?envType=problem-list-v2&envId=array

#include <bits/stdc++.h>

using namespace std;

int searchInsert(vector<int> &a, int k)
{
    int l = 0, r = a.size() - 1;
    while (l <= r)
    {
        /**
### Explanation:

1.  **Potential Integer Overflow**:

    *   If `l` and `r` are large integers (e.g., close to the maximum value of `int`), adding them directly (`l + r`) can exceed the range of the integer type and cause an overflow. This results in undefined behavior in C++.
    *   The alternative, `l + (r - l) / 2`, avoids this by ensuring that the subtraction `(r - l)` is computed first, which will always be a valid number as long as `r >= l`.
2.  **Mathematical Equivalence**:

    *   Both `m = l + (r - l) / 2` and `m = (l + r) / 2` calculate the middle index, but the former is safer.
    *   When simplified:

        l + (r - l) / 2
        = l + r / 2 - l / 2
        = (2l + r - l) / 2
        = (l + r) / 2


*   Integer overflow can only happen when `l` and `r` are large and their sum exceeds the maximum limit of `int`. On most systems, this is `2,147,483,647` for a 32-bit signed integer.
*   Using `l + (r - l) / 2` is a good habit that works across all scenarios without risk.

In the `searchInsert` function, `m = l + (r - l) / 2` ensures safety even when the input array size or values are large. The function otherwise performs standard binary search logic to determine the index of `k` in the sorted array or the position it should be inserted.

* * *

         *
         */
        int m = l + (r - l) / 2;
        if (a[m] == k)
        {
            return m;
        }
        else if (a[m] < k)
        {
            l = m + 1;
        }
        else
        {
            r = m - 1;
        }
    }
    return l;
}

int main()
{
    int n;
    cin >> n;
    vector<int> a(n);

    // pass by reference
    for (int &x : a)
        cin >> x;
    int k;
    cin >> k;
    cout << searchInsert(a, k) << endl;
}