/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author buihu
 */
public class RentalDetail implements Serializable{
    private int id;
    private int numberOfMotor;
    private String note;
    private Double  price;
    private Date startDate;
    private Date endDate;
    private Motor motor;
    private String desDamage;
    private int numberOfDamage;

    public RentalDetail(int numberOfMotor, String note, Double price, Date startDate, Date endDate, 
            Motor motor, String desDamage, int numberOfDamage) {
        this.numberOfMotor = numberOfMotor;
        this.note = note;
        this.price = price;
        this.startDate = startDate;
        this.endDate = endDate;
        this.motor = motor;
        this.desDamage = desDamage;
        this.numberOfDamage = numberOfDamage;
    }

    public RentalDetail() {
        super();
    }

    public int getNumberOfMotor() {
        return numberOfMotor;
    }

    public void setNumberOfMotor(int numberOfMotor) {
        this.numberOfMotor = numberOfMotor;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public String getDesDamage() {
        return desDamage;
    }

    public void setDesDamage(String desDamage) {
        this.desDamage = desDamage;
    }

    public int getNumberOfDamage() {
        return numberOfDamage;
    }

    public void setNumberOfDamage(int numberOfDamage) {
        this.numberOfDamage = numberOfDamage;
    }

    @Override
    public String toString() {
        return "RentalDetail{" + "id=" + id + ", numberOfMotor=" + numberOfMotor + ", note=" + note + ", price=" + price + ", startDate=" + startDate + ", endDate=" + endDate + ", motor=" + motor + ", desDamage=" + desDamage + ", numberOfDamage=" + numberOfDamage + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
    

  

}
