
public class Time2 {
    private int hour;
    private int minute;
    private int second;

    // No-argument constructor
    public Time2() {
        this(0, 0, 0);
    }

    // One parameter
    public Time2(int hour) {
        this(hour, 0, 0);
    }

    // Two parameters
    public Time2(int hour, int minute) {
        this(hour, minute, 0);
    }

    // Three parameters
    public Time2(int hour, int minute, int second) {

        if (hour < 0 || hour >= 24)
            throw new IllegalArgumentException("hour must be 0-23");

        if (minute < 0 || minute >= 60)
            throw new IllegalArgumentException("minute must be 0-59");

        if (second < 0 || second >= 60)
            throw new IllegalArgumentException("second must be 0-59");

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // Copy constructor
    public Time2(Time2 time) {
        this(time.getHour(), time.getMinute(), time.getSecond());
    }

    // Set methods
    public void setTime(int hour, int minute, int second) {
        if (hour < 0 || hour >= 24 ||
            minute < 0 || minute >= 60 ||
            second < 0 || second >= 60) {
            throw new IllegalArgumentException("Invalid time");
        }

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setHour(int hour) {
        if (hour < 0 || hour >= 24)
            throw new IllegalArgumentException("Invalid hour");

        this.hour = hour;
    }

    public void setMinute(int minute) {
        if (minute < 0 || minute >= 60)
            throw new IllegalArgumentException("Invalid minute");

        this.minute = minute;
    }

    public void setSecond(int second) {
        if (second < 0 || second >= 60)
            throw new IllegalArgumentException("Invalid second");

        this.second = second;
    }

    // Get methods
    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public String toUniversalString() {
        return String.format("%02d:%02d:%02d",
            getHour(), getMinute(), getSecond());
    }

    public String toString() {
        return String.format("%d:%02d:%02d %s",
            ((hour == 0 || hour == 12) ? 12 : hour % 12),
            minute, second,
            (hour < 12 ? "AM" : "PM"));
    }
}
