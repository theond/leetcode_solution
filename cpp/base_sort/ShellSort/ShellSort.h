#pragma once
#ifndef SHELLSORT
#define SHELLSORT
class ShellSort {
private:
	void swap(int& a, int& b);
public:
	ShellSort();
	void shellSort(int nums[], int length);

};
#endif // !SHELLSORT