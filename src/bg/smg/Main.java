package bg.smg;

public class Main {

    public static void main(String[] args) {
        double d1 = 4.3;
        double d2 = 5.2;
        if(Double.compare(d1,d2)>0){
            //d1 > d2
            System.out.println("d1 > d2");
        } else if(Double.compare(d1,d2)<0){
            //d1 < d2
            System.out.println("d1 < d2");
        } else {
            //d1 = d2
            System.out.println("d1 = d2");
        }
    }
}
