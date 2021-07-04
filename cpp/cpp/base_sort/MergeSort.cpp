#include<iostream>
#include "MergeSort.h"
using namespace std;

MergeSort::MergeSort(){}

void MergeSort::mergeSort(int input[], int length) {
	int left = 0, right = length - 1;
	const int size = length;
	mergeSub(input, left, right);

	for (int i = 0; i < length; i++) {
		cout << input[i] << endl;
	}
}

void MergeSort::mergeSub(int input[], int left, int right) {
	if (left >= right)
		return;
	int mid = left + (right - left) / 2;
	mergeSub(input, left, mid);
	mergeSub(input, mid + 1, right);
	int* temp = new int[right - left + 1];
	int i = left, j = mid + 1, k = 0;
	while (i <= mid && j <= right) {
		if (input[i] < input[j]) {
			temp[k] = input[i];
			i++;
		}else {
			temp[k] = input[j];
			j++;
		}
		k++;
	}
	while (i <= mid) {
		temp[k] = input[i];
		i++;
		k++;
	}
	while (j <= right) {
		temp[k] = input[j];
		j++;
		k++;
	}
	for (int a = 0, b = left; a < right - left + 1 && b <= right; a++, b++) {
		input[b] = temp[a];

	}
}

void main() {
	MergeSort sort;
	int input[7] = { 10, 21, 9, 7, 1, 42, 37 };
	int length = sizeof(input) / sizeof(input[0]);
	sort.mergeSort(input, length);
}