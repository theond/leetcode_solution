#include "RemoveDuplicates2.h";
#include<iostream>

using namespace std;

RemoveDuplicates2::RemoveDuplicates2(){}

int RemoveDuplicates2::removeDuplicates(int nums[], int length) {
	if (length < 1)
		return length;

	int count = 0;
	int curr = 1;
	for (int i = 1; i < length; i++) {
		if (nums[i] == nums[i - 1]) {
			count++;
		}
		else {
			count = 0;
		}
		if (count < 2) {
			nums[curr++] = nums[i];
		}
	}

	for (int j = 0; j < curr; j++) {
		cout << nums[j] << endl;
	}

	return curr;
}
/*
int main() {
	RemoveDuplicates2 remove;
	int nums[9] = { 0,0,1,1,1,1,2,3,3};
	int length = sizeof(nums) / sizeof(nums[0]);
	int result = remove.removeDuplicates(nums, length);
	cout << result << endl;
}
*/