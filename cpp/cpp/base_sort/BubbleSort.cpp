#include <iostream>
#include "BubbleSort.h"
using namespace std;

BubbleSort::BubbleSort(){}

void BubbleSort::bubbleSort(int nums[], int length) {
	bool swaped = true;
	for (int i = 0; i < length && swaped; i++) {
		swaped = false;
		for (int j = 1; j < length - i; j++) {
			if (nums[j-1] > nums[j]) {
				swap(nums[j-1], nums[j]);
				swaped = true;
			}
		}
	}
	for (int a = 0; a < length; a++){
		cout << nums[a] << endl;
	}
	
}

void BubbleSort::swap(int &a, int &b) {
	int temp = a;
	a = b;
	b = temp;
}

/*
int main() {
	BubbleSort sort;
	int input[7] = {10, 21, 9, 7, 1, 42, 37};
	int length = sizeof(input) / sizeof(input[0]);
	sort.bubbleSort(input, length);
}
*/