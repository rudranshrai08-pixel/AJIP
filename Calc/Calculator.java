class Multi {
    void getMulti(int num1, int num2) {
        System.out.println("Multi = " + (num1 * num2));
    }
}

class Sum {
    int num1, num2;
    Sum() {             //user defined default constructor
   
    }
    Sum(int num1,int num2) {
        this.num1=num1;
        this.num2=num2;
    }
    void getSum() {
        System.out.println("Sum=" +(num1+num2));
    }
}
public class Calculator {
    public static void main(String[] args) {
      Multi multi1 = new Multi();   
        multi1.getMulti(67, 29);     
        
     Sum s1 = new Sum(239,459);
     s1.getSum();
    new Sum(69,672).getSum();
    }
}