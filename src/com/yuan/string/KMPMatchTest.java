package com.yuan.string;

/**
 * Created by Yuan on 2017/3/22,16:49.
 * Description: KMP算法
 */
public class KMPMatchTest {
    public static void main(String[] args) {
        String majorStr = "CGAGTGGAGCGATGTCGA";
        String matchStr = "GAGCGAT";
        System.out.println(KMP(majorStr, matchStr));
    }

    private static int KMP(String str1, String str2) {
        int[] next = buildNextImproved(str2); //[-1,0,-1,1,-1,-1,0,2]
        int i = 0, j = 0;
        while (j < str2.length() && i < str1.length()) {
            if (j < 0 || str1.charAt(i) == str2.charAt(j)) {
                i++;
                j++;
            }
            else {
                j = next[j];
            }
        }
        return i - j;
    }

    /**
     * 在串 str2 中，长度为 t 的真前缀与长度为 t 的真后缀完全匹配
     * @param str2 模式串
     * @return 跳转节点
     */
    private static int[] buildNextImproved(String str2) {
        int[] next = new int[str2.length()];
        int j = 0;
        int t = next[0] = -1;
        while (j < str2.length() - 1) {
            if (t < 0 || str2.charAt(j) == str2.charAt(t)) {
                j++;
                t++;
                next[j] = (str2.charAt(j) != str2.charAt(t)) ? t : next[t];
            }
            else{
                t = next[t];
            }
        }
        return next;
    }
}


