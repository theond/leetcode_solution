#include "RepeatNumber.h"
#include <iostream>
using namespace std;

RepeatNumber::RepeatNumber(){}

int RepeatNumber::findRepeatNumber(int nums[], int length) {

	for (int i = 0; i < length; i++) {
		while (nums[i] != i) {
			if (nums[i] == nums[nums[i]]) {
				return nums[i];
			}
			swap(nums[i], nums[nums[i]]);

		}

	}
	return -1;
}

/*
void quickSort(int nums[], int left, int right) {
	if (left >= right) {
		return;
	}
	int base = nums[right];
	int low = left, high = right, curr = left -1;
	int temp;
	while (low < high) {
		if (nums[low] > base) {
			swap(nums[--high], nums[low]);

			
			//temp = nums[high];
			//nums[high--] = nums[low];
			//nums[low] = temp;
			
		}
		else if (nums[low] < base) {

			swap(nums[++curr], nums[low++]);
			
			//temp = nums[low];
			//nums[low++] = nums[curr];
			//nums[curr++] = temp;
			
		}
		else {
			low++;
		}
	}

	swap(nums[high], nums[right]);
	quickSort(nums, left, curr);
	quickSort(nums, high+1, right);
}
*/

void swap(int& a, int& b) {
	if (a == b) {
		return;
	}
	int temp = a;
	a = b;
	b = temp;
}