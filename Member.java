import java.util.Date;

public class Member extends Person{
    
	private int type;
    private double fee;
    public static double discount;
    public WorkoutClass registeredClasses;
    public int months; 
    public WeeklyCalender weeklySchedule;
    
    
	public Member(String fn, String ln, Date dob, String email, Date startDate, Date endDate, int type, WorkoutClass registeredClasses) {
		super(fn, ln, dob, email, startDate, endDate);
		this.type=type;
		this.months = calculateMonths(startDate, endDate);
		this.fee = calculateFees(type, this.months);
	}

	
    public int calculateMonths(Date startDate, Date endDate) {
    	// to do
    	return 0;
    }

    
    public double calculateFees(int Type, int Months){
    	
    	// to do
    	
    	/*
    	 * if(Type == 1){
    	 * return ...* (2-months/12)*(1-discount)
    	 * } else{
    	 * return ...*/
    	return 0.0;
    }
    
    
    public double getFee(){
        return this.fee;
    }
    
    
    public String getType()
    {
        if(type == 1)
        {
            return "Student member";
        }
        else
        {
            return "Regular member";
        }
    }
    
    public void setType(int Type){
    	this.type = Type;
    	setFees( calculateFees(Type, months));
    }
    
    public void setFees(double fees){
    	this.fee = fees;
    }
    
    public void addSchedule() {
    	weeklySchedule.resetCalender(); // fills calendar with all false
    	
    };
}