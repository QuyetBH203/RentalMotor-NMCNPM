/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import static dao.DAO.con;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import model.Client;
import model.Collateral;

/**
 *
 * @author buihu
 */
public class CollateralDAO extends DAO{
   
    
    public CollateralDAO(){
        super();
    }
    
    public int addCollateral(Collateral collateral) {
        String sql = "INSERT INTO tblcollateral(name, price) VALUES(?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, collateral.getName());
            ps.setDouble(2, collateral.getPrice());
            ps.executeUpdate();

            //get id of the new inserted client
            ResultSet generatedKeys = ps.getGeneratedKeys();
            if (generatedKeys.next()) {
                 collateral.setId(generatedKeys.getInt(1));
                 return  collateral.getId();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
    
}
