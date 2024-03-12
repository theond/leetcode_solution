#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;

#ifndef REVERSEVOWELS
#define REVERSEVOWELS
class ReverseVowels{
private:
public:
	//const vector<char> vowels_ = {'a', 'e','i', 'o', 'u'};
	const char vowels_[5] = { 'a', 'e','i', 'o', 'u' };
	ReverseVowels() {}

	string reverseVowels(string str) {
		int length = str.size();
		if (length <= 1) {
			return str;
		}

		int low = 0, high = length - 1;
		bool flag = true;
		while (low < high) {
			
			if (flag) {
				char compareChar = str[low];
				if (compareChar < 97) {
					compareChar += 32;
				}
				
				if (find(vowels_, vowels_ + 5, compareChar) != vowels_ + 5) {
					flag = false;
				}
				else {
					low++;
				}
			}
			else {
				char compareChar = str[high];
				if (compareChar < 97) {
					compareChar += 32;
				}
				if (find(vowels_, vowels_ + 5, compareChar) != vowels_ + 5) {
					flag = true;
					char temp = str[high];
					str[high] = str[low];
					str[low] = temp;
					low++;
				}
				high--;
			}
		}

		return str;
	}

};
#endif // !REVERSEVOWELS

/*
void main() {
	ReverseVowels rv;
	string str = "aA";
	string result = rv.reverseVowels(str);
	cout << result << endl;
}
*/