import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Date;

public class main
{
    public static void main(String[] args)
    {
    	Date Date1 = new Date (2014,02,03);
    	
    	int array[]= {0,1};
    	List<int[]> Class1List = new ArrayList<int[]>();
    	Class1List.add(array);
    	
    	WorkoutClass Class1 = new WorkoutClass(Class1List, "Biceb Workout","Get dem guns",01/05/2018,01/07/2018);
    	
    	Coach Class1Coach = new Coach("Marques","Brownlee",12/06/1984,"MarquessBrownlee@email.com",01/01/2007,02/03/2007,"Swag",2001);
    	
    	Member M1 = new Member("John","Smith",01/08/1974,"johnSmith@email.com",12/03/2019,12/05/2019,0,2,7,3);
        System.out.println(M1);
    	
        Member M2 = new Member("Mark","Cena",19/5/1999,"MarkCena@email.com",11/06/2018,1,1,3,3);
        System.out.println(M2);

        Member M3 = new Member("Louis","Collins",22/02/2001,"LouisCollins@email.com",1,5,3,1);
        System.out.println(M3);
        
    	List<int[]> innerClass = new ArrayList<int[]>() {{
        	int[] a = {0,1};
        	add(a);
    	}};
    	
    	int[] a = {0,0};
    	List<int[]> useCollections = new ArrayList<int[]>();
    	Collections.addAll(useCollections,a);
    	/*
    	 * http://www.groupkt.com/post/2f40241c/java---how-to-create-and-initialize-a-list-arraylist-in-efficient-way.htm 
    	 */
    }
        
}