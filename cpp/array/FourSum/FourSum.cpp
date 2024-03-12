#include"FourSum.h"
#include<iostream>
using namespace std;

FourSum::FourSum(){}

void FourSum::fourSum(int nums[], int length, int target) {
	if (length < 4)
		return;

	quickSort(nums, 0, length - 1);
	for (int i = 0; i < length - 3; i++) {
		//if (nums[i] > target)
		//	break;
		if (i > 0 && nums[i] == nums[i - 1])
			continue;
		for (int j = i + 1; j < length - 2; j++) {
			//if (nums[i] + nums[j] > target)
			//	break;
			if (j > i+1 && nums[j] == nums[j - 1])
				continue;

			int sub = target - nums[i] - nums[j];
			int k = j + 1, l = length - 1;
			while (k < l) {
				if (nums[k] + nums[l] == sub) {
					cout << nums[i] << ',' << nums[j] << ',' << nums[k] << ',' << nums[l] << endl;

					k++;
					l--;
					while (k <= l && nums[k] == nums[k - 1]) k++;
					while (l >= k && nums[l] == nums[l + 1]) l--;
				}
				else if (nums[k] + nums[l] < sub) {
					k++;
				}
				else {
					l--;
				}
			}
		}
	}
}

void FourSum::quickSort(int nums[], int low, int high) {
	if (low >= high)
		return;

	int le = low - 1, cur = low, ri = high, stand = nums[high];
	while (cur <= ri) {
		if (nums[cur] > stand) {
			int temp = nums[ri];
			nums[ri] = nums[cur];
			nums[cur] = temp;
			ri--;
		}
		else if (nums[cur] < stand) {
			int temp = nums[le + 1];
			nums[le + 1] = nums[cur];
			nums[cur] = temp;
			le++;
			cur++;
		}
		else {
			cur++;
		}
	}
	quickSort(nums, low, le);
	quickSort(nums, cur, high);
}

//int main() {
//	FourSum fourSum;
//	int nums[8] = { 1,-2,-5,-4,-3,3,3,5};
//	int length = sizeof(nums) / sizeof(nums[0]);
//	//fourSum.quickSort(nums, 0, length-1);
//	fourSum.fourSum(nums, length, -11);
//	for (int i = 0; i < length; i++) {
//		cout << nums[i] << endl;
//	}
//}