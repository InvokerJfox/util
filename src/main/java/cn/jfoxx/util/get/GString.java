package cn.jfoxx.util.get;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fenxiang.zhang on 2018/7/11.
 */
public class GString {
    /**
     * GArrayList to a string
     *
     * @param a input array
     * @param s separator char
     * @return GString
     */
    public static String fromList(List<?> a, String s) {
        java.lang.String res = "";
        for (Object anA : a) {
            res += anA + s;
        }
        return res.substring(0, res.length() - s.length());
    }

    public static String fromBinaryIntMatrix(int[] a) {
        String s = "";
        for (int anA : a) {
            s += anA;
        }
        return s;
    }

}
