package pl.waw.sgh.shapes;

// Insert method constructor
public class EquilateralTriangle extends Triangle {
    public EquilateralTriangle(double a) {
        super(a, a, a);
    }
    
    // Add surface calculator method
    public double calcSurface() {
        return ((parA * parA * Math.sqrt(3)) / 4;
    }
    
    // Add perimeter calculator method
    public double calcPerimeter() {
        return 3 * parA;
    }
    
}
