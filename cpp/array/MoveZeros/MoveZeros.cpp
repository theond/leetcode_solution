#include "MoveZeros.h"
#include <iostream>
using namespace std;

MoveZeros::MoveZeros(){}

void MoveZeros::moveZeros(int nums[], int length) {
	if (length <= 1) 
	{
		return;
	}

	int curr = 0;
	for (int i = 0; i < length; i++) {
		if (nums[i] != 0) 
		{
			nums[curr++] = nums[i];
		}
	}

	for (int j = curr; j < length; j++) {
		nums[j] = 0;
	}

	for (int n = 0; n < length; n++) {
		cout << nums[n] << endl;
	}
}

/*
int main() {
	MoveZeros moveZeros;
	int nums[5] = { 0,1,0,3,12 };
	int length = sizeof(nums) / sizeof(nums[0]);
	moveZeros.moveZeros(nums, length);
}
*/