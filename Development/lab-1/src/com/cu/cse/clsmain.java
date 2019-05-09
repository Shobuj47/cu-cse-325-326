package com.cu.cse;

public class clsmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student(0, "Tony Stark", 3.75);
		Student student2 = new Student();
		
		student2.setId(1);
		student2.setName("Thanos");
		student2.setCgpa(3.5);
		
		System.out.println("Id	| Name				| CGPA");
		System.out.println("------------------------------------------------------");
		System.out.println(student1.getId() + "	| " + student1.getName() + "			| " + student1.getCgpa());
		System.out.println(student2.getId() + "	| " + student2.getName() + "			| " + student2.getCgpa());
	}

}
