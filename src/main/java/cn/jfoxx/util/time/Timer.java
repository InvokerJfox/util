package cn.jfoxx.util.time;

/**
 * Created by fenxiang.zhang on 2018/7/11.
 */
public class Timer {

    private long st = 0;

    /*
     * set start time
     */
    public long Start() {
        st = System.currentTimeMillis();// start time
        return st;
    }

    /*
     * show tick time
     */
    public void tick(String info) {
        System.out.print(info + (System.currentTimeMillis() - st) / 1000f
                + " s\n");
    }

    /**
     * Show end time
     *
     * @param info
     */
    public void end(String info) {
        tick(info);
    }
}
