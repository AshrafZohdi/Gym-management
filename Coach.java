import java.time.LocalDate;
import java.util.Date;

public class Coach extends Staff {
	public WorkoutClass[] courses;

	public Coach(String fn, String ln, Date dob, String email, LocalDate startDate, LocalDate endDate, String designation, double salary, WorkoutClass[] courses) {
		super(fn, ln, dob, email, startDate, endDate, salary, designation);
		this.courses = courses;

	}
	
	

//	@Override
	//public double calculateSalary() {
		//to do 
	//	return 0.0;

	}

