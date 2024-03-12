#pragma once
#ifndef SELECTIONSORT
#define SELECTIONSORT
class SelectionSort {
private:
	
	void swap(int& a, int& b);
public:
	SelectionSort();
	void selectionSort(int nums[], int length);
};
#endif // !SELECTIONSORT
