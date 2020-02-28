package fun.Lab10_2;

// Aadi Jain

public class PersonalComp extends Electronic {

    private double cost, weight;
    String x;

    public PersonalComp(double cost, double weight) {
        this.cost=cost;
        this.weight=weight;
    }

    public double getCost() {
        return cost;
    }

    public double getWeight() {
        return weight;
    }
    
    public String toString() {
        x="Cost: " +  "$" + getCost() + "\n";
        x+="Weight: " + " " + getWeight() + " pounds" + "\n";
        return x;
    }

}
