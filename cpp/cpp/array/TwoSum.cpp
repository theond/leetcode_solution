#include "TwoSum.h"
#include <iostream>
#include <unordered_map>
using namespace std;

TwoSum::TwoSum(){}

void TwoSum::twoSum(int nums[], int length, int target) {
	if (length <= 0)
		return;
	unordered_map<int, int> map;
	for (int i = 0; i < length; ++i) {
		int num = target - nums[i];
		//map.find(num) != map.end() 判断是否存在key， 存在key，find返回key的对应迭代器，不存在返回unordered_map::end
		if (map.find(num) != map.end()) {
			cout << i << ',' << map[num] << endl;
			return;
		}
		map[nums[i]] = i;
	}
}

//void quickSort(int nums[], int low, int high) {
//	if (low >= high)
//		return;
//
//	int le = low - 1, mid = low, ri = high;
//	int stand = nums[ri];
//	while (mid <= ri) {
//		if (nums[mid] > stand) {
//			int temp = nums[ri];
//			nums[ri] = nums[mid];
//			nums[mid] = temp;
//			ri--;
//		}
//		else if (nums[mid] < stand) {
//			int temp = nums[le+1];
//			nums[le+1] = nums[mid];
//			nums[mid] = temp;
//			mid++;
//			le++;
//		}
//		else {
//			mid++;
//		}
//	}
//
//	quickSort(nums, low, le);
//	quickSort(nums, mid, high);
//}

//int main() {
//	TwoSum twoSum;
//	int nums[3] = {3,2,4};
//	int length = sizeof(nums) / sizeof(nums[0]);
//	twoSum.twoSum(nums, length, 6);
//	for (int i = 0; i < length; i++) {
//		cout << nums[i] << endl;
//	}
//}