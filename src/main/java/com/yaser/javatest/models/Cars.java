package com.yaser.javatest.models;

import java.time.LocalDateTime;

public class Cars {

    private LocalDateTime makeDate;
    private String brand;
    private Integer seatsNumber;
    private EnergyType energiType;
    private String regNumber;

    public Cars(LocalDateTime makeDate, String brand,Integer seatNumber,EnergyType energiType, String regNumber ) {
        this.makeDate = makeDate;
        this.brand = brand;
        this.seatsNumber = seatNumber;
        this.energiType = energiType;
        this.regNumber = regNumber;
    }

    public LocalDateTime getMakeDate() {return this.makeDate;}
    public String getBrand() {return this.brand;}
    public Integer getSeatsNumber() {return this.seatsNumber;}
    public EnergyType getEnergiType() {return this.energiType;}
    public String getRegNumber() {return this.regNumber;}

    public void setMakeDate(LocalDateTime makeDate) {this.makeDate = makeDate;}
    public void setBrand(String brand) {this.brand = brand;}
    public void setSeatsNumber(Integer seatsNumber) {this.seatsNumber = seatsNumber;}
    public void setEnergiType(EnergyType energiType) {this.energiType = energiType;}
    public void setRegNumber(String regNumber) {this.regNumber = regNumber;}


}
