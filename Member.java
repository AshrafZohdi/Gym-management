import java.time.*;
import java.util.Date;

public class Member extends Person{
    
	private int type;
    private double fee;
    public static double oneMonthRate   = 100;
    public static double threeMonthRate = 95;
    public static double sixMonthRate   = 90;
    public static double yearlyRate     = 80;
    public static double studentDiscount =0.9;//for now.(10%)
    public double discount;
    public WorkoutClass[] registeredClasses;
    public int months; 
    public WeeklyCalender memberSchedule;
   // public int[][] filledSlotsIndex;
    
    
	public Member(String fn, String ln, Date dob, String email, LocalDate startDate, LocalDate endDate, int type, WorkoutClass registeredClasses, WeeklyCalender memberSchedule, int months) {
		super(fn, ln, dob, email, startDate, endDate);
		this.type = type;
		this.months = months;
		this.fee = calculateFees(type, this.months);
		this.memberSchedule.resetCalender();//set all slots to false
	}
	
	public Member(String fn, String ln, Date dob, String email, LocalDate startDate, int type, WorkoutClass registeredClasses, WeeklyCalender memberSchedule, int months) {
		super(fn, ln, dob, email);
		super.setStartDate(startDate);
		LocalDate endDate = startDate.plusMonths(Integer.toUnsignedLong(months));//can throw InputMismatchException and if a negative is given it is converted to a large number making it apparent but not throwing an error
		this.type = type;
		this.months = months;
		this.fee = calculateFees(type, this.months);
		this.memberSchedule.resetCalender();//set all slots to false
	}
	
	public Member(String fn, String ln, Date dob, String email, int type, WorkoutClass registeredClasses, WeeklyCalender memberSchedule, int months) {
		super(fn, ln, dob, email);
		super.setStartDate(startDate);
		this.type = type;
		this.months = months;
		this.fee = calculateFees(type, this.months);
		this.memberSchedule.resetCalender();//set all slots to false
	}

	
   /* public int calculateMonths(Date startDate, Date endDate) {
    	
    	startDate = new Date();
    	LocalDate localDate1 = startDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    	int startMonth = localDate2.getMonthValue()
    	
    	endDate = new Date();
    	LocalDate localDate2 = endDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    	int endMonth = localDate2.getMonthValue()

    	return endMonth - startMonth;
    }
*/
    
    public double calculateFees(int Type, int Months)
    {
    	
    	if (type == 1)
    	{
    		if(months == 3){
    			return months*threeMonthRate*studentDiscount;}
    		
    		else if(months == 6){
    			return months*sixMonthRate*studentDiscount;}
    		
    		else if(months == 12){
    			return months*yearlyRate*studentDiscount;}
    		
    		else{	
    			return months*oneMonthRate*studentDiscount;}
    	}
    	
    	/*
    	 * use this.type and this.months and this.discount
    	 * if(Type == 1){
    	 * return ...* (2-months/12)*(1-discount)
    	 * } else{
    	 * return ...*/
    	return 0.0;
    	else
    	{
    		if(months == 3){
    			return months*threeMonthRate;}
    		
    		else if(months == 6){
    			return months*sixMonthRate;}
    		
    		else if(months == 12){
    			return months*yearlyRate;}
    		
    		else {	
    			return months*oneMonthRate;}
    	}
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
    				if(this.registeredClasses[numClasses].weeklySchedule[columns][rows] ) {//checks if this WorkoutCourse.workoutSchedule slot has a true in it and if so,
    					this.memberSchedule.WeeklySchedule[columns][rows]=true;           // adds true to the corresponding Member.memberSchedule.WeeklySchedule cell
    			
    				}
    				
    			}	
    		}	
    	}	
    }
    	
}