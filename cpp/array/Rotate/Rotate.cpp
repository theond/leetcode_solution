#include "Rotate.h"
#include<iostream>

using namespace std;

Rotate::Rotate(){}

void Rotate::rotate(int nums[], int length, int index) {
	if (index <= 0 || length <= 0)
		return;
	index %= length;

	spin(nums, 0, length - 1);
	spin(nums, 0, index - 1);
	spin(nums, index, length - 1);
}

void Rotate::spin(int nums[], int start, int end) {
	while (start < end) {
		int temp = nums[start];
		nums[start] = nums[end];
		nums[end] = temp;
		start++;
		end--;
	}
}

//int main() {
//	Rotate rotate;
//	int nums[2] = { 0,1};
//	int length = sizeof(nums) / sizeof(nums[0]);
//	rotate.rotate(nums,length, 3);
//	for (int i = 0; i < length; i++) {
//		cout << nums[i] << endl;
//	}
//}