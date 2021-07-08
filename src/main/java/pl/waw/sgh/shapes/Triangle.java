package pl.waw.sgh.shapes;

// Insert constructor method
public class Triangle extends Shape implements PerimeterCalculation {
    public Triangle(double a, double b, double c) {
        super(a, b, c);
    }
    
    @Override
    // Add surface calculator method
    public double calcSurface() {
        Double s=(parA+parB+parC)/2;
        return Math.sqrt(s*(s-parA)*(s-parB)*(s-parC));
    }
    
    @Override
    // Add perimeter calculator method
    public double calcPerimeter() {
        return parA + parB + parC;
    }
}
