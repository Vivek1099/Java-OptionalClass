package practice;

import java.util.Optional;

class employee
{
	int id;
	int age;
	String name;
	String city;
	
	//constructor
	public employee(int id, int age, String name, String city) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
		this.city = city;
	}
	
	//getter and setter
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "employee [id=" + id + ", age=" + age + ", name=" + name + ", city=" + city + "]";
	}
	
	
}


public class OptionalClass 
{
	public static void main(String args[])
	{
		//object of class employee.
		employee e=new employee(1,23,"Vivek Sawaiyan","Jamshedpur");
		
		//putting object of a class into an optional class.
		Optional<employee> op = Optional.of(e);
		
	    System.out.println(op); //print values with return type optional class
		System.out.println(op.isPresent()); //to check whether null or empty
		System.out.println(op.isEmpty());   //to check whether null or empty
		System.out.println(op.get()); //getting the object of employee and display
		System.out.println(op.get().name);
	}
}
