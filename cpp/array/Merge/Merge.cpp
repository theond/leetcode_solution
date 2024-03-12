#include"Merge.h"
#include<iostream>
using namespace std;

Merge::Merge() {}

void Merge::merge(int nums1[], int len1, int nums2[], int len2) {
	if (len2 <= 0)
		return;
	int i = len1 - 1, j = len2 - 1, k = len1 + len2 - 1;
	while (j >= 0) {
		if (i >= 0 && nums1[i] > nums2[j]) {
			nums1[k] = nums1[i];
			i--;
		}
		else {
			nums1[k] = nums2[j];
			j--;
		}
		k--;
	}


	//´Ó×óµ½ÓÒ
	//int i = 0, j = 0, len = len1;
	//while (i < len && j < len2) {
	//	if (nums1[i] < nums2[j]) {
	//		i++;

	//	}
	//	else {
	//		for (int k = len - 1; k >= i; k--) {
	//			//int temp = nums1[k + 1];
	//			nums1[k + 1] = nums1[k];
	//		}
	//		len++;
	//		nums1[i] = nums2[j];
	//		j++;
	//	}
	//}

	//if (i >= len && len < len1+len2) {
	//	for (; i < len1 + len2 && j < len2; i++, j++) {
	//		nums1[i] = nums2[j];
	//	}
	//}
}

//int main() {
//	Merge merge;
//	int nums1[11] = { -1, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0 };
//	int length = sizeof(nums1) / sizeof(nums1[0]);
//	int nums2[6] = { -1, -1, 0, 0, 1, 2 };
//	merge.merge(nums1, 5, nums2,  6);
//	for (int i = 0; i < length; i++) {
//		cout << nums1[i] << endl;
//	}
//}
