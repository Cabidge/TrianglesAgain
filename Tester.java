public class Tester {
    public static void main(String[] ayHowsItGoinHomies) {
        Point p = new Point(23.4,-333);
        Point q = new Point(23.4,-333);

        // Distance between the two should be 5
        Point a = new Point(3,4);
        Point b = new Point(6,8);

        Point c = new Point(3,4);

        System.out.println("The following must all print out \"true\" or else I made a mistake.");

        // getters
        System.out.println(p.getX() == 23.4);
        System.out.println(p.getY() == -333);

        // distanceTo method
        System.out.println(a.distanceTo(b) == 5);

        // equals method
        System.out.println(p.equals(q));
        System.out.println(!p.equals(a));
        System.out.println(a.equals(c));

        // Triangles
        Triangle t = new Triangle(a,b,new Point(6,4)); // 3,4,5 triangle
        Triangle u = new Triangle(3,4, 6,8, 6,4); // Same triangle as above

        // getPerimeter method
        System.out.println(t.getPerimeter() == 12);
        System.out.println(u.getPerimeter() == 12);
    }
}