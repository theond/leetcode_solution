package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
/*
 * https://leetcode-cn.com/problems/find-servers-that-handled-most-number-of-requests/
 */

public class HandledMostRequests {

    public List<Integer> busiestServers(int k, int[] arrival, int[] load) {
        PriorityQueue<Integer> available = new PriorityQueue<Integer>((a, b) -> a - b);
        for (int i = 0; i < k; i++) {
            available.offer(i);
        }
        //busy 每个数组存放到期时间，服务器编号
        PriorityQueue<int[]> busy = new PriorityQueue<int[]>((a, b) -> a[0] - b[0]);
        int[] requests = new int[k];
        for (int i = 0; i < arrival.length; i++) {
            while (!busy.isEmpty() && busy.peek()[0] <= arrival[i]) {
                int id = busy.peek()[1];
                busy.poll();
                //((id - i) % k + k) % k处理出现负数的情况
                //i + ((id - i) % k + k) % k是为了解决使用优先队列后，无法达到优先选择i%k的要求，相当于是把新近空闲出来的服务器同余之后全部偏移i
                //python的整数除法像下取整，c/java向0取整
                available.offer(i + ((id - i) % k + k) % k); // 保证得到的是一个不小于 i 的且与 id 同余的数
            }
            if (available.isEmpty()) {
                continue;
            }
            int server = available.poll() % k;
            requests[server]++;
            busy.offer(new int[]{arrival[i] + load[i], server});
        }
        int maxRequest = Arrays.stream(requests).max().getAsInt();
        List<Integer> ret = new ArrayList<Integer>();
        for (int i = 0; i < k; i++) {
            if (requests[i] == maxRequest) {
                ret.add(i);
            }
        }
        return ret;
    }

    /* 自己的实现当到50000台服务器会超时
    public List<Integer> busiestServers(int k, int[] arrival, int[] load) {
        int[] servers = new int[k];
        int[] result = new int[k];
        int timeSeq = arrival.length;
        int max = 0;
        for(int i = 0; i < timeSeq; i++){
            for(int c = 0; c<k;c++) {
                int s = (i+c) % k;
                if (servers[s] <= arrival[i]) {
                    servers[s] = load[i] + arrival[i];
                    result[s]++;
                    if(max < result[s])
                        max = result[s];
                    break;
                }
            }
        }
        List<Integer> resultList = new ArrayList<>();
        for(int n = 0; n<k;n++){
            if(max == result[n])
                resultList.add(n);
        }
        return resultList;
    }

     */
}
