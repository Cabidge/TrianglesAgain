public class Point {
    private double x,y;

    public Point(double X, double Y) {
        x = X;
        y = Y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distanceTo(Point other) {
        double x = this.x - other.x;
        double y = this.y - other.y;
        return Math.sqrt(x * x + y * y);
    }
}