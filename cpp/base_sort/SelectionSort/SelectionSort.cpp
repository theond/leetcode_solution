#include <iostream>
#include "SelectionSort.h"

using namespace std;

SelectionSort::SelectionSort(){}

void SelectionSort::selectionSort(int nums[], int length) {
	for (int i = 0; i < length - 1; i++) {
		int minIndex = i;
		for (int j = i+1; j < length; j++) {
			if (nums[minIndex] > nums[j]) {
				minIndex = j;
			}
		}
		swap(nums[minIndex], nums[i]);
	}
	for (int a = 0; a < length; a++) {
		cout << nums[a] << endl;
	}
}

void SelectionSort::swap(int& a, int& b) {
	int temp = a;
	a = b;
	b = temp;
}

/*
void main() {
	SelectionSort sort;
	int input[7] = { 10, 21, 9, 7, 1, 42, 37 };
	int length = sizeof(input) / sizeof(input[0]);
	sort.selectionSort(input, length);
}
*/
