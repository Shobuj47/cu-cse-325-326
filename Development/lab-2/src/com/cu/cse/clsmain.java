package com.cu.cse;

public class clsmain {

	public static void main(String[] args) {
		employee employee1 = new employee(0, "Jhon", 5000000) ;
		
		employee employee2 = new employee();
		employee2.setId(1);
		employee2.setName("Wick");
		employee2.setSalary(35000.50);
		
		System.out.println("Id	| Name				| $alary");
		System.out.println("------------------------------------------------------");
		System.out.println(employee1.getId() + "	| " + employee1.getName() + "				| " + employee1.getSalary());
		System.out.println(employee2.getId() + "	| " + employee2.getName() + "				| " + employee2.getSalary());
	}

}
