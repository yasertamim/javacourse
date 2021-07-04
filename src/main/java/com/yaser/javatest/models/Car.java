package com.yaser.javatest.models;

import java.time.Instant;

public class Car {

    private String reg;
    private Color color;
    private Instant modelDate;
    private Long distance;

    public Car(String reg, Color color, Instant modelDate, Long distance) {
        this.reg= reg;
        this.color = color;
        this.modelDate = modelDate;
        this.distance = distance;
    }

    public String getReg() {
        return this.reg;
    }

    public Color getColor() {
        return this.color;
    }

    public Instant getModelDate() {
        return this.modelDate;
    }

    public Long getDistance() {
        return this.distance;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void  setModelDate(Instant modelDate) {
        this.modelDate = modelDate;
    }

    public void setDistance(Long distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return this.getReg() +"," + this.getColor()+ ","+ this.getModelDate()+ "," + this.getDistance();
    }


}
