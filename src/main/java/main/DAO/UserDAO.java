/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import main.java.User;
import java.sql.PreparedStatement;
/*import static utils.BaseDao.DB_HOST;
import static utils.BaseDao.DB_NAME;
import static utils.BaseDao.DB_PASS;
import static utils.BaseDao.DB_USER;*/
/**
 *
 * @author Acer
 */
public class UserDAO {
    private String url;
    private String uname;
    private String pass;
    private String query;
    private Connection con;
    private Statement stmt;
    
    public UserDAO(){
        url="jdbc:mysql://localhost/dbdata";
        uname="root";
        pass="";
        setConnectionAndStatement();
        
    }
    private void setConnectionAndStatement(){
        try{
            con=DriverManager.getConnection(url,uname,pass);
            stmt=con.createStatement();
            
        }
        catch(SQLException ex){
            System.err.print(ex.getMessage());
            System.exit(1);
        }
    }
    public void save(User user){
        try{
            query = "INSERT INTO user VALUES('%s','%s','%s','%s')";
            query = String.format(query,user.getNama(),user.getPassword(),user.getUsia(),user.getGender());
            stmt.executeUpdate(query);
            System.out.println("Berhasil menambahkan data!");
        }
        catch(SQLException ex){
            System.err.print("Error inserting data:"+ex.getMessage());
            System.exit(1);
        }
    }
    public User get(String nama, String password){
        User user = null;
        //boolean login=false;
        try{
            query = "SELECT * FROM user WHERE nama='&s' AND password='&s'";
            query = String.format(query, nama,password);
            ResultSet rs = stmt.executeQuery(query);
            
            if(rs.next()!=false){
                user = new User();
                user.setNama(rs.getString("nama"));
                user.setGender(rs.getString("gender"));
                user.setUsia(rs.getString("usia"));
                user.setPassword(rs.getString("password"));
                //user.setLogin(true);
                
            }else{
               //user.setLogin(false);
               System.out.print("data tidak ditemukan");
            }
        }catch(SQLException ex){
            System.err.print("Error getting the data: "+ex.getMessage());
            System.exit(1);
        }
        return user;
    }
    public void delete(User user){
        try{
            query = "DELETE FROM user WHERE nama = '%s'";
            query = String.format(query,user.getNama());
            stmt.executeUpdate(query);
            System.out.println("Berhasil menghapus data!");   
        }
        catch(SQLException ex){
            System.err.print("Error getting the data: "+ex.getMessage());
            System.exit(1);
        }
    }
}
