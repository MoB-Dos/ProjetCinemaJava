import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;



public class BDDtest {
//  Query1.java:  Query an mSQL database using JDBC. 


/**
 * A JDBC SELECT (JDBC query) example program.
 * @return 
 */
        
	  public int defLigne() {
		  

	  try {
          String url = "jdbc:mysql://localhost/projet_cinema?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
          String user="root";
  		String password ="";
  		Connection conn = DriverManager.getConnection(url,user,password);
          Statement stmt = conn.createStatement();
          ResultSet rs;

          rs = stmt.executeQuery("SELECT * FROM stockagebilan");
          
          int a = 0;
          int i = 0;
          
          while (rs.next()){
          	
        	  a++;
          	
          }
       
          return a;
          
      } catch (Exception e) {
          System.err.println("Got an exception! ");
          System.err.println(e.getMessage());
      }
	return 0;
	  
  }
	  
	  
	  public Object[][] select() {
		  
		  
	  try {
            String url = "jdbc:mysql://localhost/projet_cinema?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
            String user="root";
    		String password ="";
    		Connection conn = DriverManager.getConnection(url,user,password);
            Statement stmt = conn.createStatement();
            ResultSet rs;
 
            rs = stmt.executeQuery("SELECT * FROM stockagebilan");
            
            int i = 0;
            int a = this.defLigne();
            
            Object[][] tab = new Object[a][8];
            
            while (rs.next()){
            
            		tab[i][0] = rs.getInt("numero");
            		tab[i][1] = rs.getInt("nombre");
            		tab[i][2] = rs.getInt("Etud");
            		tab[i][3] = rs.getInt("Dix");
            		tab[i][4] = rs.getInt("Navigo");
            		tab[i][5] = rs.getInt("PleinTarif");
            		tab[i][6] = rs.getString("film");
            		tab[i][7] = rs.getString("date");
            		
                   i++;
            }
            
   
            return tab;
            
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
	
	return null;
	  
    }
}
  