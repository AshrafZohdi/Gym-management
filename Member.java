public class Member extends Person
{
    private boolean type;
    private double fee;
    public static double discount;
    public WorkoutClass registeredClasses;
    public int month; 
    public WeeklyCalender weeklySchedule;
    
    public member(String Name, int DOB, String email, Date startDate, Date endDate, boolean Type, double Fee, int Month)
    {
        super(Name, DOB, email, startDate, endDate);
        this.type = Type;
        this.month = Month;
        this.fee = Fee;
        System.out.println("New member Created");
    }
    
    public void CalculateFees(int Type, int Months)
    {
        if(Type == 1)
        {
            return months*fees*discount;
        }
        else
        {
            return months*fees;
        }
    }
    
    public double getFee()
    {
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
    
    public void setType(boolean Type)
    {
        if(Type == 1)
        {
            this.type = Type;
            CalculateFees() = month*fee*discount;
        }
        else
        {
            this.type = Type;
            CalculateFees() = month*fee;
        }
    }
    
    public void addSchedule();
}