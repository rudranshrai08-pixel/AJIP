abstract class Area  {
    int r,l,b;
    Area(String msg) {
        System.out.println("This is area Constructor");
    }
    void getArea() {
        System.out.println("This is Area Class");
    }
}
class Circle extends Area {
   final  double PI = 3.14;
   Circle(int r)  {
   super("This is Area Constructor");
     this.r=r;
   }
    void getCircleArea() {
        double  result= PI*super.r*this.r;
        System.out.println("Area of Circle=" + result);
    }

}

public class AreaMain {
    public static void main(String[] args) {
        Circle c = new Circle(12);
        c.getArea();
        c.getCircleArea();
        // Area a =new Circle(34);
        // a.getArea();
       
    }
}