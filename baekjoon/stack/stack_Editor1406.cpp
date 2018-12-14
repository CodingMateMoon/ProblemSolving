#include <iostream>
#include <stack>
#include <string>
using namespace std;
int main(){
	string s;
	char c;
	int i, n;
	cin >> s >> n;

	
	stack<char> left, right;
	for (i = 0; i < s.length(); i++) {
		left.push(s[i]);
	}

	for (i = 0; i < n; i++) {
		scanf(" %c", &c);
		if (c == 'L') {
			if (!left.empty()) {
				c = left.top();
				left.pop();
				right.push(c);
			}
		} else if (c == 'D') {
			if (!right.empty()){
				c = right.top();
				right.pop();
				left.push(c);
			}
		} else if (c == 'B') {
			if (!left.empty()){
				left.pop();
			}
		} else if (c == 'P') {
			scanf(" %c", &c);
			left.push(c);
		}
	}

	while (!left.empty()) {
		right.push(left.top());
		left.pop();
	}

	while(!right.empty()) {
		putchar(right.top());
		right.pop();
	}

	return 0;
}