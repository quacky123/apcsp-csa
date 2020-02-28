package fun;

public class Thing {

    public static void main(String[] args) {

        String s1 = "dog";
        String s2="dog";
        String s3=s1;

        s3="lkjkl";
        
        System.out.println(s1==s3);
        System.out.println(s3);
    }
}
