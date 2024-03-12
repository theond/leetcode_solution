package removeduplicates

func removeDuplicates(nums []int) int {
	count := 0
	for i, j := 0, 1; i < len(nums)-1 && j < len(nums); j++ {
		if nums[i] != nums[j] {
			j++
		} else {
			if i+1 != j {
				nums[i+1] = nums[j]
			}
			i++
			j++
			count++
		}
	}
	return count + 1
}
