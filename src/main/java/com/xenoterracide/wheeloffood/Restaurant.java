package com.xenoterracide.wheeloffood;

import java.util.Calendar;

public class Restaurant implements java.io.Serializable {

    /* probable stupidity. opensAt/closesAt should probably be a separate object
     * called HoursOfOperation, which has an array of ranges, for now leaving it
     * for simplicity
     */
    private String name;
    private Integer opensAt;
    private Integer closesAt;

    public Restaurant() {
    }

    public Restaurant(String name, Integer opensAt, Integer closesAt) {
        this.name = name;
        this.opensAt = opensAt;
        this.closesAt = closesAt;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public Boolean isOpen( Calendar now ) {
        Calendar timeOpensAt  = Calendar.getInstance();
        Calendar timeClosesAt = Calendar.getInstance();

        /* dragons, need to be clearer about other pieces of time */
        timeOpensAt.set( Calendar.HOUR_OF_DAY, this.opensAt );
        timeClosesAt.set(Calendar.HOUR_OF_DAY, this.closesAt);

        if ( now.after(timeOpensAt) && now.before(timeClosesAt)) {
            return true;
        }

        return false;
    }

    public void setOpensAt(Integer opensAt) {
        this.opensAt = opensAt;
    }

    public Integer getOpensAt() {
        return this.opensAt;
    }

    public void setClosesAt(Integer closesAt) {
        this.closesAt = closesAt;
    }

    public Integer getClosesAt() {
        return this.closesAt;
    }
}
