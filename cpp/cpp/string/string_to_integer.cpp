#include <iostream>
using namespace std;

#ifndef STRINGTOINTEGER
#define STRINGTOINTEGER
class StringToInteger {
public:
	StringToInteger(){}

	int myAtoI(string s) {
		long result = 0;
		bool startFlag = true;
		bool symbolFlag = true;
		bool overFlag = false;
		for (char ichar : s) {
			if (' ' == ichar && startFlag)
				continue;
			if (('-' == ichar || '+' == ichar || (ichar >= 48 && ichar <= 57)) && startFlag) {
				startFlag = false;
				if ('-' == ichar || '+' == ichar) {
					if('-' == ichar)
						symbolFlag = false;
					continue;
				}

			}
			if (ichar < 48 || ichar > 57) {
				break;
			}

			if (result > result * 10 + (ichar - 48)) {
				overFlag = true;
				break;
			}
			else {
				result = result * 10 + (ichar - 48);
			}

		}
		if (!symbolFlag) {
			result = -result;
		}

		if (symbolFlag && result > 0 && overFlag) {
			return INT32_MAX;
		}else if (!symbolFlag && result < 0 && overFlag) {
			return INT32_MIN;
		}
		else
		{
			return result;
		}
	}
};
#endif // !STRINGTOINTEGER

/*
void main() {
	StringToInteger atoi;
	string s = "-91283472332";
	int result = atoi.myAtoI(s);
	cout << result << endl;
}
*/
