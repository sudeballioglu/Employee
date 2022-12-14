package SalaryCalculator;


public class Employee {

	String name;
	int salary;
	int workHours;
	int hireYear;
	double tax;
	double bonus;
	double salaryIncrease;
	
	
	
	
	Employee(String name, int salary, int workHours, int hireYear){
		this.name=name;
		this.salary=salary;
		this.workHours=workHours;
		this.hireYear=hireYear;
	}
	
	
	double tax() {
		if(this.salary<1000) {
			System.out.println("Tax is not applied.");
			this.tax=0;
		}else {
			this.tax=this.salary*0.03;
		}
		return tax;
	}
	
	double bonus() {
		if(workHours>40) {
			this.bonus=(workHours-40)*30;
		}else {
			System.out.println("No overtime.");
			this.bonus=0;
		}
		return this.bonus;
	}
	
	double raiseSalary() {
		int year= 2021-this.hireYear;
		double totalRaise=0;
		if(year<=9) {
			totalRaise=this.salary*0.05;
		}else if (year<=19){
			totalRaise=this.salary*0.10;
		}else if(year>=20){
			totalRaise=this.salary*0.15;
		}
		return totalRaise;
	}
	
	void print() {
		System.out.println("Adı: " + this.name);
		System.out.println("Maaşı: " + this.salary);
		System.out.println("Çalışma saati: " + this.workHours) ;
		System.out.println("Başlangıç yılı: " + this.hireYear);
		System.out.println("Vergi: " + this.tax());
		System.out.println("Bonus: " + this.bonus());
		System.out.println("Maaş artışı: " + this.raiseSalary());
		System.out.println("Vergi ve Bonuslar ile birlikte maaş: " + (salary+(this.bonus-this.tax)));
		System.out.println("Toplam maaş: " + (this.salary+this.raiseSalary()));
	}
}
