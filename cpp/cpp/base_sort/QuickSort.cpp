#include <iostream>
#include "QuickSort.h"
using namespace std;

QuickSort::QuickSort() {};

void QuickSort::quickSort(int nums[], int length) {
	partion(nums, 0, length - 1);

	for (int i = 0; i < length; i++) {
		cout << nums[i] << endl;
	}
}

void QuickSort::swap(int& a, int& b) {
	if (a == b) {
		return;
	}
	int temp = a;
	a = b;
	b = temp;
}

void QuickSort::partion(int nums[], int low, int high) {
	if (low >= high)
		return;

	int less = low - 1, mid = low, more = high;
	while (mid < more) {
		if (nums[mid] < nums[high]) {
			swap(nums[++less], nums[mid++]);
		}
		else if (nums[mid] > nums[high]) {
			swap(nums[mid], nums[--more]);
		}
		else {
			mid++;
		}
	}

	swap(nums[more], nums[high]);
	partion(nums, low, less);
	partion(nums, more+1, high);
}

/*
void main() {
	QuickSort sort;
	int input[7] = { 10, 21, 9, 7, 1, 42, 37 };
	int length = sizeof(input) / sizeof(input[0]);
	sort.quickSort(input, length);
}
*/