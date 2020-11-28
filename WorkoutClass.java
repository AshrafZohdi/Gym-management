import java.time.*;
import java.util.*;

public class WorkoutClass{
	public boolean[][] weeklySchedule = new boolean[7][72];
	public Member[] courseMembers;
    public String className;
    public String description;
    public LocalDate startDate;
    public LocalDate endDate;
    public Coach coach;
    //public int[][] filledSlotsIndex;
    // {[1,0], [1,1], ...}
    List<int[]> filledSlotsIndex = new ArrayList<int[]>();
	
    public WorkoutClass(List<int[]> index, String className, String description, LocalDate startDate, LocalDate endDate,
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
    
    public void fillClassSchedule(List<int[]> index){
    	for (int[] address : index) {
    		this.weeklySchedule[address[0]][address[1]] = true;
    	}
    }
    
}