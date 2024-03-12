package removeElement

/*
 * https://leetcode.cn/problems/remove-element
 */
func removeElement(nums []int, val int) int {
	count, j := len(nums), len(nums)-1
	for i := 0; i < len(nums); {
		if nums[i] == val && j >= i {
			temp := nums[j]
			nums[j] = nums[i]
			nums[i] = temp
			j--
			count--
		} else {
			i++
		}
	}

	return count
}
