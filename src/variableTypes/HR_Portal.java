package variableTypes;

public class HR_Portal {

	public static void main(String[] args) {
	Employee Ram=new Employee();
	Ram.emp_name="Ram";
	Ram.emp_id="TM1454";
	Ram.emp_desg="QA";
	Ram.emp_age=25;
	Ram.emp_gender='M';
	Ram.emp_sal=1250000.45f;
	
	
	
	Employee Rahul=new Employee();
    Rahul.emp_name="Rahul";
    Rahul.emp_id="Infoysis454";
	Rahul.emp_desg="Manger";
	Rahul.emp_age=35;
	Rahul.emp_gender='M';
	Rahul.emp_sal=14450000.45f;
	 
	Ram.emp_info();
	Rahul.emp_info();

	}

}
