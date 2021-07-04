package com.yaser.javatest.models;

public class Person {
    private int id;
    private String firstName;
    private String lastName;
    private byte age;
    private String address;

    public Person(int id, String firstName, String lastName, byte age, String address) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
    }

    public Integer getId() { return this.id;}
    public String getFirstName() {return this.firstName;}
    public String getLastName() {return this.lastName;}
    public String getAddress() {return this.address;}

    public void setId() {this.id = id;}
    public void setFirstName() {this.firstName = firstName;}
    public void setLastName() {this.lastName= lastName;}
    public void setAge() {this.age = age;}
    public void setAddress() {this.address=address;}

}
