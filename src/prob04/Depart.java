package prob04;

public class Depart extends Employee{

	private String department;
	
	
	public Depart(String name, int sal, String dept) {
		super();
		//상속받은 부모 클래스에 전달 받은 인자를 넣아야 한다.
		super.setName(name);	
		super.setSalary(sal);
		////////////////////////////////////////////////
		this.department  = dept;	
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	public void getInformation() {
		
		//getInformation();
		
		System.out.println("이름 : " + super.getName() + "  연봉 : " + super.getSalary() +
		"  부서 :" + department);

	}
	
	

}
