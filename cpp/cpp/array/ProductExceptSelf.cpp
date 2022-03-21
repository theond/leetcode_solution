#include "ProductExceptSelf.h"
#include<iostream>

ProductExceptSelf::ProductExceptSelf(){}

vector<int> ProductExceptSelf::product(vector<int>& nums) {
	int length = nums.size();
	vector<int> output(length);

	output[0] = 1;
	for (int i = 1; i < length; i++) {
		output[i] = output[i - 1] * nums[i - 1];
	}

	int r = 1;
	for (int j = length - 1; j >= 0; j--) {
		output[j] = output[j] * r;
		r = r * nums[j];
	}
	/* self solution
	vector<int> l(length);
	vector<int> r(length);
	l[0] = nums[0];
	for (int i = 1; i < length -1; i++) {
		l[i] = nums[i] * l[i - 1];
	}
	l[length - 1] = l[length - 2];

	r[length - 1] = nums[length - 1];
	for (int j = length - 2; j > 0; j--) {
		r[j] = nums[j] * r[j + 1];
	}
	r[0] = r[1];

	output[0] = r[0];
	for (int k = 1; k < length - 1; k++) {
		output[k] = l[k - 1] * r[k + 1];
	}
	output[length - 1] = l[length - 1];
	*/


	return output;
}

/*
int main() {
	ProductExceptSelf product;
	vector<int> nums = { 1,2,3,4 };
	vector<int> output = product.product(nums);
	for (int i = 0; i < output.size(); i++) {
		cout << output[i] << endl;
	}
}
*/