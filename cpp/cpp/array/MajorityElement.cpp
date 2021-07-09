#include <iostream>
#include <unordered_map>
#include "MajorityElement.h"

using namespace std;

MajorityElement::MajorityElement() {}

int MajorityElement::majorityElement(int nums[], int length) {
	int mid = length >> 1;
	unordered_map<int, int> numCount;
	for (int i = 0; i < length; i++) {
		++numCount[nums[i]];
		if (numCount[nums[i]] > mid) {
			return nums[i];
		}
	}
	/*
	for (int i = 0; i < length; i++) {
		if (numCount.count(nums[i]) == 0) {
			numCount.insert({ nums[i], 1 });
		}
		else {
			numCount.insert({ nums[i], numCount[nums[i]]++ });
		}

		if (numCount[nums[i]] > mid) {
			return nums[i];
		}
	}*/
	return -1;
}

//Boyer–Moore vote 算法，适用于超过半数的众数
int MajorityElement::majority2(int nums[], int length) {
	int majority = 0, count = 0;
	for (int i = 0; i < length; i++) {
		if (count == 0) {
			majority = nums[i];
			count = 1;
		}
		else {
			count += (majority == nums[i] ? 1 : -1);
		}
	}
	return majority;
}

int main() {
	MajorityElement majority;
	int input[7] = { 1,1,9,3,3,3,3 };
	int length = sizeof(input) / sizeof(input[0]);
//	int result = majority.majorityElement(input, 7);
	int result = majority.majority2(input, 7);
	cout << result << endl;
	return 0;
}