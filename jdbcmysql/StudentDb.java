package jdbcmysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class StudentDb {

    public static void main(String[] args) {

        String jdbc_driver = "com.mysql.cj.jdbc.Driver";
        String host = "jdbc:mysql://localhost:3306/studentDb2";
        String username = "root";
        String password = "Ansu@2004";

        String create_table = """
                CREATE TABLE IF NOT EXISTS student (
                id INT PRIMARY KEY AUTO_INCREMENT,
                name VARCHAR(50) NOT NULL,
                course VARCHAR(50),
                marks DECIMAL(10,2)
                )
                """;

        try {

            Class.forName(jdbc_driver);
            System.out.println("Driver is Ready");

            Connection con = DriverManager.getConnection(host, username, password);
            System.out.println("Host Ready");

            Statement smt = con.createStatement(
                    ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE
            );

            ResultSet rs = smt.executeQuery("select * from student");

            rs.moveToInsertRow();
            rs.updateString("name", "Student5");
            rs.updateString("course", "PhD");
            rs.updateDouble("marks", 70);
            rs.insertRow();

            rs.beforeFirst();

            System.out.println("ID\tName\t\tCourse\t\tMarks");

            while (rs.next()) {

                double marks = rs.getDouble("marks");

                // increase marks if <= 70
                if (marks <= 70) {
                    marks = marks + 5;
                    rs.updateDouble("marks", marks);
                    rs.updateRow();
                }

                int id = rs.getInt("id");
                String name = rs.getString("name");
                String course = rs.getString("course");

                System.out.printf("%-5d %-15s %-10s %-10.2f\n", id, name, course, marks);
            }

            con.close();

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }


        // create table
//            smt.execute(create_table);
//
//            // remove old records
//           smt.executeUpdate("DELETE FROM student");
//
//            // insert students
//            int rowAffected = smt.executeUpdate("""
//                    INSERT INTO student(name,course,marks) VALUES
//                    ('Student1','MCA',96.5),
//                    ('Student2','BCA',68.0),
//                    ('Student3','BTech(CS)',60.5),
//                    ('Student4','B.Pharma',65.75)
//                    """);
//
//            if (rowAffected > 0) {
//                System.out.println("Records inserted");
//            }

        // display records
//        ResultSet rs = smt.executeQuery("SELECT * FROM student");
//
//        System.out.printf("%-5s %-15s %-10s %-10s\n", "ID", "Name", "Course", "Marks");
//
//        while (rs.next()) {
//
//            double marks = rs.getDouble("marks");
//
//            // increase marks if <= 70
//            if (marks <= 70) {
//                marks = marks + 5;
//                rs.updateDouble("marks", marks);
//                rs.updateRow();
//            }
//
//            int id = rs.getInt("id");
//            String name = rs.getString("name");
//            String course = rs.getString("course");
//
//            System.out.printf("%-5d %-15s %-10s %-10.2f\n", id, name, course, marks);
//        }
//
//        con.close();
//
//        } catch (ClassNotFoundException | SQLException e) {
//            System.out.println(e.getMessage());
//        }
    }
}