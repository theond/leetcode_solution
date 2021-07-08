#include <iostream>
#include "BinarySearch.h"
using namespace std;

BinarySearch::BinarySearch(){}

int BinarySearch::binarySearch(int nums[], int tar, int length) {
	
	int low = 0, high = length - 1;
	while (low < high) {
		int index = low + ((high - low) >> 1);
		if (nums[index] > tar) {
			low = index + 1;
		}
		else if(nums[index] < tar){
			high = index - 1;
		}
		else {
			return index;
		}
	}
	return -1;
}

void main() {
	BinarySearch search;
	int input[7] = { 1,7,9,10,21,37,42};
	int length = sizeof(input) / sizeof(input[0]);
	//int result = search.binarySearch(input, 37, length);
	int result = search.binarySearch(input, 6, length);
	cout << result << endl;
}
