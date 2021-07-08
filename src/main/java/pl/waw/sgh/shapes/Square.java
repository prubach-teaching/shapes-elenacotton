package pl.waw.sgh.shapes;

// Insert constructor method
public class Square extends Rectangle {
    public Square(double a) {
        super(a, a);
    }
    
    // Add surface calculator method
    public double calcSurface() {
        return Math.pow(parA,2);
    }
    
    // Add perimeter calculator method
    public double calcPerimeter() {
        return 4*parA;
    }
    
}
