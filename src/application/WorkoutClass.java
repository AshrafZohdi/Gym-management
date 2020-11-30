package application;
import java.util.Date;

public class WorkoutClass{
	public boolean[][] weeklySchedule = new boolean[7][72];
	public Member[] courseMembers;
    public String className;
    public String description;
    public Date startDate;
    public Date endDate;
    public Coach coach;
    public int[][] filledSlotsIndex; 
	
    public WorkoutClass(int[][] index, String className, String description, Date startDate, Date endDate,
			Coach coach) {
    	resetCalender();
    	fillClassSchedule(index);
		this.className = className;
		this.description = description;
		this.startDate = startDate;
		this.endDate = endDate;
		this.coach = coach;
	}
    
    

    public void resetCalender() {
    	for (int columns = 0; columns < 7 ; columns++) {
    		for (int rows = 0; rows < 72; rows++) {
    			this.weeklySchedule[columns][rows] = false;
    		}
    	}
    }
    
    public void fillClassSchedule(int[][] index){
    	// fills the weeklySchedule using an index
    }
    
}