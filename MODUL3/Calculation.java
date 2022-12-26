public class Calculation implements Runnable {
    private double radius;
    private double side;
    private double area;
    private final double phi = 3.14;
  
    public void setSquare(double side) throws IllegalArgumentException {
      if (side < 1) {
        throw new IllegalArgumentException("illegal exception");
      }
      this.side = side;
      this.area = side * side;
    }
  
    public double getSquare() {
      return this.area;
    }
  
    public void setCircle(double radius) throws IllegalArgumentException {
      if (radius < 1) {
        throw new IllegalArgumentException("illegal exception");
      }
      this.radius = radius;
      this.area = phi * radius * radius;
    }
  
    public double getCircle() {
      return this.area;
    }
  
}