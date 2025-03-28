#include <iostream>
#include <algorithm>
#include <string>
#include <deque>

using namespace std;

int N,M,K;

int main(void){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    
    cin >> N >> M >> K;
    while(K>0){
        if(N>=2*M){
            N--;
        }
        else{
            M--;
        }
        K--;
    }
    int res = 0;
    while(N>1&&M>0){
        N -= 2;
        M -= 1;
        res++;
    }
    cout << res;
    return 0;
}