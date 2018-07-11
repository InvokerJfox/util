package cn.jfoxx.util.get;

import java.util.ArrayList;

/**
 * Created by fenxiang.zhang on 2018/7/11.
 */
public class GArrayList {


    /**
     * "123/25/52" to ArrayList<Integer>:{123,25,52} split by "/"
     * @param ts
     * @param split
     * @return
     */
    public static ArrayList<Integer> fromString(String ts, String split) {
        String[] r = ts.split(split);
        ArrayList<Integer> res = new ArrayList<Integer>();
        for (String aR : r) {
            res.add(Integer.valueOf(aR));
        }
        return res;
    }
}

