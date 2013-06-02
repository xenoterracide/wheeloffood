package com.xenoterracide.wheeloffood;

import javax.validation.constraints.*;

public class Time implements java.io.Serializable {

    @Min(0)
    @Max(23)
    private Integer hour = 0;

    @Min(0)
    @Max(60)
    private Integer minute = 0;

    @Min(0)
    @Max(60)
    private Integer second = 0;

    public Time() {
    }

    public Time( Integer hour, Integer minute, Integer second ) {
       this.hour   = hour;
       this.minute = minute;
       this.second = second;
    }

    public void setHour(Integer hour) {
        this.hour = hour;
    }

    public Integer getHour() {
        return this.hour;
    }

    public void setMinute(Integer minute) {
        this.minute = minute;
    }

    public Integer getMinute() {
        return this.minute;
    }

    public void setSecond(Integer second) {
        this.second = second;
    }

    public Integer getSecond() {
        return this.second;
    }
}
