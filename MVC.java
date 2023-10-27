public class MVC
{
	public static void main(String[] args)
    {
		Employee model = retrieveEmployeeFromDatabase();
		EmployeeView view = new EmployeeView();
		
		EmployeeController controller = new EmployeeController( model, view );
                controller.updateView();
		
		int newSal = (int) (controller.getEmployeeSalary() * 1.10);
		controller.setEmployeeSalary( newSal );
		controller.updateView();
	}
	
	public static Employee retrieveEmployeeFromDatabase()
    {
		Employee s1 = new Employee();
		s1.setId(1012349);
		s1.setName("Ayushman Khurana");
		s1.setSalary(150000);
		return(s1);
	}
}

class Employee {
	private int id;
	private String name;
	private int salary;
	
	public int getId()
    {
		return id;
	}
	
	public void setId( int id)
    {
		this.id=id;
	}
	
	public String getName()
    {
		return name;
	}
	
	public void setName( String name)
    {
		this.name=name;
	}
	
	public int getSalary()
    {
		return salary;
	}
	
	public void setSalary( int salary)
    {
		this.salary=salary;
	}	
}

class EmployeeView
{
	public void printEmployeeDetails(int id, String name, int salary) {
		System.out.println("Id: " + id + " | Name: " + name + " | Salary: " + salary);
	}
}

class EmployeeController
{
    Employee model;
    EmployeeView view;
    EmployeeController(Employee model,EmployeeView view)
    {
        this.model=model;
        this.view=view;
    }
    void updateView()
    {
        view.printEmployeeDetails(model.getId(),model.getName(),model.getSalary());
    }
    int getEmployeeSalary()
    {
        return model.getSalary();
    }
    void setEmployeeSalary(int salary)
    {
        model.setSalary(salary);
    }
}