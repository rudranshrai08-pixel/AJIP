package jdbcmysql;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;



public class SavePointEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String jdbc_driver = "com.mysql.cj.jdbc.Driver";
	        String host = "jdbc:mysql://localhost:3306/studentDb2";
	        String username = "root";
	        String password = "Ansu@2004";
	        Connection con = null;
	        Savepoint sp1 = null;
	        Savepoint sp2 = null;
	        

	        try {

	            Class.forName(jdbc_driver);

	             con = DriverManager.getConnection(host, username, password);
	            Statement smt =con.createStatement();
	            con.setAutoCommit(false);
	         //   con.setAutoCommit(true);
	           
	             
				 smt.executeUpdate("""
	                    INSERT INTO student(name,course,marks) VALUES
	                 ,
	                    ('Student8','BTech(IT)',90)
	                    """);
				  sp1= con.setSavepoint("Insert");
				 smt.executeUpdate("""
		                    update student set course = "MCA" where name = "Student8");
		                    """);
				  sp2= con.setSavepoint("update");
				 smt.executeUpdate("""
		                    delete from  where name == "Student7");
		                    """);
				 con.commit();
				 
//	            CallableStatement cst = con.prepareCall("{call getStudents()}");
//	            ResultSet rs = cst.executeQuery();
//
//	            System.out.println("ID\tName\t\tCourse\t\tMarks");
//
//	            while (rs.next()) {
//
//	                int id = rs.getInt("id");
//	                String name = rs.getString("name");
//	                String course = rs.getString("course");
//	                long marks = rs.getLong("marks");
//
//	                System.out.println(
//	                        String.format("%d\t%s\t\t%s\t%d", id, name, course, marks)
//	                );
//	            }

	        } catch (ClassNotFoundException | SQLException e) {
	        	
	        	try {
					
					con.rollback(sp2); 
					
				} catch (SQLException e1) {
					e1.printStackTrace();
				}

				e.printStackTrace();
	        }
	        finally {
	        	try {
	        		con.commit();
	        		con.setAutoCommit(true);
	        	}  catch (SQLException e) {
	        		e.printStackTrace();
	        	}
	        }
	    }

	}


