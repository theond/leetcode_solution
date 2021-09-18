#include<iostream>
#include<vector>
using namespace std;
#ifndef COMMONPREFIX
#define COMMONPREFIX
class CommonPrefix {
private:
public:
	CommonPrefix(){}

	string longestCommonPrefix(vector<string>& strs) {

		int lengthLimit = strs[0].length();
		string output = "";

		for (int i = 0; i < lengthLimit; i++) {
			for (int j = 0; j < strs.size(); j++) {
				if (strs[j].length() <= i) {
					return output;
				}

				if (strs[0][i] != strs[j][i]) {
					return output;
				}
			}
			output += strs[0][i];
		}

		return output;
	}
};
#endif // !COMMONPREFIX

/*
void main() {
	CommonPrefix prefix;

	vector<string> strs = { "flower", "flow", "flight" };
	string s = prefix.longestCommonPrefix(strs);
	cout << s << endl;
}
*/
