/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import model.User;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author buihu
 */
public class UserDAO extends DAO{

    public UserDAO() {
        super();
    }
    
    public boolean checkLogin(User user){
        boolean result = false;
		String sql = "SELECT fullName, position, id FROM tbluser WHERE username = ? AND password = ?";
		try {
//			System.out.println(con.getMetaData().getDatabaseProductName());
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, user.getUsername());
			ps.setString(2, user.getPassword());
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				user.setFullname(rs.getString("fullName"));
				user.setPosition(rs.getString("position"));
                                user.setId(rs.getInt("id"));
				result = true;
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return result;
    }
    
    
}
