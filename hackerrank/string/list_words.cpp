/**Cho 1 xâu kí tự gồm các từ được cách nhau bởi dấu cách. Hãy liệt kê các từ khác nhau trong sâu s, đầu  tiên hãy liệt kê theo thứ tự từ điển tăng dần, sau đó liệt kê theo thứ tự xuất hiện.
 */

#include <iostream>
#include <vector>
#include<set>
#include<sstream>
using namespace std;
int main() {
    string s; 
    getline(cin,s);
    stringstream ss(s);
    string word;
    set<string> se;
    vector<string> v;
    while(ss >> word) {
        if(se.find(word) == se.end()) {
            v.push_back(word);
        }
        se.insert(word);
    }

    for(auto x: se) {
        cout << x << " ";
    }
    cout << endl;
    for(auto x: v) {
        cout << x << " ";
    }

    return 0;
}