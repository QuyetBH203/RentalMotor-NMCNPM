/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.ArrayList;
import model.Motor;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

/**
 *
 * @author buihu
 */
public class MotorDAO extends DAO {

    public MotorDAO() {
        super();
    }

    public ArrayList<Motor> searchMotor(String key, String startDate , String endDate) {
        ArrayList<Motor> result = new ArrayList<>();
        String sql = "SELECT * FROM tblMotor m WHERE m.id NOT IN "
                + "(SELECT rd.tblMotorId FROM tblRentalDetail rd WHERE "
                + "(rd.startDate <= ? AND rd.endDate >= ?) OR "
                + "(rd.startDate <= ? AND rd.endDate >= ?) OR "
                + "(rd.startDate >= ? AND rd.endDate <= ?)) "
                + "AND ((m.name LIKE ? OR m.manufacture LIKE ?) AND m.partner='0')";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, endDate);
            ps.setString(2, startDate);
            ps.setString(3, startDate);
            ps.setString(4, startDate);
            ps.setString(5, startDate);
            ps.setString(6, endDate);
            ps.setString(7, "%" + key + "%");
            ps.setString(8, "%" + key + "%");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Motor motor = new Motor();
                motor.setId(rs.getInt("id"));
                motor.setName(rs.getString("name"));
                motor.setManufacture(rs.getString("manufacture"));
                motor.setLaunchYear(rs.getInt("launchYear"));
                motor.setLicensePlate(rs.getString("licensePlate"));
                motor.setPrice(rs.getDouble("price"));
                motor.setStoreId(rs.getInt("storeId"));
                motor.setPartner(Boolean.FALSE);
                result.add(motor);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;

    }

    public ArrayList<Motor> searchMotorByPartner(String key) {
        ArrayList<Motor> result = new ArrayList<>();
        String sql = "SELECT * FROM tblmotor WHERE ("
                + "name LIKE ? OR "
                + "manufacture LIKE ? OR "
                + "launchYear LIKE ? OR "
                + "licensePlate LIKE ? OR "
                //+ "price LIKE ? OR "
                + "storeId LIKE ? ) AND partner='1' ";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            for (int i = 1; i <= 5; i++) {
                ps.setString(i, "%" + key + "%");
            }
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Motor motor = new Motor();
                motor.setId(rs.getInt("id"));
                motor.setName(rs.getString("name"));
                motor.setManufacture(rs.getString("manufacture"));
                motor.setLaunchYear(rs.getInt("launchYear"));
                motor.setLicensePlate(rs.getString("licensePlate"));
                motor.setPrice(rs.getDouble("price"));
                motor.setStoreId(rs.getInt("storeId"));
                motor.setPartner(Boolean.TRUE);
                result.add(motor);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

}
