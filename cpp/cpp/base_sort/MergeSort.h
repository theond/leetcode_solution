#pragma once
#ifndef MERGESORT
#define MERGESORT
class MergeSort {
private:
	void mergeSub(int input[], int left, int right);
public:
	MergeSort();
	void mergeSort(int input[], const int length);
};
#endif // !MERGESORT

