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
import model.DetailAssets;

/**
 *
 * @author buihu
 */
public class DetailAssetsDAO extends DAO{
    
    public DetailAssetsDAO(){
        super();
    }
    
    public int  addDetailAssets(DetailAssets detailAssets, int idCon){
       String sql = "INSERT INTO tbldetailassets(amount, description,tblCollateralId, tblContractId) VALUES(?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, detailAssets.getAmount());
            ps.setString(2, detailAssets.getDescription());
            ps.setInt(3, detailAssets.getCollateral().getId());
            ps.setInt(4, idCon);

            ps.executeUpdate();

            //get id of the new inserted client
            ResultSet generatedKeys = ps.getGeneratedKeys();
            if (generatedKeys.next()) {
                 detailAssets.setId(generatedKeys.getInt(1));
                 return  detailAssets.getId();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
    
}
