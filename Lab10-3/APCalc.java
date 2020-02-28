package fun.Lab10_3;

// Aadi Jain
public class APCalc extends Math {

    private String description, result;
    private boolean graph;

    public APCalc(String title, int number, String department, String description, boolean graph) {
        super(title, number, department);
        this.description = description;
        this.graph=graph;
    }

    public String getG() {
        if (graph==false) {
            return "NO";
        }
        else {
            return "YES";
        }
    }
    public String toString() {
        result = super.toString();
        result += "Description: " + description + "\n";
        result+="Making graphs: " + getG() + "\n";
        return result;
    }

}
