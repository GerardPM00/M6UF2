package m6uf2ex1;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class m6uf2ex1 {

	public static void main(String[] args) {
		Connection con = null;
		Driver driver = null;
		String url = "jdbc:mysql://localhost:8080/m6uf2";
		String usuari = "root";
		String password = "";
		try{
			Class.forName("com.mysql.jdbc.Driver");
		}catch(ClassNotFoundException ex){

		}
		try{
			con = DriverManager.getConnection(url,usuari,password);
		}catch(SQLException ex){
			
		}
		try{
			driver = DriverManager.getDriver(url);
			Properties properties = new Properties();
			properties.setProperty("user",usuari);
			properties.setProperty("password", password);
			
			con = driver.connect(url,  properties);
			System.out.println("ok");
			con.close();
		}catch(SQLException ex){
			
		}
	}

}
