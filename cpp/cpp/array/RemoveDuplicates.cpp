#include<iostream>
#include "RemoveDuplicates.h"

using namespace std;

RemoveDuplicates::RemoveDuplicates(){}

int RemoveDuplicates::removeDuplicates(int nums[], int length) {
	int index = 1;
 	int count = 0;
	while (index < length) {
		if (nums[index] == nums[index - 1]) {
			count++;
		}
		else {
			nums[index - count] = nums[index];
		}
		index++;
	}

	for (int i = 0; i < length - count; i++) {
		cout << nums[i] << endl;
	}
	return length - count;
}
/*
int main() {
	RemoveDuplicates remove;
	int nums[3] = { 1,1,2 };
	int length = sizeof(nums) / sizeof(nums[0]);
	int result = remove.removeDuplicates(nums, length);
	cout << result << endl;
}
*/
