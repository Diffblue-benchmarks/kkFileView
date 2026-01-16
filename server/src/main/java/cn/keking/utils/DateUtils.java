package cn.keking.utils;

import java.time.Clock;
import java.time.Instant;

/**
 * @author kl (http://kailing.pub)
 * @since 2023/8/11
 */
public class DateUtils {
    /**
     * 获取当前时间的秒级时间戳
     * @return
     */
    public static long getCurrentSecond() {
       return getCurrentSecond(Clock.systemDefaultZone());
    }

    /**
     * 获取当前时间的秒级时间戳
     * @param clock the clock to use for getting current time
     * @return
     */
    public static long getCurrentSecond(Clock clock) {
       return Instant.now(clock).getEpochSecond();
    }

    /**
     * 计算当前时间与指定时间的秒级时间戳差值
     * @param datetime 指定时间
     * @return 差值
     */
    public static long calculateCurrentTimeDifference(long datetime) {
        return calculateCurrentTimeDifference(datetime, Clock.systemDefaultZone());
    }

    /**
     * 计算当前时间与指定时间的秒级时间戳差值
     * @param datetime 指定时间
     * @param clock the clock to use for getting current time
     * @return 差值
     */
    public static long calculateCurrentTimeDifference(long datetime, Clock clock) {
        return getCurrentSecond(clock) - datetime;
    }
}
