package Java8.Basic.Lambda;
import java.util.Arrays;
import java.util.List;

class EmployeeDetails{
  String name;
	String location;
	int sal;
  
    public EmployeeDetails(String name,String location,int sal) {
		this.name = name;
		this.location = location;
		this.sal = sal;
	}
}
public class Employee{
public static void main(String [] args){
	EmployeeDetails emp1 = new EmployeeDetails("Raju","pune",50000);
	EmployeeDetails emp2 = new EmployeeDetails("Sohan","Delhi",20000);
	EmployeeDetails emp3 = new EmployeeDetails("Prakash","Gurugram",75000);
	EmployeeDetails emp4 = new EmployeeDetails("Vivek","Delhi",100000);
	EmployeeDetails emp5 = new EmployeeDetails("Sandeep","puna",20000);

	 List<EmpDetails> L1 = Arrays.asList(emp1,emp2,emp3,emp4,emp5);
  
}
}
