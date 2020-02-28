package fun.Lab10_2;

// Aadi Jain
public class Laptop extends PersonalComp {

    private boolean mouse;
    private String result, hardDrive;

    public Laptop(double cost, double weight, boolean mouse, String hardDrive) {
        super(cost, weight);
        this.mouse = mouse;
        this.hardDrive = hardDrive;
    }

    public String getMouse() {
        if (mouse == false) {
            return "Yes";
        } else {
            return "No";
        }
    }

    public String getHardDrive() {
        return hardDrive;
    }

    public String toString() {
        result = "2019 Macbook Air" + "\n";
        result += super.toString();
        result += "Type of hard-drive: " + getHardDrive() + "\n";
        result += "Is mouse Plugged in: " + getMouse() + "\n";
        return result;
    }
}
