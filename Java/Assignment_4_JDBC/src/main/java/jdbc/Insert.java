package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Insert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            String url = "jdbc:mysql://localhost:3306/mydb";
            String un = "root";
            String pwd = "root";
            String q = " insert into employee_table values(2,'Zara','50000')";

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, un, pwd);
            Statement st = con.createStatement();
            int rowsffected = st.executeUpdate(q);
            System.out.println(rowsffected);
            st.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
	}

}
