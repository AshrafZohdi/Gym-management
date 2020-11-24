import java.util.Date;

public abstract class Person{

    private String fName;
    private String lName;
    private Date dOB;
    private String email;
    private Date startDate;
    private Date endDate;

    public Person(String fn, String ln, Date dob, String email, Date startDate, Date endDate)
    {
        this.fName = fn;
        this.lName = ln;
        this.dOB = dob;
        this.email = email;
        this.startDate = startDate;
        this.endDate = endDate;
        System.out.println("New person is created");
    }

    
    
    public String toString()
    {
        
		return "First Name= " + getfName() +  ",  Date of Birth= " + dOB + ", Email=  " + email+ ", Start Date =" +startDate+ ", End Date = " +endDate;
	
    }



	public String getfName() {
		return fName;
	}



	public void setfName(String fName) {
		this.fName = fName;
	}



	public String getlName() {
		return lName;
	}



	public void setlName(String lName) {
		this.lName = lName;
	}



	public Date getdOB() {
		return dOB;
	}



	public void setdOB(Date dOB) {
		this.dOB = dOB;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public Date getStartDate() {
		return startDate;
	}



	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}



	public Date getEndDate() {
		return endDate;
	}



	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
}