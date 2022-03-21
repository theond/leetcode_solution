#include"ThreeSumClkosest.h"
#include<iostream>
#include<algorithm>
#include<math.h>
using namespace std;

ThreeSumClosest::ThreeSumClosest(){}

int ThreeSumClosest::threeSumclosest(int nums[], int length, int target) {
	//if(length < 3)
	sort(nums, nums + length);
	int minDiff = INT_MAX;
	int result = target;

	for (int i = 0; i < length - 2; i++) {
		int j = i + 1, k = length - 1;
		
		while (j < k) {
			int tempSum = nums[i] + nums[j] + nums[k];
			int diff = tempSum - target;
			if (diff < 0 ) {
				if (-diff < minDiff) {
					minDiff = -diff;
					result = tempSum;
				}
				j++;
			}else if(diff > 0){
				if (diff < minDiff) {
					minDiff = diff;
					result = tempSum;
				}
				k--;
			}
			else {
				return tempSum;

			}
		}
	}

	return result;
}

//int main() {
//	ThreeSumClosest three;
//	int nums[4] = { -1,2,1,-4 };
//	int length = sizeof(nums) / sizeof(nums[0]);
//	int a = three.threeSumclosest(nums, length, 1);
//	cout << a << endl;
//}