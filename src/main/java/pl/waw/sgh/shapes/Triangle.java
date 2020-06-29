package pl.waw.sgh.shapes;

// Insert constructor method
public class Triangle extends Shape implements PerimeterCalculation {
    public Triangle(double a, double b, double c, double d) {
        super(a, b, c, d);
    }
    
    @Override
    // Add surface calculator method
    public double calcSurface() {
        return (parA*parD)/2;
    }
    
    @Override
    // Add perimeter calculator method
    public double calcPerimeter() {
        return parA + parB + parC;
    }
}
