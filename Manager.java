import java.util.*;
class Employee
{
  public String EmpName;
  public double EmpSalary;
  public int JoinYear,JoinDate,JoinMounth;

  public Employee(String name,double salary,int year,int mounth,int date)
  {
    EmpName = name;
    EmpSalary = salary;
    JoinYear = year;
    JoinMounth = mounth;
    JoinDate = date;
  }

  public String getname()
  {
    return EmpName;
  }

  public double getSalary()
  {
    return EmpSalary;
  }

  public Date getHiredate()
  {
    Date d = new Date(JoinDate,JoinMounth,JoinYear);
    return (d);
  }

  public void raiseSalary(double byPercent)
  {
    EmpSalary = (EmpSalary*byPercent)/100;
  }
}
class Manager extends Employee
{
  public Manager(String name,double salary,int year,int mounth,int date){
    super(name,salary,year,mounth,date);
  }
  public double setBonus(double Salary)
  {
    double bonus = (Salary*10)/100;
    return bonus;
  }

  public double getSalary(){
    return(getSalary() + setBonus(getSalary()));
  }

  public static void main(String arg[]){
    Manager e1 = new Manager("ramesh",100000,2016,02,27);
    Manager e2 = new Manager("suresh",150000,2014,05,15);
    System.out.println(e1.getSalary());
    System.out.println(e2.getSalary());
  }
}
