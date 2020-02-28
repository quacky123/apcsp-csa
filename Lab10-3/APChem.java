package fun.Lab10_3;

// Aadi Jain
public class APChem extends Science {

    private String result, description;
    private boolean experiments;

    public APChem(String title, int number, String department, String description, boolean experiments) {
        super(title, number, department);
        this.description=description;
        this.experiments=experiments;
    }
    
    public String getExp() {
        if (experiments==false) {
            return "YES";
        } else {
            return "NO";
        }
        
    }

    public String toString() {
        result = super.toString();
        result+="Description: " + description + "\n";
        result+="Experiments occuring: " + getExp() + "\n";
        return result;
    }

}
