package com.straus.beans;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.time.LocalDateTime;

public class RankActivityDTO {
    private LocalDateTime startingDate;
    private LocalDateTime endingDate;
    private int userId;

    public LocalDateTime getStartingDate() {
        return startingDate;
    }

    public void setStartingDate(LocalDateTime startingDate) {
        this.startingDate = startingDate;
    }

    public LocalDateTime getEndingDate() {
        return endingDate;
    }

    public void setEndingDate(LocalDateTime endingDate) {
        this.endingDate = endingDate;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        RankActivityDTO that = (RankActivityDTO) o;

        return new EqualsBuilder()
                .append(getUserId(), that.getUserId())
                .append(getStartingDate(), that.getStartingDate())
                .append(getEndingDate(), that.getEndingDate())
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(getStartingDate())
                .append(getEndingDate())
                .append(getUserId())
                .toHashCode();
    }
}
