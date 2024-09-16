// Cho 2 xâu ký tự s1 và s2. Hãy in ra các kí tự xuất hiện trong s1 và không xuất hiện trong s2 và ngược lại, các kí tự chỉ được in 1 lần và theo thứ tự từ điển

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
    // only in s1
    for (int i = 0; i < 256; i++)
    {
        if (cnt1[i] && cnt2[i]==0)
        {
            cout << (char)i ;
        }
    }
    cout << endl;
    // only in s2
    for (int i = 0; i < 256; i++)
    {
        if (cnt1[i]==0 && cnt2[i])
        {
            cout << (char)i ;
        }
    }
}