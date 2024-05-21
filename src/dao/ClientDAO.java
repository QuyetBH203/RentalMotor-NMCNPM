/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.ArrayList;
import model.Client;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author buihu
 */
public class ClientDAO extends DAO {

    public ClientDAO() {
        super();
    }

    public ArrayList<Client> searchClient(String key) {
        ArrayList<Client> result = new ArrayList<>();
        String sql = "SELECT * FROM tblclient WHERE name LIKE ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, "%" + key + "%");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Client client = new Client();
                client.setId(rs.getInt("id"));
                client.setPhoneNumber(rs.getString("phoneNumber"));
                client.setAddress(rs.getString("address"));
                client.setMail(rs.getString("mail"));
                client.setCitizenIdentification(rs.getString("citizenId"));
                client.setGender(rs.getString("gender"));
                client.setNode(rs.getString("note"));
                client.setName(rs.getString("name"));              
                result.add(client);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public int addClient(Client client) {
        String sql = "INSERT INTO tblclient(phoneNumber, address, mail, citizenId, gender, note, name) VALUES(?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, client.getPhoneNumber());
            ps.setString(2, client.getAddress());
            ps.setString(3, client.getMail());
            ps.setString(4, client.getCitizenIdentification());
            ps.setString(5, client.getGender());
            ps.setString(6, client.getNode());
            ps.setString(7, client.getName());
            ps.executeUpdate();

            //get id of the new inserted client
            ResultSet generatedKeys = ps.getGeneratedKeys();
            if (generatedKeys.next()) {
                 client.setId(generatedKeys.getInt(1));
                 return  client.getId();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

}
