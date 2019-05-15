package com.straus.beans;

import java.util.ArrayList;
import java.util.List;

public class SeasonStatistic extends Statistic {
    private List<Statistic> heroStats;

    public SeasonStatistic(String name) {
        super(name);
        this.heroStats = new ArrayList<>();
    }

    public List<Statistic> getHeroStats() {
        return heroStats;
    }

    public void setHeroStats(List<Statistic> heroStats) {
        this.heroStats = heroStats;
    }
}
