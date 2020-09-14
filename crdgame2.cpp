#include <bits/stdc++.h>
#include <ext/pb_ds/assoc_container.hpp>
using namespace __gnu_pbds;
using namespace std;


typedef long long ll;
typedef tree<int, null_type,less<int>, rb_tree_tag,
tree_order_statistics_node_update> indexed_set;

#define mod 1000000007
#define maxloop for(int i = 0;i<n;i++){\ 
	if(max < a[i])\
	max = a[i];\
}
#define loopx for(int i = 0;i<n;i++){\
	if(max == a[i])\
	max_value++;\
}
#define loopl for(int i = 0;i<k;i++){\
	ans = (ans % mod * (n-i) % mod) % mod;\
	ans = div1(ans,i+1);\
}
void solution();
int main(){
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	#ifndef ONLINE_JUDGE
	clock_t tStart = clock();
	freopen("input.txt","r",stdin);
	freopen("output.txt","w",stdout);
	#endif
	solution();
	#ifndef ONLINE_JUDGE
	fprintf(stderr, "Runtime: %.10fs\n", (double) (clock() - tStart) / CLOCKS_PER_SEC);
	#endif
	return 0;
}
ll powerLL(ll x, ll n){
	ll result = 1;
	while(n){
		if(n & 1)
		result = result * x % mod;
		n = n / 2;
		x = x * x % mod;
	}
	return result;
}
ll div1(ll a, ll b){
	return (a % mod * (powerLL(b,mod-2)%mod))%mod;
}
ll sol1(ll n, ll r){
	ll ans = 1;
	ll k = min(r,n-r);
	loopl
	return ans % mod;
}
void solution(){
	int t; 
	cin >> t;
	while(t--){
		ll n;
		cin >> n;
		ll a[n], ans;
		for(ll i = 0;i<n;i++){
			cin >> a[i];
		}
		ll max = 0 , max_value = 0;
		maxloop
		loopx
		if(n == 1){
			cout << 2 << '\n';
			continue;
		}
		if(max_value % 2 != 0){
			ans = powerLL(2,n) % mod;
		}else{
			ans = powerLL(2,n) % mod - ((powerLL(2,n-max_value)%mod)*sol1(max_value, max_value/2)%mod)%mod;
			
		}
		if(ans < 0)
		ans = (ans + mod) % mod;
		cout << ans % mod << '\n';
	}
}
