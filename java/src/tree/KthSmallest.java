package tree;

public class KthSmallest {
    /*
     * 可以确定上下边界直接完成计数，就不要去遍历计数，1是浪费资源，2是容易出错
     * 对于遍历计数要控制好边界条件
     */

    public int findKthNumber(int n, int k) {

        int currIndex = 1; //从第一个字典下表开始
        int prefix = 1;
        while(currIndex < k){
            int count = prefixSubCount(prefix, n);
            if(currIndex + count > k){

                prefix *= 10;
                currIndex ++;
            }else{
                prefix++;
                currIndex += count;
            }
        }
        return prefix;
    }

    public int prefixSubCount(int prefix, int n){
        //不断向下层遍历可能一个乘10就溢出了, 所以用long
        long curr = prefix;
        long next = prefix + 1; //这一层同前缀字典树的上界
        int count = 0;
        while(curr <= n){
            count += Math.min(n+1, next) - curr;
            // 假设prefix是1，next是2，向下一层计数，变成10和20
            // 1为前缀的子节点增加10个，十叉树增加一层, 变成了两层
            curr *= 10;
            next *= 10;
        }
        return count;
        /* 错误示范
        int count = 1;

        //临界数据丢失，比如1000的n，101，102不会被计数
        int size = Math.min(10, Math.max(0,n-prefix*10+1));

        for(int i = 0; i < size; i++){
            count += prefixSubCount((prefix+ i)*10, n);
        }
        //+1 当前节点
        return count;
        */
    }
}
