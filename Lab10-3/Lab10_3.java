package fun.Lab10_3;

// Aadi Jain
public class Lab10_3 {

    public static void main(String[] args) {

        APCalc a = new APCalc("AP Calculus AB/BC", 001, "Math", "An advanced calculus course to further your knowledge", true);
        System.out.println(a);
                
        APStats b=new APStats("AP Statistics", 002, "Math", "An advanced statistics class to understand statistics", false);
        System.out.println(b);
        
        APChem c = new APChem("AP Chemistry", 101, "Science", "An advanced chemistry course to delve into the world of chemistry", false);
        System.out.println(c);
        
        APBio d=new APBio("AP Biology", 102, "Science", "An AP class to explore and learn the world around you", true);
        System.out.println(d);
    }

}
