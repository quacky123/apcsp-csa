package fun.Lab10_3;

// Aadi Jain

public class Math extends GeneralClass{
    
    String r;
    private String department, title;
    private int number;
    
    public Math(String title, int number, String department) {
        this.department=department;
        this.number=number;
        this.title=title;
    }
    
    public String getDepartment() {
        return department;
    }
    
    public int getNumber() {
        return number;
    }
    
    public String getTitle() {
        return title;
    }
    
    public String toString() {
        r="Course Name: " + title + "\n";
        r+="Department: "+ getDepartment() + "\n";
        r+="Course Number: " + getNumber() + "\n";
        return r;
    }

            
    
}
