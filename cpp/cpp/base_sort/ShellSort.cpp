#include <iostream>
#include "ShellSort.h"

using namespace std;

ShellSort::ShellSort(){}

void ShellSort::shellSort(int nums[], int length) {
	for (int gap = length >>2 ; gap > 0; gap >>= gap) {
		for (int i = gap; i < length; i++) {
			int temp = nums[i], j;
			for ( j = i - gap; j >= 0 && nums[j] > temp; j -= gap)
				nums[j + gap] = nums[j];
			nums[j + gap] = temp;
		}
	}
	for (int a = 0; a < length; a++) {
		cout << nums[a] << endl;
	}
}
/*
void main() {
	ShellSort sort;
	int input[7] = { 10, 21, 9, 7, 1, 42, 37 };
	int length = sizeof(input) / sizeof(input[0]);
	sort.shellSort(input, length);
}
*/
