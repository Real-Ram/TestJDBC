package Test_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJDBC {
    
    static Connection conn;
    public static void main(String[] args) {
   	 String conn_url = "jdbc:mysql://localhost:3306/flyaway";
   	 String UN = "root";
   	 String PWD = "root";
   	 String str[] = new String[5];

   	 conn = null;
   	 try {
   		 
   		String qry = "Select * from f_user where name ='ram sangle'";

		conn = DriverManager.getConnection(conn_url, UN, PWD);
		Statement statement = conn.createStatement();
		ResultSet resultSet = statement.executeQuery(qry);

		while (resultSet.next()) {
			String act_name = (resultSet.getString("name"));
			String city_name = (resultSet.getString("city"));
			String email_name = (resultSet.getString("email"));
			String id_name = (resultSet.getString("ID"));
			String date_signUP = (resultSet.getString("date_signup"));
			String act_pwd = (resultSet.getString("pwd"));
			String act_adress = (resultSet.getString("address"));
			System.out.println(act_name);
			System.out.println(city_name);
			System.out.println(email_name);
			System.out.println(id_name);
			System.out.println(date_signUP);
			System.out.println(act_pwd);
			System.out.println(act_adress);

			str[0] = act_name;
			str[1] = city_name;
			str[2] = email_name;
			str[3] = act_adress;
			str[4] = act_pwd;
   		 }
   		 
   	 } catch (SQLException e) {
   		 // TODO Auto-generated catch block
   		 e.printStackTrace();
   	 }

   	 System.out.println("done");
    }
}