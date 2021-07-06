#include <iostream>
#include "QuickSort.h"
using namespace std;

QuickSort::QuickSort() {};

void QuickSort::quickSort(int input[], int length) {
	partion(input, 0, length - 1);

	for (int i = 0; i < length; i++) {
		cout << input[i] << endl;
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

void QuickSort::partion(int input[], int low, int high) {
	if (low >= high)
		return;

	int less = low - 1, mid = low, more = high;
	while (mid < more) {
		if (input[mid] < input[high]) {
			swap(input[++less], input[mid++]);
		}
		else if (input[mid] > input[high]) {
			swap(input[mid], input[--more]);
		}
		else {
			mid++;
		}
	}

	swap(input[more], input[high]);
	partion(input, low, less);
	partion(input, more+1, high);
}

void main() {
	QuickSort sort;
	int input[7] = { 10, 21, 9, 7, 1, 42, 37 };
	int length = sizeof(input) / sizeof(input[0]);
	sort.quickSort(input, length);
}