/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rentalmotor;

//import dao.DAO;
import dao.ClientDAO;
import dao.CollateralDAO;
import dao.MotorDAO;
import dao.UserDAO;
import java.util.ArrayList;
import model.Client;
import model.Collateral;
import model.Motor;
import model.User;

/**
 *
 * @author buihu
 */
public class RentalMotor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //DAO dao=new DAO();
       CollateralDAO con =new  CollateralDAO();
        ArrayList<Collateral> array =con.getCollateral();
        for(Collateral x : array){
            System.out.println(x.getName());
        }
        

    }

}
