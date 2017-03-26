package com.yuan.string;

/**
 * Created by Yuan on 2017/3/22,14:52.
 * Description: 常规测试
 */
public class RegularMatchTest {

    public static void main(String[] args) {
        String majorStr = "CGAGTGGAGCGATGTCGA";
        String matchStr = "GAGCGAT";
        System.out.println(findStr(majorStr, matchStr));
        System.out.println(findStr1(majorStr, matchStr));
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
        //i最大不但超过这个长度  i是模式串相对于主串的偏移值
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

    private static int findStr1(String str1, String str2) {
        int i = 0;
        int j = 0;
        while (i < str1.length() && j < str2.length()) {
            if (str1.charAt(i) == str2.charAt(j)) {
                i++;
                j++;
            }
            else{
                i = i - j + 1; //从起始字符串的下一个继续匹配 i-j就是本次匹配过程中的偏移值
                j = 0;
            }
        }
        //说明已经匹配完了,找到了
        if (j == str2.length()) {
            return i - j;
        }
        else{
            return -1;
        }
    }
}
