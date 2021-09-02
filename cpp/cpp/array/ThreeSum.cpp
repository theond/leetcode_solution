#include"ThreeSum.h"
#include<iostream>
using namespace std;

ThreeSum::ThreeSum(){}

void ThreeSum::threeSum(int nums[], int length) {
	if (length < 3)
		return;

	quickSort(nums, 0, length - 1);

	for (int i = 0; i < length - 2 && nums[i] <= 0; i++) {
		if (i > 0 && nums[i] == nums[i - 1]) continue;

		int j = i + 1, k = length -1;
		while (j < k) {
			if (nums[i] + nums[j] + nums[k] == 0) {
				cout << nums[i] << ',' << nums[j] << ',' << nums[k] << endl;
				j++;
				k--;
				while (j <= k && nums[j] == nums[j - 1]) j++;
				while (k >= j && nums[k] == nums[k + 1]) k--;
			}
			else if (nums[i] + nums[j] + nums[k] > 0) {
				k--;
			}
			else {
				j++;
			}
		}
		//以下方法会超时 复杂度为 O(n^3)
		/*for (int j = i + 1; j < length - 1; j++) {
			if (nums[i] + nums[j] > 0) {
				break;
			}
			if (j > i + 1 && nums[j] == nums[j - 1]) continue;
			for (int n = j + 1; n < length; n++) {
				if (nums[i] + nums[j] + nums[n] > 0) {
					break;
				}
				if (n > j + 1 && nums[n] == nums[n - 1]) continue;

				if (nums[i] + nums[j] + nums[n] == 0) {
					cout << nums[i] << ',' << nums[j] << ',' << nums[n] << endl;
				}
			}
		}*/
	}
}

void ThreeSum::quickSort(int nums[], int low, int high) {
	if (low >= high)
		return;

	int le = low - 1, mid = low, ri = high, stand = nums[high];
	while (mid <= ri) {
		if (nums[mid] > stand) {
			int temp = nums[ri];
			nums[ri] = nums[mid];
			nums[mid] = temp;
			ri--;
		}
		else if (nums[mid] < stand) {
			int temp = nums[le + 1];
			nums[le + 1] = nums[mid];
			nums[mid] = temp;
			le++;
			mid++;
		}
		else {
			mid++;
		}
	}

	quickSort(nums, low, le);
	quickSort(nums, mid, high);

}

int main() {
	ThreeSum threeSum;
	int nums[6] = { 3,0,-2,-1,1,2 };
	int length = sizeof(nums) / sizeof(nums[0]);
	//threeSum.quickSort(nums, 0, length-1);
	threeSum.threeSum(nums, length);
	for (int i = 0; i < length; i++) {
		cout << nums[i] << endl;
	}
}