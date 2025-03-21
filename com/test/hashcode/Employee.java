package com.test.hashcode;

import java.util.HashSet;
import java.util.Objects;

public class Employee 
{
	private int id;
	private String name;
	private String dept;
	private int grade;
	
	public Employee(int id, String name, String dept, int grade)
	{
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.grade = grade;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public int getId()
	{
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", grade=" + grade + "]";
	}

//	@Override
//	public int hashCode()
//	{
//		return Objects.hash(id, name, dept, grade);
//	}
//
//	@Override
//	public boolean equals(Object obj)
//	{
//		if(obj == null  || getClass() != obj.getClass())
//		{
//			return false;
//		}
//		if(this ==  obj)
//		{
//			return true;
//		}
//		Employee emp = (Employee) obj;
//		return id == emp.getId() && Objects.equals(name, emp.getName()) && Objects.equals(dept, emp.getDept())
//				&& grade == emp.getGrade();
//	}


	@Override
	public boolean equals(Object o)
	{
		/*if (o == null || getClass() != o.getClass())
			return false;
		Employee employee = (Employee) o;
		return id == employee.id && grade == employee.grade && Objects.equals(name, employee.name) && Objects.equals(dept, employee.dept);*/
		return true;
		//return false;
	}

	@Override
	public int hashCode()
	{
		//return Objects.hash(id, name, dept, grade);
		return 1;


	}

	public static void main(String[] args) {
		Employee e1 = new Employee(31, "John", "IT", 4);
		Employee e2 = new Employee(31, "John", "IT", 4);
		Employee e3 = new Employee(31, "John", "IT", 4);
		Employee e4 = new Employee(31, "John", "IT", 4);

		HashSet<Employee> set = new HashSet<>();
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);

		set.stream()
				.forEach(System.out :: println);
	}
}
