package day8;

import java.util.Random;

public class EmployeeWage {

		int isPresent;
		int workingHour = 0;
		int totalWorkingDays = 20;
		int perHourWage = 20;
		float totalWage = 0;
		
		
		public static void main(String[] args) {
			System.out.println("Welcome to Employee Wage Computation System");
			EmployeeWage emp=new EmployeeWage();
			emp.empMonthlyWage();
		}	
		
		public void empMonthlyWage() {
			Random random = new Random();
			for(int i=1;i<=20;i++) {
				
				isPresent = random.nextInt(3);
				if(isPresent == 0) {
					System.out.println("Employee is Absent");
					workingHour = 0;
				}
				else if(isPresent == 1) {
					System.out.println("Employee is Present and Full Time");
					workingHour = 8;
				}
				else if(isPresent == 2) {
					System.out.println("Employee is Present and Part Time");
					workingHour = 8;
				}
				
				int empDailyWage = perHourWage * workingHour;
				totalWage = totalWage + empDailyWage;
			}
			
			System.out.println("Employee Monthly Wage is : "+totalWage);
		}
	}