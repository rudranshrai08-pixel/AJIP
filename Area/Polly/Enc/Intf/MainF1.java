interface Sub {
    int substract (int n1, int n2);
}
public class MainF1 {
    public static void main(String[] args) {
        Sub s = new Sub() {
            @Override
            public int substract(int n1, int n2) {
                return n1 - n2;
            }
        };
        int r = s.substract(100, 30);
        System.out.println("Substraction is: " + r);
        Sub s1 = (int n1, int n2) -> n1 - n2;         // Lambda Expression is the short form of anonymous functions (Always implement  the functional interface )
        int r1 = s1.substract(100, 30);
        System.out.println("Substraction is: " + r1);
        
        };
    }
