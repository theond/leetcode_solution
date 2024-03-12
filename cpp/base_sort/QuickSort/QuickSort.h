#pragma once
#ifndef QUICKSORT
#define QUICKSORT
class QuickSort {
private:
	void partion(int nums[], int low, int high);
	void swap(int& a, int& b);
public:
	QuickSort();
	void quickSort(int nums[], int length);
};
#endif // !QUICKSORT
