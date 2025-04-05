#include <iostream>
#include <algorithm>
#include <string>
#include <deque>

using namespace std;

int A,B,C,M;

int main(void){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    
    cin >> A >> B >> C >> M;
    int res = 0;
    int hour = 0;
    int tired = 0;
    while(hour<24){
        if(tired+A<=M){
            tired += A;
            res += B;
        }
        else{
            if(tired-C<0){
                tired = 0;
            }
            else{
                tired -= C;
            }
        }
        hour++;
    }
    cout << res;
    return 0;
}