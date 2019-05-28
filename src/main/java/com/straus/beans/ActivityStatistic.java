package com.straus.beans;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.time.LocalDate;
import java.util.Comparator;

public class ActivityStatistic implements Comparator<ActivityStatistic> {
    private LocalDate date;
    private int value;

    public ActivityStatistic(LocalDate date, int value) {
        this.date = date;
        this.value = value;
    }

    public ActivityStatistic(LocalDate date) {
        this.date = date;
        this.value = 0;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void incrementValue() {
        this.value += 1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        ActivityStatistic that = (ActivityStatistic) o;

        return new EqualsBuilder()
                .append(getValue(), that.getValue())
                .append(getDate(), that.getDate())
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(getDate())
                .append(getValue())
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("date", date)
                .append("value", value)
                .toString();
    }


    @Override
    public int compare(ActivityStatistic o1, ActivityStatistic o2) {
        return o1.getDate().compareTo(o2.getDate());
    }
}
