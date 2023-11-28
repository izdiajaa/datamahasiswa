/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package springHibernate;

import com.mysql.cj.jdbc.MysqlDataSource;

import java.sql.Connection;
import java.sql.SQLException;
/**
 *
 * @author dell
 */
public class koneksi {
    static Connection c;
    
    public static Connection connection(){
        if(c == null){
            MysqlDataSource data = new MysqlDataSource();
            data.setDatabaseName("belajar");
            data.setUser("root");
            data.setPassword("");
            try{
                c = data.getConnection();
            }catch(SQLException ex){
                ex.printStackTrace();
            }
        }
        return c;
    }
}
