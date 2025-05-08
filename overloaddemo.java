package fidha;
class OverLoad {
    void area(float x) {
        System.out.println("area of square is " + Math.pow(x, 2));
    }

    void area(float x, float y) {
        System.out.println("the area of the rectangle is " + x * y);
    }

    void area(double x) {
        double z = 3.14 * x * x;
        System.out.println("the area of the circle is " + z);
    }
}

class overloaddemo {
    public static void main(String args[]) {
        OverLoad ob = new OverLoad();
        ob.area(5);           
        ob.area(11, 12);    
        ob.area(2.5);  
    }
}
