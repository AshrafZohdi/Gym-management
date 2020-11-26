import java.util.Date;

public class Member extends Person{
    
	private int type;
    private double fee;
    public static double discount;
    public WorkoutClass[] registeredClasses;
    public int months; 
    public WeeklyCalender memberSchedule;
   // public int[][] filledSlotsIndex;
    
    
	public Member(String fn, String ln, Date dob, String email, Date startDate, Date endDate, int type, WorkoutClass registeredClasses, WeeklyCalender memberSchedule) {
		super(fn, ln, dob, email, startDate, endDate);
		this.type=type;
		this.months = calculateMonths(startDate, endDate);
		this.fee = calculateFees(type, this.months);
		this.memberSchedule.resetCalender();//set all slots to false
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
    
    public void addCLassesToSchedule() {
    	//add exception if schedule is already filled
    	for(int numClasses = 0; numClasses < this.registeredClasses.length ;numClasses++) { //loop through classes in resgisteredClasses[] array
    		for (int columns = 0; columns < 7 ; columns++) {                            //loop through columns for each WorkoutCourse.weeklySchedule in the ^ array
    			for (int rows = 0; rows < 72; rows++) {                                 //loop through the rows (times)
    				if(this.registeredClasses[numClasses].weeklySchedule[columns][rows] || !this.memberSchedule.WeeklySchedule[columns][rows]  ) {//checks if this WorkoutCourse.workoutSchedule slot has a true in it and if so,
    					this.memberSchedule.WeeklySchedule[columns][rows]=true;           // adds true to the corresponding Member.memberSchedule.WeeklySchedule cell
    			
    				}
    				
    			}	
    		}	
    	}	
    }
    	
}