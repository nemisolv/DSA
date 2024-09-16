// Cho 2 xâu ký tự s và t. Hãy in ra các ký tự xuất hiện cả trong s và t( các kí tự chỉ được in 1 lần) và theo thứ tự từ điển
// Sau đó tiếp tục liệt kê các kí tự xuất hiện ở 1 trong 2 xâu  theo thứ tự từ điển.

#include <iostream>
using namespace std;

int main()
{
    string s, t;
    cin >> s >> t;
    int cnt1[256] = {0}, cnt2[256] = {0};
    for (int i = 0; i < s.size(); i++)
    {
        cnt1[s[i]] = 1;
    }
    for (int i = 0; i < t.size(); i++)
    {
        cnt2[t[i]] = 1;
    }
    // intersection
    for (int i = 0; i < 256; i++)
    {
        if (cnt1[i] && cnt2[i])
        {
            cout << (char)i ;
        }
    }
    cout << endl;
    // union
    for (int i = 0; i < 256; i++)
    {
        if (cnt1[i] || cnt2[i])
        {
            cout << (char)i ;
        }
    }
}