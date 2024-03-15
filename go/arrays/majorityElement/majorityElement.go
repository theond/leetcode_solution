package majorityelement

func majorityElement(nums []int) int {
	var reslut int
	count := 0
	for _, num := range nums {
		if count == 0 {
			reslut = num
		}
		if num == reslut {
			count++
		} else {
			count--
		}

	}

	return reslut
}
