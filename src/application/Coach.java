package application;
<<<<<<< Updated upstream
=======
import java.time.LocalDate;
import java.util.Arrays;
>>>>>>> Stashed changes
import java.util.Date;

public class Coach extends Staff {

	public Coach(String fn, String ln, Date dob, String email, Date startDate, Date endDate, String designation, double salary) {
		super(fn, ln, dob, email, startDate, endDate, salary, designation);

	}
	
<<<<<<< Updated upstream
=======
	/*
	 *   // to do
	 * add method to add/remove a workout class to courses by class name
	 */
	
	public void removeCourse(String courseName) {
		boolean courseFound = false;
		for (int index = 0; index< this.courses.length; index++ ) {
			if(courses[index].className.equals(courseName)) {
				courseFound = true;
				removeArrayElement(index, courses);
			}
		}
		if(!courseFound) {
			System.out.println("Course not found!");
		}
	}
>>>>>>> Stashed changes
	
	public WorkoutClass[] removeArrayElement(int index, WorkoutClass[] courses) throws IndexOutOfBoundsException {
		// if array is empty or index is out of bounds, removal is not possible 
        if (courses == null
          || index < 0
          || index >= courses.length) { 

          System.out.println("No removal operation can be performed!!");
          throw new IndexOutOfBoundsException();
          
      } 
      // Create a proxy array of size one less than original array
      WorkoutClass[] proxyArray = new WorkoutClass[courses.length - 1]; 

      // copy all the elements in the original to proxy array except the one at index 
      for (int i = 0, k = 0; i < courses.length; i++) { 

          // check if index is crossed, continue without copying 
          if (i == index) { 
              continue; 
          } 

          // else copy the element
          proxyArray[k++] = courses[i]; 
      } 

     // Print the copied proxy array 
     System.out.println("Array after removal operation: " + Arrays.toString(proxyArray)); 
     return proxyArray;
  
	
	} 

}
	


	@Override
	public double calculateSalary() {
		//to do 
		return 0.0;


}
