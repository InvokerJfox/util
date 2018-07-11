package cn.jfoxx.util.get;

/**
 * Created by fenxiang.zhang on 2018/7/11.
 */
public class GDoubleMatrix {

    /**
     * Int[] to double[]
     *
     * @param o
     * @return
     */
    public static double[] fromIntergerMatrix(int[] o) {
        double[] r = new double[o.length];
        for (int i = 0; i < o.length; i++) {
            r[i] = o[i];
        }
        return r;
    }

}
