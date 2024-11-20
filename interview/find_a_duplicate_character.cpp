

#include<iostream>
using namespace std;



//v1
int d[126];

int main() {

    string s = "Hello World";

    for(int i = 0;i < s.size();i++) {
        d[s[i]]++;
    }

    for(int i=0; i < 126;i++) {
        if(d[i] >1) {
            cout << (char)i << " " << d[i] << endl;
        }
    }

}