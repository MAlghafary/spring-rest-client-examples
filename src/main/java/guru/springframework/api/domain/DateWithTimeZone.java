package guru.springframework.api.domain;

public class DateWithTimeZone {

    private String date;
    private int timezone_type;
    private String timeZone;

    public DateWithTimeZone(String date, int timezone_type, String timeZone) {
        this.date = date;
        this.timezone_type = timezone_type;
        this.timeZone = timeZone;
    }

    public String getDate() {
        return date;
    }

    public int getTimezone_type() {
        return timezone_type;
    }

    public String getTimeZone() {
        return timeZone;
    }
}
