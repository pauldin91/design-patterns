package clean.code.creational.factory;

public class Point {
    private final double x;
    private final double y;

    private Point(double a, double b, CoordinateSystem system) {

        switch (system) {
            case CARTESIAN:
                this.x = a;
                this.y = b;
                break;
            case POLAR:
                this.x = a * Math.cos(b);
                this.y = a * Math.sin(b);
                break;
            default:
                this.x = 0.0;
                this.y = 0.0;
        }
    }

    private Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public static class Factory {

        public static Point newCartesian(double x, double y) {
            return new Point(x, y);
        }

        public static Point newPolar(double rho, double theta) {
            return new Point(Math.cos(theta) * rho, Math.sin(theta) * rho);
        }
    }

}
