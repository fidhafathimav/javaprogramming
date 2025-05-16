package project1;
import java.util.*;
class Employee{
	int eNo,eSalary;
	String eName;
	public Employee() {}
	public Employee(int no,int sal,String name) {
		eNo=no;
		eSalary=sal;
		eName=name;
	}
	public void showdata() {
		System.out.println("EmpId="+eNo+"Name="+eName+"Salary="+eSalary);
		
	}
	
}

public class EmprArrobjects {
	public static void main(String[]args) {
		int eid,esal,i;
		String ename;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of employees:");
		int n=s.nextInt();
		Employee employees[]=new Employee[n];
		System.out.println("enter employee details one by one");
		for(i=0;i<n;i++) {
			System.out.println("enter"+(i+1)+"employee details (id name salary):");
			eid=s.nextInt();
			ename=s.next();
			esal=s.nextInt();
			employees[i]=new Employee(eid,esal,ename);
			
		}
		System.out.println("\nEmployees are:");
		for(Employee emp:employees) emp.showdata();
		System.out.println("\nenter employee nuber to search:");
		int semp=s.nextInt();
		boolean found=false;
		for(Employee e:employees) {
			if(semp==e.eNo) {
				found=true;
				System.out.println("Employee found:");
				e.showdata();
				break;
			}
		}
	
	if(!found)
		System.out.println("Employee not found");
	
	}

}
