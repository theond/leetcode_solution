#pragma once
#ifndef BUBBLESORT

#define BUBBLESORT
class BubbleSort 
{
private:
	void swap(int& a, int& b);
public:
	BubbleSort();
	void bubbleSort(int nums[], int length);

};
#endif // !BUBBLESORT

