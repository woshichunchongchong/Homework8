package CollectionClass;

import java.util.*;

public class two {
	public static void main (String[] args) {
		
		Set<Student> set=new TreeSet<Student>(new PersonComparator());
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			Student s = new Student();
			s.setId(sc.next());
			if(s.getId().equals("exit")) {
				break;
			}
			s.setName(sc.next());
			s.setAge(sc.nextInt());
			set.add(s);
		}
		for(Iterator<Student> iterator = set.iterator();iterator.hasNext();){
			System.out.print(iterator.next().getId()+" "+iterator.next().getName()+" "+iterator.next().getAge());
		}

	}
}

class PersonComparator implements Comparator<Student>{
	 
	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.getAge() - o2.getAge();
	}
	
}

class Student {
	private String id, name;
	private int age;

	public Student(String id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public Student() {
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}