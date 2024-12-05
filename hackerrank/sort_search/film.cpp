/*
Trong một liên hoan phim, n bộ phim sẽ được chiếu. Bạn biết thời gian bắt đầu và kết thúc của mỗi bộ phim. Số lượng phim tối đa bạn có thể xem toàn bộ là bao nhiêu? Biết rằng nếu thời gian kết thúc của bộ phim trước bằng hoặc nhỏ hơn thời gian bắt đầu của bộ phim sau thì bạn có thể xem cả 2 phim này.
Input Format
Dòng nhập đầu tiên có số nguyên n: số lượng phim. Sau đó, có n dòng mô tả các bộ phim. Mỗi dòng có hai số nguyên a và b: thời gian bắt đầu và kết thúc của một bộ phim.
Constraints
1s n, m ≤2.10^5; 1s a, b ≤10^9
Output Format
In một số nguyên: số lượng phim tối đa.

*/

#include<bits/stdc++.h>
using namespace std;


bool cmp(pair<int, int> a, pair<int, int> b) {
    return a.second < b.second;
}

int main() {
    int n;
    cin >>n;
    vector<pair<int, int>> a(n);
    for(int i = 0; i < n; i++) {
        cin >> a[i].first >> a[i].second;
    }

    sort(a.begin(), a.end(), cmp);
    int res = 0, end_time = a[0].second;
    for(int i = 1;i < n; i++) {

        // if the start time of the next movie is greater than or equal to the end time of the current movie
        if(a[i].first >= end_time) {
            res++; // increase the number of movies watched
            end_time = a[i].second;
        }
    }

}