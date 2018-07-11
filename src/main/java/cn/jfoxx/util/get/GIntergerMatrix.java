package cn.jfoxx.util.get;

/**
 * Created by fenxiang.zhang on 2018/7/11.
 */
public class GIntergerMatrix {

    /**
     * "01010101" to int[] "{0,1,0,0,0,1,0,1}
     *
     * @param ts
     * @return
     */
    public static int[] fromBinaryString(String ts) {
        int[] res = new int[ts.length()];
        for (int i = 0; i < ts.length(); i++) {
            res[i] = ts.charAt(i) - 48;
        }
        return res;
    }

    /**
     * "0,1,0,1,0,1,0,1" to int[] "{0,1,0,0,0,1,0,1}
     *
     * @param a input array
     * @param s separator char
     * @return
     */
    public static int[] fromString(String a, String s) {
        String[] ts = a.split(s);
        int[] res = new int[ts.length];
        for (int i = 0; i < ts.length; i++) {
            res[i] = Integer.valueOf(ts[i]);
        }
        return res;
    }

}
