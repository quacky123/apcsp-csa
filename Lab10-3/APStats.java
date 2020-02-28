package fun.Lab10_3;

// Aadi Jain
public class APStats extends Math{

    private String description, result;
    private boolean prob;
    
    public APStats(String title, int number, String department, String description, boolean prob) {
        super(title, number, department);
        this.description = description;
        this.prob=prob;
    }

    public String getProb() {
        if (prob==false) {
            return "NO";
        }
        else {
            return "YES";
        }
    }
    public String toString() {
        result = super.toString();
        result += "Description: " + description + "\n";
        result+="Probability being calculated: " + getProb() + "\n";
        return result;
    }

}
