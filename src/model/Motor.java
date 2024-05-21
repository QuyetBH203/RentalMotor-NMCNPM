/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;

/**
 *
 * @author buihu
 */
public class Motor implements Serializable{

    private Integer id;
    private String name;
    private String manufacture;
    private Integer launchYear;
    private String licensePlate;
    private Double price;
    private Integer storeId;
    private Boolean partner;
    

    public Motor(Integer id, String name, String manufacture, Integer launchYear,
            String licensePlate, Double price, Integer storeId, Boolean partner) {
        this.id = id;
        this.name = name;
        this.manufacture = manufacture;
        this.launchYear = launchYear;
        this.licensePlate = licensePlate;
        this.price = price;
        this.storeId = storeId;
        this.partner = partner;
    }

    public Motor() {
        super();

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public Integer getLaunchYear() {
        return launchYear;
    }

    public void setLaunchYear(Integer launchYear) {
        this.launchYear = launchYear;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public Boolean getPartner() {
        return partner;
    }

    public void setPartner(Boolean partner) {
        this.partner = partner;
    }

    @Override
    public String toString() {
        return "Motor{" + "id=" + id + ", name=" + name + ", manufacture=" + manufacture + ", launchYear=" + launchYear + ", licensePlate=" + licensePlate + ", price=" + price + ", storeId=" + storeId + ", partner=" + partner + '}';
    }
    
}
