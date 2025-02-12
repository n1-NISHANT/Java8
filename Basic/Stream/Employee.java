package Java8.Basic.Stream;


public class Employee{
  String name;
	int age;
	double salary;
	String country;
	
	public Employee(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
   public static void main(String[] args) {
		Employee emp1 = new Employee("Sohan", 25, 52000);
		Employee emp2 = new Employee("Mohan", 20, 20000);
		Employee emp3 = new Employee("Gautam", 27, 58000);
		Employee emp4 = new Employee("Anil", 28, 12000);
		Employee emp5 = new Employee("Ankit", 18, 58000);
		Employee emp6 = new Employee("Ankita", 21, 60000);
		Employee emp7 = new Employee("Salendra", 40, 90000);
  
}
