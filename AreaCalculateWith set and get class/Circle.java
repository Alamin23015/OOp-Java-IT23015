public class Circle {
    private double radius; 

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Getter 
    public double getRadius() {
        return radius;
    }

    // Setter 
    public void setRadius(double radius) {
       
        this.radius = radius;
    }

    //calculate the area
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
