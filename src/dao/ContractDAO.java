/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import model.Contract;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import model.RentalDetail;

/**
 *
 * @author buihu
 */
public class ContractDAO extends DAO {

    public ContractDAO() {
        super();
    }

    public boolean addContract(Contract b) {

        boolean result = true;
        String addContract
                = "INSERT INTO tblcontract(note, rentalDay, paymentTye, tblClientId, tblUserId) VALUES (?,?,?,?,?)";
        String addRentalDetail
                = "INSERT INTO tblrentaldetail(numberOfMotor, price, startDate, endDate, tblMotorId, tblContractId,desDamages,numberOfDamages)"
                + "VALUES(?,?,?,?,?,?,?,?)";
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        try {
//            con.setAutoCommit(false);
            PreparedStatement ps = con.prepareStatement(addContract, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, b.getNode());
            ps.setString(2, formatter.format(new Date()));
            ps.setString(3, b.getPaymentType());
            ps.setInt(4, b.getClient().getId());
            ps.setInt(5, b.getUser().getId());
            ps.executeUpdate();
            //get id of the new inserted booking
            ResultSet generatedKeys = ps.getGeneratedKeys();
            if (generatedKeys.next()) {
                b.setId(generatedKeys.getInt(1));
                for (RentalDetail x : b.getRentalDetails()) {
                    PreparedStatement pa = con.prepareStatement(addRentalDetail, Statement.RETURN_GENERATED_KEYS);
                    pa.setInt(1, 1);
                    pa.setDouble(2, x.getMotor().getPrice());
                    pa.setString(3, formatter.format(x.getStartDate()));
                    pa.setString(4, formatter.format(x.getEndDate()));
                    pa.setInt(5, x.getMotor().getId());
                    pa.setInt(6, b.getId());
                    pa.setString(7, x.getDesDamage());
                    pa.setInt(8, 1);
                    pa.executeUpdate();
                    //get id of the new inserted booking
                    ResultSet generatedKeyss = pa.getGeneratedKeys();
                    if(generatedKeys.next()){
                        x.setId(generatedKeyss.getInt(1));
                    }
                }
            }

            //con.commit();//set this line into comment in JUnit test mode
        } catch (SQLException e) {
            result = false;
            try {
                con.rollback();
            } catch (SQLException ex) {
                result = false;
                ex.printStackTrace();
            }
            e.printStackTrace();
        } finally {
            try {
                //con.setAutoCommit(true);//set this line into comment in JUnit test mode
            } catch (Exception ex) {
                result = false;
                ex.printStackTrace();
            }
        }
        return result;
    }
}
