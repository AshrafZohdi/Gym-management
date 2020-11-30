package application;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Date;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;


public class Main extends Application {
	
	/*
	 * //Creating Text Filed for email        
	 * TextField textField1 = new TextField();    
	 */
	
	@Override
	public void start(Stage primaryStage) {
		try {
			//creating Texts and Buttons
			Text homeText = new Text("Gym Manager Home Page");
			Button newMember = new Button("Create New Member");
			Button newStaf = new Button("Create New Staff");
			Button newClass = new Button("Create New Class");
			Button newCoach = new Button("Create New Coach");
			Button memberView = new Button("Member View");
			Button staffView = new Button("Staff View");
			
			//BorderPane root = new BorderPane();
			GridPane homePage = new GridPane(); // creating a kind of layout called gridPane which is like a grid...
			
		    //Setting size for the pane  
			homePage.setMinSize(400, 400);
			homePage.setPadding(new Insets(10, 10, 10, 10));//insets is a padding object (double top, right, bottom, left)
		    //Setting the vertical and horizontal gaps between the columns 
		    homePage.setVgap(5); 
		    homePage.setHgap(5);
		    //Setting the Grid alignment 
		    homePage.setAlignment(Pos.CENTER);
		    
		    //adding the nodes to the grid
		    
		    
			
		    //Creating a scene object where we will put our layout
			Scene homeScene = new Scene(homePage,400,400);
			//linking the CSS stylesheet to this scene
			homeScene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			//Setting title to the Stage 
		    primaryStage.setTitle("Home Page"); 
			primaryStage.setScene(homeScene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
		
		
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
		WorkoutClass[] M1Classes = new WorkoutClass[10];
		WeeklyCalender M1Schedule = new WeeklyCalender(new boolean[7][72]);
		
		Member M1 = new Member("John", "Smith", LocalDate.parse("2019-12-31"), "johnSmith@email.com", LocalDate.parse("2019-12-31"), LocalDate.parse("2019-12-31"), 0, M1Classes, M1Schedule , 3);
	    
		
		Member M2 = new Member("John", "Smith", LocalDate.parse("2019-12-31"), "johnSmith@email.com", LocalDate.parse("2019-12-31"), LocalDate.parse("2019-12-31"), 0, M1Classes, M1Schedule , 3);
		Member M3 = new Member("John", "Smith", LocalDate.parse("2019-12-31"), "johnSmith@email.com", LocalDate.parse("2019-12-31"), LocalDate.parse("2019-12-31"), 0, M1Classes, M1Schedule , 3);
		
		
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
