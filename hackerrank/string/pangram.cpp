/**
 * Cho 1 xâu kí tự, kiểm tra 1 xâu có phải là 1 xâu pangram hay không
 * Xâu pangram là 1 xâu gồm đầy dủ các tự từ a-z mà không phân biệt chữ hoa thường
 * 
 */

#include <iostream>

using namespace std;

int isPangram(string s)
{
    int cnt[256] = {0};
    for (char c : s)
    {
        cnt[tolower(c)] = 1;
    }
    for (int i = 97; i <= 122; i++)
    {
        if (cnt[i] == 0)
            return 0;
    }
    return 1;
}

int main()
{
    string s;
    cin >> s;
    if (isPangram(s) == 1)
    {
        cout << "YES\n";
    }
    else
    {
        cout << "NO\n";
    }

    return 0;
}