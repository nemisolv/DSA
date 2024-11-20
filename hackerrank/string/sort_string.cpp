/**
 * Cho 1 xâu kí tự gồm các từ được cách nhau bởi dấu cách.Đầu tiên hãy sắp xếp các từ trong xâu theo thứ tự từ điển tăng dần,
 *  sau đó hãy sắp xếp các từ trong xâu theo thứ tự chiều dài tăng dần, trong trường hợp 2 từ có cùng độ dài thì sắp xếp theo thứ tự từ điển tăng dần.
 */

#include<iostream>
#include<sstream>
#include<vector>
#include<algorithm>
using namespace std;


int cmp(string a, string b) {
    if(a.size() != b.size()) {
        return a.size() < b.size();
    }
    return a < b;
}



int main() {
    string s; getline(cin, s);

    stringstream ss(s);
    string word;
    vector<string> v;
    while(ss >> word) {
        v.push_back(word);
    }
    sort(v.begin(), v.end());
    for(auto x: v) {
        cout << x << " ";
    }
    cout << endl;
    sort(v.begin(), v.end(), cmp);
    for(auto x: v) {
        cout << x << " ";
    }


    return 0;
}