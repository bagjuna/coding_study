#include <iostream>
#include <algorithm>
#include <string>
#include <deque>

using namespace std;

int N,M;

int main(void){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    
    cin >> N >> M;
    int res = 1;

    if(N==1){
        res = 1;
    }
    else if(N==2){
        res = min(4,(M+1)/2);
    }
    else if(N>=3&&M<7){
        res = min(4,M);
    }
    else if(N>=3&&M>=7){
        res = M-2;
    }
    cout << res;
    return 0;
}