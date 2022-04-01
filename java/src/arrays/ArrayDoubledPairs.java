package arrays;

import java.util.*;

/*
 * https://leetcode-cn.com/problems/array-of-doubled-pairs/
 * 自己的思考路径是用hash放每个数的出现次数，然后遍历整个数组，进行配对，配对数大于length/2就表明成功，但是少考虑了0的情况
 * 官方解法考虑到边界值(0)，将问题更抽象(对于x，2x的个数要大于x的个数)，进行了分组考虑(对数组进行去重排序)
 */
public class ArrayDoubledPairs {

    public boolean canReorderDoubled(int[] arr) {
        Map<Integer, Integer> hash = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            hash.put(arr[i], hash.getOrDefault(arr[i], 0)+1);
        }

        //0的特殊处理，如果0的个数为奇数，就不能完成配对
        if (hash.getOrDefault(0, 0) % 2 != 0) {
            return false;
        }

        //对数组进行去重排序
        List<Integer> vals = new ArrayList<Integer>();
        for (int x : hash.keySet()) {
            vals.add(x);
        }
        Collections.sort(vals, (a, b) -> Math.abs(a) - Math.abs(b));

        for (int x : vals) {
            if (hash.getOrDefault(2 * x, 0) < hash.get(x)) { // 无法找到足够的 2x 与 x 配对
                return false;
            }
            hash.put(2 * x, hash.getOrDefault(2 * x, 0) - hash.get(x));
        }
        return true;

    }
}
