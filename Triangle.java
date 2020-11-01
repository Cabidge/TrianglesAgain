public class Triangle {
    private Point v1,v2,v3;

    public Triangle(Point a, Point b, Point c) {
        v1 = a;
        v2 = b;
        v3 = c;
    }

    public Triangle(double x1,double y1,
                    double x2,double y2,
                    double x3,double y3) {
        v1 = new Point(x1,y1);
        v2 = new Point(x2,y2);
        v3 = new Point(x3,y3);
    }

    private double[] getSides() {
        double[] sides = new double[3];
        sides[0] = v1.distanceTo(v2);
        sides[1] = v2.distanceTo(v3);
        sides[2] = v3.distanceTo(v1);
        return sides;
    }

    public double getPerimeter() {
        double[] sides = getSides();
        return sides[0] + sides[1] + sides[2];
    }

    public double getArea() {
        double[] sides = getSides();
        double semiPerimeter = getPerimeter()/2;
        double area = Math.sqrt(semiPerimeter * (semiPerimeter - sides[0]) * (semiPerimeter - sides[1]) * (semiPerimeter - sides[2]));
        return area;
    }

    public String classify() {
        double[] sides = getSides();
        for (int i = 0; i < sides.length; i++) {
            sides[i] = Math.round(sides[i] * 10000) / 10000.0;
        }

        if (sides[0] == sides[1] && sides[1] == sides[2]) {
            return "equilateral";
        }
        if (sides[0] == sides[1] || sides[1] == sides[2] || sides[2] == sides[0]) {
            return "isosceles";
        }
        return "scalene";
    }

    public String toString() {
        return "v1 " + v1 + " v2 " + v2 + " v3 " + v3;
    }

    public void setVertex(int index, Point newP) {
        switch (index) {
            case 0:
                v1 = newP;
                break;
            case 1:
                v2 = newP;
                break;
            case 2:
                v3 = newP;
                break;
        }
    }
}