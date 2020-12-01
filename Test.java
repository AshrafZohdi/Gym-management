import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Date;

public class Test{
    public static void main(String[] args){
    	
    	LocalDate Date1 = LocalDate.parse("2019-12-31");//this is how you create a local date
		WorkoutClass[] aliGClasses = new WorkoutClass[3]; 
		/*
		 * each coach can have a max of 3 classes? we must instantiate this variable before making
		 * the coach and we cannot fill it until we make the workout class but we cant make the workout 
		 * class until we make the coach... it's a chicken and egg problem
		*/
		Coach aliG = new Coach("Ali", "G", LocalDate.parse("2095-12-31"), "alig@gmail.com", LocalDate.parse("2019-12-31"), LocalDate.parse("2020-12-31"), "yoga instructor", 500.0, aliGClasses);
		
		int monday[]= {0,1};
		int[] tuesday = {1, 5};
		int[] wednesday = {2, 6};
		List<int[]> yogaSchedIndex = new ArrayList<int[]>();
		boolean b = Collections.addAll(yogaSchedIndex, monday, tuesday, wednesday);

		
		WorkoutClass yogaClass = new WorkoutClass(yogaSchedIndex, "Biceb Workout","Get dem guns",LocalDate.parse("2019-12-31"), LocalDate.parse("2020-06-20"),aliG);
		//WorkoutClass[] M1Classes = new WorkoutClass[10];
		WeeklyCalender M1Schedule = new WeeklyCalender(new boolean[7][72]);
		
		Member M1 = new Member("John", "Smith", LocalDate.parse("2019-12-31"), "johnSmith@email.com", LocalDate.parse("2019-12-31"), LocalDate.parse("2019-12-31"), 0, 3);		
		Member M2 = new Member("John", "Smith", LocalDate.parse("2019-12-31"), "johnSmith@email.com", LocalDate.parse("2019-12-31"), LocalDate.parse("2019-12-31"), 0, 3);
		Member M3 = new Member("John", "Smith", LocalDate.parse("2019-12-31"), "johnSmith@email.com", LocalDate.parse("2019-12-31"), LocalDate.parse("2019-12-31"), 0, 3);
		
		yogaClass.courseMembers.add(M1);
		
		
		
		
		
		/*
		 *  //to do
		 *  test all the methods of member 
		 *  create data system and GUI (swift or simple textIO/BufferReader) in main
		 *  	methods to create and update members/staff/classes from user input and save the data in text files
		 *  add the personal trainer class if time allows
		 */
		
		
		/*
		 * http://www.groupkt.com/post/2f40241c/java---how-to-create-and-initialize-a-list-arraylist-in-efficient-way.htm 
		 * 
		 *    List<int[]> innerClass = new ArrayList<int[]>() {{
		 *    	 int[] a = {0,1};
		 *    	 add(a);
		 *    }};
		 *    int[] a = {0,0};
		 *    List<int[]> useCollections = new ArrayList<int[]>();
		 *    boolean b = Collections.addAll(useCollections,a); // returns true if the list changed as a result of the operation
		 *    
		 *    https://www.tutorialspoint.com/java/util/collections_addall.htm
		 * 
		 */
    }
     
        
}