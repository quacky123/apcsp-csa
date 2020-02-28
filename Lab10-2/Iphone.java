package fun.Lab10_2;

// Aadi Jain
public class Iphone extends Smartphone {

    private boolean state;
    private String call, t;
    
    public Iphone(double cost, double weight, boolean state, String call) {
        super(cost, weight);
        this.state = state;
        this.call=call;
    }

    public String getState() {
        if (state==false) {
            return "ON";
        }
        else {
            return "OFF";
        }
    }
    
    public String getCall() {
        return call;
    }
    
    public String toString() {
        t="Iphone 11 Pro"+ "\n";
        t+=super.toString();
        t+= "Touchscreen: " + getState() +"\n";
        t+="Is call going on: " + getCall();
        return t;
    }
}
