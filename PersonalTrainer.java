import java.util.Date;

public class PersonalTrainer extends Staff {
	public WeeklyCalender weeklySchedule;
	

	public PersonalTrainer(String fn, String ln, Date dob, String email, Date startDate, Date endDate, double salary,
			String designation) {
		super(fn, ln, dob, email, startDate, endDate, salary, designation);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public void setSchedule() {
		//create weekly calender
	}

}
