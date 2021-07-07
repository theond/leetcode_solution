#include <iostream>
#include "InsertionSort.h"

using namespace std;

InsertionSort::InsertionSort(){}

void InsertionSort::insertionSort(int nums[], int length) {
	for (int i = 1, j; i < length - 1; i++) {
		int temp = nums[i];
		for (j = i - 1; j >= 0 && nums[j] > temp; j--) {
			nums[j + 1] = nums[j];
		}

		nums[j+1] = temp;
	}

	for (int a = 0; a < length; a++) {
		cout << nums[a] << endl;
	}
}

/*
void InsertionSort::swap(int& a, int& b) {
	int temp = a;
	a = b;
	b = temp;
}
*/


//void main() {
//	InsertionSort sort;
//	int input[7] = { 10, 21, 9, 7, 1, 42, 37 };
//	int length = sizeof(input) / sizeof(input[0]);
//	sort.insertionSort(input, length);
//}