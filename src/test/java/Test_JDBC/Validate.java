package Test_JDBC;

public class Validate {

	public int Validate_DB() {
		// TODO Auto-generated method stub
		
		 FlyClass flyaway = new FlyClass();
		 FlyJDBC jdbc = new FlyJDBC();
		 
		 String[] exp_details = flyaway.exp_details();
		 String[] act_details = jdbc.Jdbc();
		 int ret =0;
		 System.out.println("printing act_details and exp_details");
		 for (int i = 0; i < act_details.length; i++) {
			 System.out.println(act_details[i]);
			 System.out.println(exp_details[i]);
			 
			 if (exp_details[i].contains(act_details[i])) {
				 System.out.println("Details are Validated");
				 ret=1;
				
			}else {
				System.out.println("Details are not Validated");
			}
		}
		return ret;		 
	}
	
	public int Validating_Table() {
		FlyClass flyaway = new FlyClass();
		int login_SearchFlight_Validate = flyaway.Login_SearchFlight_Validate();
		return login_SearchFlight_Validate;
	}
	
	public int BookShowValidate() {
		FlyClass flyaway = new FlyClass();
		int book_Show_and_Validate = flyaway.Book_Show_and_Validate();
		return book_Show_and_Validate;	
	}
}