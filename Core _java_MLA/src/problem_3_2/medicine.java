package problem_3_2;



public class medicine{
	public void displayLabel(){System.out.println("Company : PHARANDE Pharma");
	System.out.println("Address : SATARA");
	}
	}
class Tablet extends medicine{
	 
public void displayLabel(){
	System.out.println("store in a cool dry place");
	}
}
class Syrup extends medicine{
	public void displayLabel(){System.out.println("Consumption as directed by thephysician");
	}
	}
class Ointment extends medicine{
	public void displayLabel(){
		System.out.println("for external use only");
		}
	}