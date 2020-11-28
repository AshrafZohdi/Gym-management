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
    public List<int[]> filledSlotsIndex = new ArrayList<int[]>(); // {[1,0], [1,1], ...} has the addresses that contain true
	
    public WorkoutClass(List<int[]> index, String className, String description, LocalDate startDate, LocalDate endDate,
			Coach coach) {
    	updateClassSchedule(index);
    	copyList(index, this.filledSlotsIndex);
		this.className = className;
		this.description = description;
		this.startDate = startDate;
		this.endDate = endDate;
		this.coach = coach;
	}
    
    /*
     * function to copy the index from the constructor to filled slot index
     */
    
    public void copyList(List<int[]> copyThis, List<int[]> emptyList) {

    	for(int[] element: copyThis) {
    		emptyList.add(element);
    	}
    }
    

    public void resetCalender() {
    	for (int columns = 0; columns < 7 ; columns++) {
    		for (int rows = 0; rows < 72; rows++) {
    			this.weeklySchedule[columns][rows] = false;
    		}
    	}
    }
    
    public void updateClassSchedule(List<int[]> index){
    	resetCalender();
    	for (int[] address : index) {
    		this.weeklySchedule[address[0]][address[1]] = true;
    	}
    }
    
}