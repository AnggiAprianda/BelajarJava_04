public class javaMethod2 {

    public static void main(String[] args) {
        methodRankPoints(0);
     }
  
     public static void methodRankPoints(double points) {
        if (points >= 202.5) {
           System.out.println("Rangking:A1");
        }
        else if (points >= 122.4) {
           System.out.println("Rangking:A2");
        }
        else {
           System.out.println("Rangking:A3");
        }
     }
  }


