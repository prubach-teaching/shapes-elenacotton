package pl.waw.sgh.shapes;

// Insert method constructor
public class EquilateralTriangle extends Triangle {
    public EquilateralTriangle(double a) {
        super(a, a, a);
    }
    
    // Add surface calculator method
    public double calcSurface() {
        Double s=(parA+parB+parC)/2;
        return Math.sqrt(s*(s-parA)*(s-parB)*(s-parC));
    }
    
    // Add perimeter calculator method
    public double calcPerimeter() {
        return 3 * parA;
    }
    
}
