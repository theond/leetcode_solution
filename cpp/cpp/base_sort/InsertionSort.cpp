#include <iostream>
#include "InsertionSort.h"

using namespace std;

InsertionSort::InsertionSort(){}

void InsertionSort::insertionSort(int input[], int length) {
	for (int i = 1, j; i < length - 1; i++) {
		int temp = input[i];
		for (j = i - 1; j >= 0 && input[j] > temp; j--) {
			input[j + 1] = input[j];
		}

		input[j+1] = temp;
	}

	for (int a = 0; a < length; a++) {
		cout << input[a] << endl;
	}
}

/*
void InsertionSort::swap(int& a, int& b) {
	int temp = a;
	a = b;
	b = temp;
}
*/


//void main() {
//	InsertionSort sort;
//	int input[7] = { 10, 21, 9, 7, 1, 42, 37 };
//	int length = sizeof(input) / sizeof(input[0]);
//	sort.insertionSort(input, length);
//}