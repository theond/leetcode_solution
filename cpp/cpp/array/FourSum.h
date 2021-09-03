#pragma once
#ifndef FOURSUM
#define FOURSUM
class FourSum {
private:
public:
	FourSum();
	void quickSort(int nums[], int low, int high);
	void fourSum(int nums[], int length, int target);
};
#endif // !FOURSUM

