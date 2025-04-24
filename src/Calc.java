public class Calc {
    double x;
    double y;
    double ax;
    double ay;
    double bx;
    double by;

    // constructor for Question 1
    public Calc(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // constructor for Question 2 and 3
    public Calc(double ax, double ay, double bx, double by) {
        this.ax = ax;
        this.ay = ay;
        this.bx = bx;
        this.by = by;
    }

    // formula to calculate length
    // sqrt((vx - ux)^2 + (vy - uy)^2)
    public double calculateLength(double x, double y) {
        return Math.sqrt((x * x) + (y * y));
    }

    // formula to calculate distance
    // sqrt((v1-u1)^2 + (v2-u2)^2)
    public double calculateDistance(double vx, double vy, double ux, double uy) {
        return Math.sqrt(((vx - ux) * (vx - ux)) + ((vy - uy) * (vy - uy)));
    }

    // formula to calculate angle
    // dotproduct / magnitude a * magnitude b
    // convert radians to degree with radian * 180/pi
    public double calculateAngle(double vx, double vy, double ux, double uy) {
        double dotProduct = (vx * ux) + (vy * uy);
        double radians = Math.acos((dotProduct) / ((calculateLength(vx, vy)) * calculateLength(ux, uy)));
        return radians * (180 / 3.142);
    }
}
