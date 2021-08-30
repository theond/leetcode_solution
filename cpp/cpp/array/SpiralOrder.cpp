#include "SpiralOrder.h"
#include <iostream>
using namespace std;

SpiralOrder::SpiralOrder() {}

void SpiralOrder::spiralOrder(int** nums, int length, int width) {
	int rlow = 0, rhigh = width - 1, clow = 0, chigh = length - 1;

	while (clow <= chigh && rlow <= rhigh) {
		int col = clow, row = rlow;
		if (rlow == rhigh) {
			for (; col <= chigh; col++) {
				cout << nums[row][col] << endl;
			}
			return;
		}
		if (clow == chigh) {
			for (; row <= rhigh; row++) {
				cout << nums[row][col] << endl;
			}
			return;
		}
		for (; col < chigh; col++) {
			cout << nums[row][col] << endl;
		}
		chigh--;

		for (; row < rhigh; row++) {
			cout << nums[row][col] << endl;
		}
		rhigh--;


		for (; col > clow; col--) {
			cout << nums[row][col] << endl;
		}
		clow++;


		for (; row > rlow; row--) {
			cout << nums[row][col] << endl;
		}
		rlow++;
	}
}

//vector<int> spiralOrder(vector<vector<int>>& matrix) {
//	int length = matrix[0].size();
//	int width = matrix.size();
//	int rlow = 0, rhigh = width - 1, clow = 0, chigh = length - 1, count = 0;;
//
//	vector<int> result(length * width);
//
//	while (clow <= chigh && rlow <= rhigh) {
//		int col = clow, row = rlow;
//		if (rlow == rhigh) {
//			for (; col <= chigh; col++) {
//				result[count++] = matrix[row][col];
//			}
//			return result;
//		}
//		if (clow == chigh) {
//			for (; row <= rhigh; row++) {
//				result[count++] = matrix[row][col];
//			}
//			return result;
//		}
//		for (; col < chigh; col++) {
//			result[count++] = matrix[row][col];
//		}
//		chigh--;
//
//		for (; row < rhigh; row++) {
//			result[count++] = matrix[row][col];
//		}
//		rhigh--;
//
//
//		for (; col > clow; col--) {
//			result[count++] = matrix[row][col];
//		}
//		clow++;
//
//
//		for (; row > rlow; row--) {
//			result[count++] = matrix[row][col];
//		}
//		rlow++;
//	}
//	return result;
//}

//void main() {
//	SpiralOrder spiral;
//	int nums[3][3] = { {1,2,3},{4,5,6},{7,8,9} };
//	int length = sizeof(nums[0]) / sizeof(nums[0][0]);
//	int width = sizeof(nums) / sizeof(nums[0]);
//
//	int** temp = new int* [3];
//	for (int i = 0; i < 3; i++) {
//		temp[i] = new int[3];
//	}
//	for (int i = 0; i < 3; i++) {
//		for (int j = 0; j < 3; j++) {
//			temp[i][j] = nums[i][j];
//		}
//	}
//	spiral.spiralOrder(temp,length, width);
//
//	for (int i = 0; i < 3; i++) {
//		 delete []temp[i];
//	}
//	delete[]temp;
//	//for (int i = 0; i < length; i++) {
//	//	cout << nums[i] << endl;
//	//}
//}