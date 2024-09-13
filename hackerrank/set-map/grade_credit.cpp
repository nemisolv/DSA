/** Cho thông tin điểm thi của các môn học của các sinh viên, bạn hãy tính điểm trung bình cuối kỳ của từng sinh viên.(Điểm trung bình = tổng số tín chỉ * điểm số / tổng số tín chỉ)
 * sample input:
lan 2 4
tuan 5 9
manh 1 3
nam 2 4 
lan 2 5
lan 1 9
manh 3 7
tuan 4 8
nam 2 6
nam 3 8
nam 1 7
 * 
    * sample output:
lan : 5.4
manh : 6
nam : 6.4
tuan : 8.6
    * 
 
 */


#include<iostream>
#include<map>
#include<vector>
#include<iomanip>
using namespace std;

double calculate_final_score(vector<pair<int, int>> v) {
    int sum1 = 0, sum2 =0;
    for(int i =0;i < v.size();i++) {
        sum1 += v[i].first * v[i].second; // credit * grade
        sum2 += v[i].first; // credit
    }
    return (double)sum1/sum2;

}


int main() {
    string name;
    map<string, vector<pair<int,int>>> mp;
    while(cin >> name ) {
        int credit, grade;
        cin >> credit >> grade;
        mp[name].push_back({credit,grade});
    }
    
    for(auto it : mp) {
        double final_score = calculate_final_score(it.second);
        cout << it.first << " : " << setprecision(2) << final_score << endl;
        
          }

    return 0;
}