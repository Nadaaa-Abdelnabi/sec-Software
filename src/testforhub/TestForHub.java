
package testforhub;


public class TestForHub {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         System.out.println(fact(26));
    }
     public static double fact(double n){
        if (n==1) return 1;
        else return n*fact(n-1);
    }
}
