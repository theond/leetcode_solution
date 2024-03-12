#include"FindRotateMin.h"
#include<iostream>
using namespace std;


int result = INT_MAX;

FindRotateMin::FindRotateMin(){}

int FindRotateMin::findRotateMin(int nums[], int length) {

	// best solution 
	/*
	* int l=0,r=nums.size()-1;
    while(l<r){
        int mid=(r-l)/2+l;
        if(nums[mid]<nums[r]){
            r=mid;
           
        }
        else{
            l=mid+1;
        }
    }
     return nums[l];
	*/
	findMin(nums, 0, length - 1);
	cout << result << endl;
	return result;
}

void FindRotateMin::findMin(int nums[], int l, int r) {
	if (l > r)
		return;

	int m = l + (r - l) / 2;
	if (nums[m] < nums[r]) {
		if(result > nums[m])
			result = nums[m];
		findMin(nums, l, m - 1);
	}else{
		if (result > nums[m])
			result = nums[m];
		findMin(nums, m+1,r);
	}
}

/*
int main() {
	FindRotateMin findRotateMin;
	int nums[7] = { 4,5,6,7,0,1,2 };
	int length = sizeof(nums) / sizeof(nums[0]);
	findRotateMin.findRotateMin(nums, length);
	for (int i = 0; i < length; i++) {
		cout << nums[i] << endl;
	}
}
*/