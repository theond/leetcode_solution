#include <iostream>
using namespace std;

#ifndef RANSOMNOTE
#define RANSOMNOTE
class RansomNote {
public:
	RansomNote(){}

	bool canConstruct(string ransomNote, string magazine) {

		bool canFlag = true;
		for (char ichar : ransomNote) {
			bool findFlag = false;
			for (int j = 0; j < magazine.size(); j++) {
				if (ichar == magazine[j]) {
					magazine[j] = NULL;
					findFlag = true;
					break;
				}
			}

			if (!findFlag) {
				canFlag = false;
				break;
			}
		}

		return canFlag;
	}
};
#endif // !RANSOMNOTE

/* ²Î¿¼
class Solution {
public:
    bool canConstruct(string ransomNote, string magazine) {
        int map[26] = {0};
        for (auto &i :ransomNote) map[i - 'a'] += 1;
        for (auto &i : magazine) map[i - 'a'] -= 1;
        for (int i = 0; i < 26; i++) {
            if (map[i] > 0) return false;
        }
        return true;
    }
};
*/

void main() {
	RansomNote note;
	string r = "aa";
	string m = "aab";
	bool result = note.canConstruct(r, m);
	cout << result << endl;
}
