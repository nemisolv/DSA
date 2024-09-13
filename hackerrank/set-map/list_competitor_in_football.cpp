/** Cho thông tin các trận đấu của giải bóng đá V-league, nhiệm vụ của bạn là đói với mỗi đội bóng hãy liệt kê các đối thủ đã từng chạm trán.
 * Ds các đọi bóng được liệt kê theo thứ tự từ điển tăng dần  và danh sách đối thủ của từng đội bóng cũng được liệt kê  tăng dần theo thứ tự từ điển.
 * Gợi ý: Dùng map<string, vector<string>> mp;  Mỗi đội bóng sẽ dùng 1 vector để lưu lại danh sách các đối thủ trong các trận bóng, sort danh sách đội bóng trước khi in ra kết quả 
 * Input format: 
 * Dòng 1 là N: số trận bóng diễn ra
 * N dòng tiếp theo mỗi dòng gồm thông tin của 1 trận đấu theo cú pháp X - Y, trong đó đội X thi đấu với đội Y
 * Constraints: 1 <= N <= 1000   
 * Output format: 
 * In ra theo kết quả mẫu
 *  Sample input:
 * 13
 * Arsenal - Lyon
 * Fullham - Liverpool
 * Fullham - Chelsea
 * Barcelona - Chelsea
 * Barcelona - Fullham
 * Lyon - Barcelona
 * Chelsea - AC Milan
 * PSG - MC
 * Arsenal - Fullham
 * Fullham - Arsenal
 * Real Marid - Barcelona
 * Arsenal - MC
 * MU - Liverpool

 * 
 * Sample output: 
 * AC Milan: Chelsea
 * Arsenal: Fullham, Fullham, Lyon, MC
 * Barcelona: Chelsea, Fullham, Lyon, Real Marid
 * Chelsea: AC Milan, Barcelona, Fullham
 * Fullham: Arcenal, Arcenal, Barcelona, Chelsea, Liverpool
 * Liverpool: Fullham, MU,
 * Lyon: Arsenal, Barcelona
 * MC: Arsenal, PSG
 * MU: Liverpool
 * PSG: MC
 * Real Marid: Barcelona
 */ 

#include<iostream>
#include<map>
#include<vector>
#include<algorithm>
using namespace std;

int findSeparate(string s, char x) {
    for(int i =0;i < s.length();i++) {
        if(s[i] == x) return i;
    }
    return -1;
}

int main() {
    int n; cin >>n;
    cin.ignore();
    map<string,vector<string>> mp;
    string s;
    for(int i =0;i < n;i++) {
        getline(cin, s);
        int pos = findSeparate(s,'-');
        string t1 = s.substr(0,pos -1);
        string t2 = s.substr(pos+2);
        mp[t1].push_back(t2);
        mp[t2].push_back(t1);
    }

    for(auto it : mp) {
        vector<string> tmp = it.second;
        sort(tmp.begin(), tmp.end());
        cout << it.first << " : ";
        for(string x: tmp) cout << x << " ";
        cout << endl;
    }


    
}