package practice;

import java.util.Optional;

class abc
{
	int age;
	String name;
	String city;
	
	
	public abc(int age, String name, String city) {
		super();
		this.age = age;
		this.name = name;
		this.city = city;
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
		return "abc [age=" + age + ", name=" + name + ", city=" + city + "]";
	}
	
}


public class OptionalClass1 
{
	public static void main(String args[])
	{
		//abc x=new abc(12,null,"Jamshedpur");
		String msg=null;
		Optional<String> ap= Optional.ofNullable(msg);
		System.out.println(ap.isPresent());
		System.out.println(ap.orElse("no value found")); // if false return the message
		System.out.println(ap.orElseGet(()->"no value is present here")); //if false return the message using lambda expression
		System.out.println(ap.orElseThrow(()->new IllegalArgumentException("illegal arguement exception")));
	}
}
