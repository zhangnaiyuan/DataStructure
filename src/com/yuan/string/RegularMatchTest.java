package com.yuan.string;

/**
 * Created by Yuan on 2017/3/22,14:52.
 * Description: 常规测试
 */
public class RegularMatchTest {
    private static String majorStr = "CGAGTGGAGCGATGTCGA";
    private static String matchStr = "GAGCGAT";

    public static void main(String[] args) {
        System.out.println(majorStr.contains(matchStr));
        System.out.println(majorStr.indexOf(matchStr));
        System.out.println(findStr(majorStr, matchStr));
    }

    /**
     * 如果返回的位置是 i > length(majorStr)- length(matchStr)则失败
     * 也就是 i+ length(matchStr) > length(majorStr)
     * @param str1 主串 被匹配的串
     * @param str2 模式串 要匹配的串
     * @return 出现的位置
     */
    /************************************************/
    //  T: 0   1   .   .   .   i   i+1 .   .   .   i+j .   .   n-1
    //     --------------------|-------------------|------------
    //  P:                     0   1   .   .   .   j   .   .
    //                        |-------------------|
    /************************************************/
    public static int findStr(String str1, String str2) {
        int i;
        int j;
        //i最大不但超过这个长度
        for(i = 0;i<=str1.length() - str2.length();i++) {
            //从匹配的字符串第0个位置
            for(j = 0;j< str2.length();j++) {
                if (str1.charAt(i + j) != str2.charAt(j)) {
                    break;
                }
            }
            //提前找到了
            if (j >= str2.length()) {
                break;
            }
        }
        return i;

    }
}
