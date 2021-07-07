#pragma once
#ifndef MERGESORT
#define MERGESORT
class MergeSort {
private:
	void mergeSub(int nums[], int left, int right);
public:
	MergeSort();
	void mergeSort(int nums[], const int length);
};
#endif // !MERGESORT

