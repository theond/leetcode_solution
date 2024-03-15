package removeduplicatestwo

func removeDuplicates(nums []int) int {
	n := len(nums)
	if n <= 2 {
		return n
	}
	count, i := 2, 2
	for ; i < n && count < n; i++ {
		if nums[count-2] != nums[i] {
			nums[count] = nums[i]
			count++
		}
	}
	return count
}
