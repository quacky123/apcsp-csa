package fun.Lab10_2;

// Aadi Jain

public class Smartphone extends Electronic {
    
    private double cost, weight;
    String x;
    
    public Smartphone(double cost, double weight) {
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
        x="Cost: " + "$" + getCost() + "\n";
        x+="Weight: " + getWeight() + " ounces" + "\n";
        return x;
    } 
    
}
