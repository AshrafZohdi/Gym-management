import java.util.Date;

public class Coach extends Staff {

	public Coach(String fn, String ln, Date dob, String email, Date startDate, Date endDate, String designation, double salary) {
		super(fn, ln, dob, email, startDate, endDate, salary, designation);

	}

	@Override
	public double calculateSalary() {
		return 0.0;

	}

}
