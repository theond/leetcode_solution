#include<iostream>
#include<stack>
using namespace std;

#ifndef ADDTWONUMBERST
#define ADDTWONUMBERST
struct ListNode
{
	int val;
	ListNode* next;
	ListNode():val(0), next(nullptr){}
	ListNode(int v):val(v), next(nullptr){}
	ListNode(int v, ListNode *n):val(v), next(n){}
};
class AddTwoNumbersT {
public:
	ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
		ListNode* result = new ListNode();
		stack<int> s1;
		stack<int> s2;
		while (l1) {
			s1.push(l1->val);
			l1 = l1->next;
		}
		while (l2) {
			s2.push(l2->val);
			l2 = l2->next;
		}

		int carry = 0;
		bool flag = false;
		while (!s1.empty() || !s2.empty() || carry>0) {
			int v1 = 0, v2 = 0;
			if (!s1.empty()) {
				v1 = s1.top();
				s1.pop();
			}
			if (!s2.empty()) {
				v2 = s2.top();
				s2.pop();
			}
			//int tempSum = s1.empty() ? 0 : s1.top() + s2.empty() ? 0 : s2.top() + carry;
			int tempSum = v1 + v2 + carry;
			ListNode* tempNode = new ListNode(tempSum%10);
			if (flag) {
				tempNode->next = result;
				result = tempNode;
			}
			else {
				result = tempNode;
				flag = true;
			}
			carry = tempSum / 10;
		}

		return result;
	}
};
#endif // !ADDTWONUMBERST

/*²Î¿¼
* class Solution {
public:
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
        stack<int> s1;
        stack<int> s2;
        for (; l1; l1 = l1->next) s1.push(l1->val);
        for (; l2; l2 = l2->next) s2.push(l2->val);
        int carry = 0;
        ListNode* dummy = new ListNode();
        while (!s1.empty() || !s2.empty() || carry)
        {
            if (!s1.empty())
            {
                carry += s1.top();
                s1.pop();
            }
            if (!s2.empty())
            {
                carry += s2.top();
                s2.pop();
            }
            ListNode* node = new ListNode(carry % 10, dummy->next);
            dummy->next = node;
            carry /= 10;
        }
        return dummy->next;
    }
};
*/
/*
void main() {
	AddTwoNumbersT add;
	ListNode t1 = ListNode(5);
	//ListNode t2 = ListNode(6, &t1);
	//ListNode t3 = ListNode(5, &t2);

	ListNode u1 = ListNode(5);
	//ListNode u2 = ListNode(4, &u1);
	//ListNode u3 = ListNode(2, &u2);
	//ListNode u4 = ListNode(7, &u3);
	//ListNode u5 = ListNode(9, &u4);
	//ListNode u6 = ListNode(9, &u5);

	ListNode* r1 = add.addTwoNumbers(&t1, &u1);
	while (r1 != nullptr) {
		cout << r1->val << endl;
		r1 = r1->next;
	}
}
*/
