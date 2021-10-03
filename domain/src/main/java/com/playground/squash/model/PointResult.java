package com.playground.squash.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PointResult {

    private int pointNumber;
    private boolean p1Served;
    private boolean servedFromLeft;
    private PointOutcome pointOutcome;

    public PointResult(boolean p1Served, boolean servedFromLeft, PointOutcome pointOutcome) {
        this.p1Served = p1Served;
        this.servedFromLeft = servedFromLeft;
        this.pointOutcome = pointOutcome;
    }
}
