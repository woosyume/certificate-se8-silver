package ex3_22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee>{
	private String deptNo;
	private String empName;
	public Employee(String no, String name) {
		deptNo = no;
		empName = name;
	}
	@Override
	public int compareTo(Employee emp) {
		System.out.println("comparing!");
		int check = deptNo.compareTo(emp.deptNo);
		System.out.println(deptNo + " " + emp.deptNo);
		System.out.println(check);
		if(check != 0) {
			return check;
		}else {
			return empName.compareTo(emp.empName);
		}
	}
	
	public String toString() {
		return deptNo + empName;
	}
	
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee("1", "Tiger"));
		list.add(new Employee("2", "Mustang"));
		list.add(new Employee("1", "Dolphin"));
		Collections.sort(list);
		System.out.println(list);
		
	}
	
}
