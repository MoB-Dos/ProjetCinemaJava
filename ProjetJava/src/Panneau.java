
public class Panneau {

	public static void main(String[] args) {
		
		BDDtest frite = new BDDtest();
		Object[][] data = null;
		
		data = frite.select();
		
		System.out.println(data[0][1]);
		
	}

}
   