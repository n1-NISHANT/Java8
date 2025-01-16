package Java8.Basic.Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Person{
	String name;
	int age;
	
	public Person(String name,int age ) {
		this.name = name;
		this.age = age;
	}
}
public class AgeVerification {
	public static void main(String[] args) {
		Person p1 = new Person("Sahil",25);
		Person p2 = new Person("Salandra",12);
		Person p3 = new Person("Anikate",18);
		Person p4 = new Person("Gautam",10);
		Person p5 = new Person("Viveak",33);
		
		List<Person> L1 =   Arrays.asList(p1,p2,p3,p4,p5);
		
		   Predicate<Person> p  =  person -> person.age>=18;
		   
		   for(Person person : L1) {
			   if(p.test(person)== true) {
				   System.out.println(person.name);
				   
			   }
		   }
	}
}

