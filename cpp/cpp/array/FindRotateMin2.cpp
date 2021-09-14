#include"FindRotateMin2.h"
#include<iostream>
using namespace std;

int result2 = INT_MAX;
FindRotateMin2::FindRotateMin2(){}

int FindRotateMin2::findMin(int nums[], int length) {

	int l = 0, r = length - 1;
	while (l < r) {
		int mid = l + (r - l) / 2;
		if (nums[mid] < nums[r]) {
			r = mid;
		}
		else if (nums[mid] > nums[r]) {
			l = mid + 1;
		}
		else {
			r--;
		}
	}

	cout << nums[l] << endl;
	return nums[l];
}

int main() {
	FindRotateMin2 findRotateMin;
	int nums[3] = { 1,3,3 };
	int length = sizeof(nums) / sizeof(nums[0]);
	findRotateMin.findMin(nums, length);
	for (int i = 0; i < length; i++) {
		cout << nums[i] << endl;
	}
}