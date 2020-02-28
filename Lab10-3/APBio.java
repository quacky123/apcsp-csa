package fun.Lab10_3;

// Aadi Jain

public class APBio extends Science{
    
    private String result, description;
    private boolean bacteria;
    
    public APBio(String title, int number, String department, String description, boolean bacteria) {
        super(title, number, department);
        this.description=description;
        this.bacteria=bacteria;
    }
    
    public String getBac() {
        if (bacteria==false) {
            return "NO";
        }
        else {
            return "YES";
        }
    }
    
    public String toString() {
        result=super.toString();
        result+="Description: " + description + "\n";
        result+="Bacteria being made: " + getBac() + "\n";
        
        return result;
    }
    
}
