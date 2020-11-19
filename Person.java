Public abstract class Person{

    private String fName;
    private String lName;
    private String dOB;
    private String email;
    private String startDate;
    private String endDate;

    public Person(String fn, String ln, String dob, String email, String startDate, String endDate)
    {
        this.fName = fn;
        this.lName = ln;
        this.dOB = dob;
        this.email = email;
        this.StartDate = startDate;
        this.EndDate = endDate;
        system.out.println("New person is created");
    }

    public void setName(String FName, String LName)
    {	   
        this.fName = FName;
        this.lName = LName;
    }

    public String getName()
    {	
        return  + FName +" " + LName;
    }
 
    public void setdOB(String dob)
	{
	    this.dOB = dob;
	}
	
    public String getdOB()
    {	
        return dOB;
    }
    
    public void setEmail(String email)
	{
	    this.email = email;
	}
	
	public String getEmail()
    {	
        return email;
    }
    
    public void setStartdate(String startDate)
	{
	    this.startDate = startDate;
	}
	
	public String getStartdate()
    {	
        return startDate;
    }
    
    public void setEnddate(String endDate)
    {
        this.endDate = endDate
    }
    
    public String getEnddate()
    {
        return endDate;
    }
    
    public String toString()
    {
        
		return "Name= " + getName() +  ",  Date of Birth= " + dOB + ", Email=  " + email+ ", Start Date =" +startDate+ ", End Date = ", +endDate;
	
    }
}