#include<iostream>
#include<unordered_set>
using namespace std;

#ifndef LENGTHOFLONGESTSUBSTRING
#define LENGTHOFLONGESTSUBSTRING
class LengthOfLongestSubstring{
public:
	LengthOfLongestSubstring(){}

	int lengthOfLongestSubstring(string s) {
		unordered_set<char> containSet;
		int l = 0, r = 0, max=0;
		while (r < s.length()) {
			if (containSet.find(s[r]) == containSet.end()) {
				containSet.insert(s[r]);
				if (r - l + 1 > max)
					max = r - l + 1;

				r++;
			}
			else {
				
				containSet.erase(s[l]);
				l++;
			}
		}
		return max;
	}
};
#endif // !LENGTHOFLONGESTSUBSTRING


/*
void main() {
	LengthOfLongestSubstring lengthOf;
	string s = "";
	int a = lengthOf.lengthOfLongestSubstring(s);
	cout << a << endl;
}
*/