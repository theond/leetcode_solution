#include"ThreeSumSmaller.h"
#include<iostream>
#include<algorithm>
using namespace std;

ThreeSumSmaller::ThreeSumSmaller(){}

int ThreeSumSmaller::threeSumSmaller(int nums[], int length, int target) {
	int count = 0;
	if (length < 3)
		return count;

	sort(nums, nums + length);
	for (int i = 0; i < length - 2; i++) {
		int j = i + 1, k = length - 1;
		while (j < k) {
			if (nums[i] + nums[j] + nums[k] < target) {
				count = count + (k - j);
				j++;
			}
			else {
				k--;
			}
		}
	}
	return count;
}
//
//int main() {
//	ThreeSumSmaller three;
//	int nums[4] = { -2,0,1,3 };
//	int length = sizeof(nums) / sizeof(nums[0]);
//	int a = three.threeSumSmaller(nums, length, 2);
//	cout << a << endl;
//}