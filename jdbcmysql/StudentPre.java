package jdbcmysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentPre {

    public static void main(String[] args) {

        String jdbc_driver = "com.mysql.cj.jdbc.Driver";
        String host = "jdbc:mysql://localhost:3306/studentDb2";
        String username = "root";
        String password = "Ansu@2004";

        String query = "SELECT * FROM student WHERE course = ?";
        String insert ="insert into student(name,course,marks) values(?,?,?)";
        
        
        String update = "UPDATE student SET marks = ? WHERE name = ?";

        try {

            Class.forName(jdbc_driver);

            Connection con = DriverManager.getConnection(host, username, password);
            
//            PreparedStatement inpst = con.prepareStatement(insert);
//            inpst.setString(1, "Student7");
//            inpst.setString(2, "MCA");
//            inpst.setLong(3,67);
//            inpst.executeUpdate();

            
            PreparedStatement upst = con.prepareStatement(update);
            upst.setDouble(1, 85);          
            upst.setString(2, "Student7");  
            upst.executeUpdate();

            PreparedStatement pst = con.prepareStatement(query);

            pst.setString(1, "MCA");

            ResultSet rs = pst.executeQuery();

            System.out.println("ID\tName\t\tCourse\t\tMarks");

            while (rs.next()) {

                int id = rs.getInt("id");
                String name = rs.getString("name");
                String course = rs.getString("course");
                double marks = rs.getDouble("marks");

                System.out.println(
                        String.format("%d\t%s\t\t%s\t%.2f", id, name, course, marks)
                );
            }

            con.close();

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}