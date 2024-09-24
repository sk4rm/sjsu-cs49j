public class Difference {
    public static void inTimes(String time1, String time2) {
        int parsed1 = Integer.parseInt(time1);
        int parsed2 = Integer.parseInt(time2);

        int hour1 = parsed1 / 100;
        int hour2 = parsed2 / 100;

        int min1 = parsed1 % 100 + hour1 * 60;
        int min2 = parsed2 % 100 + hour2 * 60;
        if (min2 < min1) min2 += 24 * 60;

        int minDiff = min2 - min1;
        int hourDiff = minDiff / 60;
        minDiff = minDiff % 60;

        System.out.printf("%d hour(s) %d minute(s)", hourDiff, minDiff);
    }
}
