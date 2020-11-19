 public class Staff extends Person
 {
     private double Salary
     private String Designation
     
     
     public Staff(double salary, String designation, String fn, String ln, String dob)
     {
         super(fn, ln, dob);
         this.Salary = salary;
         this.Designation = designation;
     }
     
     public void setSalary(Double salary)
     {
         this.Salary = salary;
     }
     
     public Double getSalary()
     {
         return salary;
     }
     
     public void setDesignation(String designation)
     {
         this.Designation = designation;
     }
     
 }