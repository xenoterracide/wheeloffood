package com.xenoterracide.wheeloffood;

import javax.validation.constraints.*;

public class Time implements java.io.Serializable {

    @Min(0)
    @Max(23)
    private Integer hour = 0;

    @Min(0)
    @Max(59)
    private Integer minute = 0;

    @Min(0)
    @Max(59)
    private Integer second = 0;

    public Time() {
    }

    public Time( Integer hour, Integer minute, Integer second ) {
        this.setHour(hour);
        this.setMinute(minute);
        this.setSecond(second);
    }

    public void setHour(Integer hour) {
        if ( hour > 23 || hour < 0 ) {
           throw new IllegalArgumentException("Hour must be 0-23");
        }
        this.hour = hour;
    }

    public Integer getHour() {
        return this.hour;
    }

    public void setMinute(Integer minute) {
        if ( minute > 59 || minute < 0 ) {
            throw new IllegalArgumentException("Minute must be 0-59");
        }
        this.minute = minute;
    }

    public Integer getMinute() {
        return this.minute;
    }

    public void setSecond(Integer second) {
        if ( second > 59 || second < 0 ) {
            throw new IllegalArgumentException("Second must be 0-59");
        }
        this.second = second;
    }

    public Integer getSecond() {
        return this.second;
    }
}
