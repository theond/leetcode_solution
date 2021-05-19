package arrays;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class ParentheseValid {
    public boolean isValid(String s){
        int length = s.length();
        if(length%2 != 0){
            return false;
        }
        Deque<Character> stack = new ArrayDeque<>();
        Map<Character, Character> pairs =new HashMap<Character, Character>(){{put('(',')'); put('[',']');put('{','}');}};
        for(int i =0; i< length; i++){
            if(pairs.containsValue(s.charAt(i))){
                if(stack.size() == 0) {
                    return false;
                }
                if(pairs.get(stack.pop()) != s.charAt(i)){
                    return false;
                }
            }else{
                stack.push(s.charAt(i));
            }
        }

        if (stack.size() == 0){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        ParentheseValid pv = new ParentheseValid();
        String s = "[([]])";
        boolean flag = pv.isValid(s);
        System.out.printf(String.valueOf(flag));
    }
}
