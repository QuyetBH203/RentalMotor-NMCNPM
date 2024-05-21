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
public class Client implements Serializable {
    private int id;
    private String phoneNumber,address, mail,
            citizenIdentification,gender, node,name;

    public Client(String phoneNumber, String address, String mail, String citizenIdentification, String gender, String node, String name) {
        
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.mail = mail;
        this.citizenIdentification = citizenIdentification;
        this.gender = gender;
        this.node = node;
        this.name = name;
    }

    public Client() {
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getCitizenIdentification() {
        return citizenIdentification;
    }

    public void setCitizenIdentification(String citizenIdentification) {
        this.citizenIdentification = citizenIdentification;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNode() {
        return node;
    }

    public void setNode(String node) {
        this.node = node;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Client{" + "id=" + id + ", phoneNumber=" + phoneNumber + ", address=" + address + ", mail=" + mail + ", citizenIdentification=" + citizenIdentification + ", gender=" + gender + ", node=" + node + ", name=" + name + '}';
    }
    
    
    
    

}
