package cn.jfoxx.util.random;

/**
 * Created by fenxiang.zhang on 2018/7/11.
 */
public class Number {

    /*
     * Random a number satisfy Gaussian distribution
     *
     * @param e:mathematical expectation
     *
     * @param v:variance
     */
    public static double RandomGaussian(double e, double v) {
        java.util.Random r = new java.util.Random();
        return Math.sqrt(v) * r.nextGaussian() + e;
    }

    /*
     * Random a number satisfy 0-1 Gaussian distribution
     *
     * @param v:variance 0.1 is not bad
     */
    public static double RandomGaussian01(double v) {
        double g = Math
                .abs(Math.round(RandomGaussian(0, v) * 10000) / 10000.0);
        while (g > 1) {
            g = Math.abs(Math.round(RandomGaussian(0, v) * 10) / 10.0);
        }
        return g;
    }

}
