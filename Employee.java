package com.workspace.agila;

import java.util.Scanner;

public class Employee {
	private double salary;
	private int num_of_wrkhrs;
	public void getInfo(double salary, int num_of_wrkhrs) {
		System.out.println("An Employee earns " +salary+ " working for " +num_of_wrkhrs+ " hours per day");
	}
	public double AddSal() {	
		double lesssal=salary;
		while(salary<1500.3) {
			lesssal = salary + 1000;
		}
		return lesssal;
	}
	public double AddWork() {
		double morewrk=salary;
		while(num_of_wrkhrs>6) {
			morewrk = salary + 500;
		}
		return morewrk;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Salary: ");
		double salary=sc.nextDouble();
		System.out.println("num+of+wrkhrs: ");
		int num_of_wrkhrs=sc.nextInt();
		Employee emp = new Employee();
		emp.getInfo(salary,num_of_wrkhrs);
		for(int i=0;i<=salary;i++) {
			if(salary<1500.3) {
				System.out.println("Final Salary: "+emp.AddSal());
				break;
			}
			for(int j=0;j<=num_of_wrkhrs;j++) {
				if(num_of_wrkhrs>6) {
					System.out.println("Final Salary: "+emp.AddWork());
				}
			}
			
		}
		
		}

}
