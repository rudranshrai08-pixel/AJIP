interface   Area {
    double PI=3.14;
  void getArea(); 
}
  class Rectangle implements Area {
    int l,b;
    Rectangle(int l,int b) {
        this.l=l;
        this.b=b;

    }
    public void getArea() {
        int r=l*b;
        System.out.println("Area of Rectangle="+r);
    }
    void displayResult() {
        System.out.println("This is the display function in Rectangle ");
    }
}

public class AreaMain {
    public static void main(String [] args) {
        Rectangle r1= new Rectangle(24,26);
        r1.getArea();
        r1.displayResult();
        Area r2 = new Rectangle(49,56);         // upcasting
        
        r2.getArea();
       Area circle = new Area()  {
int r= 4;
  public   void  getArea() {                    //  @override
   double result = 3.14 * r*r;
   System.out.println("Area of a circle= " +result);
    }
       };
       circle.getArea();
    }
}