#include <iostream>
using namespace std;

#ifndef ADDTWONUMBERS
#define ADDTWONUMBERS
struct ListNode {
	int val;
	ListNode* next;
	ListNode(): val(0), next(nullptr){}
	ListNode(int x): val(x), next(nullptr){}
	ListNode(int x, ListNode* next):val(x), next(next){}
};

class AddTwoNumbers{
public:
	ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {

		int carry = 0;
		ListNode* result = new ListNode();
		ListNode* head;
		head = result;
		while (l1 != nullptr && l2 != nullptr) {
			int subSum = l1->val + l2->val + carry;
			carry = subSum / 10;
			subSum = subSum % 10;

			result->next = new ListNode(subSum);
			result = result->next;
			l1 = l1->next;
			l2 = l2->next;
		}

		while (l1 != nullptr) {
			int subSum = l1->val + carry;
			carry = subSum / 10;
			subSum = subSum % 10;
			//ListNode temp = ListNode(subSum);
			//result->next = &temp;
			//result = result->next;
			result->next = new ListNode(subSum);
			result = result->next;
			l1 = l1->next;
		}

		while (l2 != nullptr) {
			int subSum = l2->val + carry;
			carry = subSum / 10;
			subSum = subSum % 10;
			//ListNode temp = ListNode(subSum);
			//result->next = &temp;
			//result = result->next;
			result->next = new ListNode(subSum);;
			result = result->next;
			l2 = l2->next;
		}
		if (carry > 0) {
			result->next = new ListNode(carry);
			result = result->next;
		}

		return head->next;
	}
};
#endif // !ADDTWONUMBERS

/*²Î¿¼
class Solution {
public:
	ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
		ListNode* dummy = new ListNode();
		int carry = 0;
		ListNode* cur = dummy;
		while (l1 || l2 || carry) {
			int s = (l1 ? l1->val : 0) + (l2 ? l2->val : 0) + carry;
			carry = s / 10;
			cur->next = new ListNode(s % 10);
			cur = cur->next;
			l1 = l1 ? l1->next : nullptr;
			l2 = l2 ? l2->next : nullptr;
		}
		return dummy->next;
	}
};
*/

/*
void main() {
	AddTwoNumbers add;
	ListNode t1 = ListNode(9);
	ListNode t2 = ListNode(9, &t1);
	ListNode t3 = ListNode(9, &t2);

	ListNode u1 = ListNode(9);
	ListNode u2 = ListNode(9, &u1);
	ListNode u3 = ListNode(9, &u2);
	ListNode u4 = ListNode(9, &u3);
	ListNode u5 = ListNode(9, &u4);
	ListNode u6 = ListNode(9, &u5);

	ListNode* r1 = add.addTwoNumbers(&t3, &u6);
	while (r1 != nullptr) {
		cout << r1->val << endl;
		r1 = r1->next;
	}
}
*/
