#include "RemoveElement.h";
#include <iostream>
using namespace std;
RemoveElement::RemoveElement(){}

int RemoveElement::removeElement(int nums[], int val, int length) {

	int currIndex = 0;

	for (int i = 0; i < length; i++) {
		if (nums[i] != val) {
			nums[currIndex++] = nums[i];
		}
	}

	for (int j = 0; j < currIndex; j++) {
		cout << nums[j] << endl;
	}

	return currIndex;
}

/*
int main() {
	RemoveElement remove;
	int nums[8] = { 0,1,2,2,3,0,4,2 };
	int length = sizeof(nums) / sizeof(nums[0]);
	int result = remove.removeElement(nums, 2,length);
	cout << result << endl;
}
*/