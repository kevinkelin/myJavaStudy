package studyJava2;
//import studyJava2.testoob;

class Person{
	private String name = "kevin";
	private int age = 25;
	public void setName(String name){
		this.name = name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public String getInfo(){
		return "my name is " + this.name +"\n" + "my age is " + this.age;
	}
}

class Student extends Person{
	private String school;
	public void setSch(String school){
		this.school = school;
	}
	public String getInfo(){
		return "my name is " + getName() +"\n" + "my age is " + getAge() + "\n"+
				"my school is " + school;
	}
	
}


public class TestSon {
	public static void main(String[] args){
		Person person = new Person();
		System.out.println(person.getInfo());
		Student student = new Student();
		student.setName("yangyanxing");
		student.setAge(24);
		student.setSch("bjut");
		System.out.println(student.getInfo());
	}
	
	
}
