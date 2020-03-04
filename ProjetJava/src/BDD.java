

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Statement;


public class BDD {
	
	
	//methode d'insertion
	public void ajout(String Nbm,String Etud,String Navigo,String Dix, String Pleintarif, String filmA, String date1) {
		
			String url="jdbc:mysql://localhost/projet_cinema?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
			String user="root";
			String password ="";
			
			try {
				Connection cnx = DriverManager.getConnection(url,user,password);
				Statement stmt = cnx.createStatement();
		        ResultSet rs;    
		        stmt.executeUpdate("INSERT INTO stockagebilan (nombre,Etud,Navigo,Dix,Pleintarif, film, date)" + "VALUES ("+ Nbm + " ,'"+ Etud + "','"+ Dix + "','"+ Navigo + "','"+ Pleintarif + "', '"+ filmA +"','"+ date1 +"')");
		        
		            cnx.close();
			}catch (SQLException e) {
				System.out.println("Une erreur est survenue lors de la connexion a la base de données");
				e.printStackTrace();
				
			}
	}
	


		//cette methode sers a compter le nombre de ligne presente dans la table
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
		  
		  //avec cette methode on selectionne pour afficher
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
	            
	            Object[][] tab = new Object[a][7];
	            
	            //on rentre les informations dans un tableau pour les renvoyer
	            while (rs.next()){
	            
	            		
	            		tab[i][0] = rs.getInt("nombre");
	            		tab[i][1] = rs.getInt("Etud");
	            		tab[i][2] = rs.getInt("Dix");
	            		tab[i][3] = rs.getInt("Navigo");
	            		tab[i][4] = rs.getInt("PleinTarif");
	            		tab[i][5] = rs.getString("film");
	            		tab[i][6] = rs.getString("date");
	            		
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

	

