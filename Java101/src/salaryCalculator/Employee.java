package salaryCalculator;

// A class called "Employee" that represents factory workers and calculates employee salaries with its methods
public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    // constructor method
    public Employee(String name, double salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax(){
        if(salary > 1000){
            return  (salary * 0.03);
        }
        else{
            return 0;
        }
    }
    public double bonus(){
        if(workHours > 40){
            return (workHours - 40) * 30;
        }
        else{
            return 0;
        }
    }

    public double raiseSalary(){
        if((2021 - hireYear) < 10){
            return salary * 0.05;
        }
        else if((2021 - hireYear) > 9 && (2021 - hireYear) <20){
            return salary * 0.1;
        }
        else{
            return salary * 0.15;
        }
    }

    public String toString() {
        return "Name: " + name + "\nSalary: " + salary + "\nWork Hours: " + workHours + "\nStart Year: " + hireYear + "\nTax: " + tax() + "\nBonus: " + bonus() + "\nSalary Increase: " + raiseSalary() + "\nSalary with Taxes and Bonuses: " + (salary - tax() + bonus()) + "\nTotal Salary : " + (salary - tax() + bonus() + raiseSalary());
    }
}
