#pragma once
#ifndef QUICKSORT
#define QUICKSORT
class QuickSort {
private:
	void partion(int input[], int low, int high);
	void swap(int& a, int& b);
public:
	QuickSort();
	void quickSort(int input[], int length);
};
#endif // !QUICKSORT
