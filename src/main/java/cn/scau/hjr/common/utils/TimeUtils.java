package cn.scau.hjr.common.utils;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class TimeUtils {
    public static String timestampToString(Timestamp timestamp) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");//定义格式，不显示毫秒
        String time = df.format(timestamp);
        return time;
    }
    public static String currentTime() {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd_HH时MM分");//定义格式，显示到分
        String time = df.format(new Timestamp(System.currentTimeMillis()));
        return time;
    }
}
