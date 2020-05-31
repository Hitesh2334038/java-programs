package myclass;

public class Student {
	String name;
	int id;
	
	Student(String name,int i)
	{
		this.name=name;
		this.id=i;
	}
	public static void main(String[] args) {
		
		Student s=new Student("Hitesh",2);
		System.out.println("Name is : "+s.name+"\n"+
				"Id is : "+s.id);
		
	}

}
