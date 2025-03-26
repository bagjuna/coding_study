#include <iostream>
#include <deque>
#include <algorithm>

using namespace std;


int main(void){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    int N;
    cin >> N;
    int max = 0;
    int res = 0;
    deque<int> v;
    for(int i=0;i<N;i++){
        int a;
        cin >> a;
        v.push_back(a);
    }
    sort(v.begin(),v.end());
    max = v.back();
    v.pop_back();
    deque<int>::iterator it;
    for(it = v.begin(); it!=v.end();it++){
        res += (max + *it);
    }
    cout << res;
    return 0;
}