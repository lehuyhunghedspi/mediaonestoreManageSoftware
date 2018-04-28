/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccessLayer;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lehuyhung
 */
public class DataProvider {
    private final String classname="com.mysql.jdbc.Driver";
    private Connection connection;
    private String user="root";
    private String password="";
    private final String url="jdbc:mysql://localhost:3306/mydb";
    private static DataProvider dataProvider;
    private DataProvider(){
        try {
            Class.forName(classname);
            connection=DriverManager.getConnection(url,user,password);
        } catch (ClassNotFoundException ex) {
            System.out.println("khong tim thay class");
        } catch (SQLException ex) {
             System.out.println("ket noi that bai");
        }
    }
    public static DataProvider getDatDataProvider() {
        if(DataProvider.dataProvider==null){
            DataProvider.dataProvider=new DataProvider();
            return DataProvider.dataProvider;
        }
        return dataProvider;
    }
    
    public ResultSet executeQuery(String query) {
        
       ResultSet resultSet=null;
       Statement statement;
        try {
            statement = connection.createStatement();
            resultSet=statement.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(DataProvider.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return resultSet;
    }
    
    public static void main(String[] args) {
        
        ResultSet rs=DataProvider.getDatDataProvider().executeQuery("select * from nhanvien");
        try {
            while(rs.next()){
                System.out.println(rs.getString("tennhanvien"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DataProvider.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
