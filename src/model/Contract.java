/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author buihu
 */
public class Contract implements Serializable{
    private int id;
    private String node;
    private Date rentalDay;
    private String paymentType;
    private User user;
    private Client client;
    private ArrayList<RentalDetail> rentalDetails;
    private ArrayList<DetailAssets> detailAssetses;

    public Contract() {
        super();
        rentalDetails=new ArrayList<>();
        detailAssetses=new ArrayList<>();
    }

    public Contract(String node, Date rentalDay, String paymentType, User user, Client client, ArrayList<RentalDetail> rentalDetails, ArrayList<DetailAssets> detailAssetses) {
        this.node = node;
        this.rentalDay = rentalDay;
        this.paymentType = paymentType;
        this.user = user;
        this.client = client;
        this.rentalDetails = rentalDetails;
        this.detailAssetses = detailAssetses;
    }

    public String getNode() {
        return node;
    }

    public void setNode(String node) {
        this.node = node;
    }

    public Date getRentalDay() {
        return rentalDay;
    }

    public void setRentalDay(Date rentalDay) {
        this.rentalDay = rentalDay;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public ArrayList<RentalDetail> getRentalDetails() {
        return rentalDetails;
    }

    public void setRentalDetails(ArrayList<RentalDetail> rentalDetails) {
        this.rentalDetails = rentalDetails;
    }

    public ArrayList<DetailAssets> getDetailAssetses() {
        return detailAssetses;
    }

    public void setDetailAssetses(ArrayList<DetailAssets> detailAssetses) {
        this.detailAssetses = detailAssetses;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Contract{" + "id=" + id + ", node=" + node + ", rentalDay=" + rentalDay + ", paymentType=" + paymentType + ", user=" + user + ", client=" + client + ", rentalDetails=" + rentalDetails + ", detailAssetses=" + detailAssetses + '}';
    }
    

    
    
    
    
    
    
    
    
    

   
}
