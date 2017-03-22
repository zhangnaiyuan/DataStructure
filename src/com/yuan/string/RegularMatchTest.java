package com.yuan.string;

/**
 * Created by Yuan on 2017/3/22,14:52.
 * Description: 常规测试
 */
public class RegularMatchTest {

    public static void main(String[] args) {
        String majorStr = "CGAGTGGAGCGATGTCGA";
        String matchStr = "GAGCGAT";
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

    private static int findStr(String str1, String str2) {
        int i;
        int j;
        //i最大不但超过这个长度
        for (i = 0; i <= str1.length() - str2.length(); i++) {
            //从匹配的字符串第0个位置
            for (j = 0; j < str2.length(); j++) {
                if (str1.charAt(i + j) != str2.charAt(j)) {
                    break;
                }
            }
            //提前找到了
            if (j >= str2.length()) {
                break;
            }
        }
        //没有找到
        if (i > str1.length() - str2.length()) {
            return -1;
        }
        return i;

    }
}
