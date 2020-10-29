package baseStruct;

public class BaseString {
    public static void main(String[] args) {

        //创建字符串
        String s1 = new String();
        String s2 = "improvegogogo";
        //StringBuffer 与 StringBuilder, 前者保证线程安全，后者不是，但单线程下效率高一些，一般使用 StringBuilder
        //字符串切割
        StringBuilder s3 = new StringBuilder(s2.substring(0,5));
        String s4 = s3.toString();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s4);

        //返回字符串长度
        int s2Len = s2.length();
        System.out.println(s2Len);
        //字符替换
        String s5 = s2.replace("o","s");
        System.out.println(s5);

        //字符串合并
        String s6 = s4+"lalala";
        String s7 = s3.append("hahaha").toString();
        System.out.println(s6);
        System.out.println(s7);

        //转数组
        char[] s2Char = s2.toCharArray();

        //获取字符
        char c1 = s2.charAt(0);
        System.out.println(c1);
        //字符查找
        int index = s2.indexOf('r');
        System.out.println(index);
    }
}
