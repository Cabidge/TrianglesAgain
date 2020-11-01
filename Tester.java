public class Tester {
    public static void main(String[] ayHowsItGoinHomies) {
        Point p = new Point(23.4,-333);

        // Distance between the two should be 5
        Point a = new Point(3,4);
        Point b = new Point(6,8);

        System.out.println("The following must all print out \"true\" or else I made a mistake.");
        System.out.println(p.getX() == 23.4);
        System.out.println(p.getY() == -333);
        System.out.println(a.distanceTo(b) == 5);
    }
}