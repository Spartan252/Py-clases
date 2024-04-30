package Actividades.Actividad_13;

import java.util.Calendar;

public class DateTime extends Date {

    private int hour, minute, second;

    // Constructores____________________________________________________________

    public DateTime(int year, int month, int day, int hour, int minute, int second) {
        super(year, month, day);
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public DateTime(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public DateTime() {
        setHour();
        setMinute();
        setSecond();
    }

    public DateTime(Date date) {
        setCurrentTime();
    }

    // Setters______________________________________________________________
    public void setHour(int hr) {
        if (hr >= 0 && hr <= 23)
            hour = hr;
        else if (hr >= 24) {
            setDay(day += hr / 24);
            hour -= hr - ((hr / 24) * 24);
        }
    }

    public void setMinute(int min) {
        if (min >= 0 && min <= 59)
            minute = min;
        else if (min >= 60) {
            setHour(hour += min / 60);
            minute = min - ((min / 60) * 60);
        }
    }

    public void setSecond(int sec) {
        if (sec >= 0 && sec <= 59)
            second = sec;
        else if (sec >= 60) {
            setMinute(minute += sec / 60);
            second = sec - ((sec / 60) * 60);
        }
    }

    public void setHour() {
        hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
    }

    public void setMinute() {
        minute = Calendar.getInstance().get(Calendar.MINUTE);
    }

    public void setSecond() {
        second = Calendar.getInstance().get(Calendar.SECOND);
    }

    public void setCurrentTime() {
        hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
        minute = Calendar.getInstance().get(Calendar.MINUTE);
        second = Calendar.getInstance().get(Calendar.SECOND);
    }

    public void setDateTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // Getters________________________________________________________________
    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    // Extras________________________________________________________________

    public void Next() {
        setSecond(second + 1);
    }

    public DateTime clone(DateTime dt) {
        return new DateTime(dt.getYear(), dt.getMonth(), dt.getDay(), dt.getHour(), dt.getMinute(), dt.getSecond());
    }

    public boolean equals(Object o) {
        boolean retVal = false;
        if (o instanceof DateTime) {
            DateTime dt = (DateTime) o;
            retVal = super.equals(dt) && hour == dt.getHour() && minute == dt.getMinute() && second == dt.getSecond();
        }
        return retVal;
    }

    @Override
    public DateTime clone() {
        return new DateTime(year, month, day, hour, minute, second);
    }

    @Override
    public String toString() {
        return super.toString() + "\nDate Time: " + hour + ":" + minute + ":"
                + second;
    }
}