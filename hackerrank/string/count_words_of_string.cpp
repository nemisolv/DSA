// Đếm  số lượng từ trong xâu

#include<iostream>
#include<sstream> 
using namespace std;

int main() {
    string s; 
    getline(cin,s);
    int cnt = 0;
    stringstream ss(s);
    string word;
    while(ss >> word) {
        cnt++;
    }
    cout << cnt;

    return 0;
}