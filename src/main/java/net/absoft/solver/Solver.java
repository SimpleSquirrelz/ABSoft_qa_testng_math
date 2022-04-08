package net.absoft.solver;

public class Solver {
    
    private Solver() {
    }

    public static Solution solve(double a, double b, double c) {
        double x1, x2;
        double d = (b * b) - (4 * a * c);

        if (d < 0)
            return null;
        else if (d == 0.0) {
            x1 = -b / (2 * a);
            x2 = -b / (2 * a);
        } else {
            x1 = (-b + Math.sqrt(d)) / (2 * a);
            x2 = (-b - Math.sqrt(d)) / (2 * a);
        }

        return new Solution(x1, x2);
    }
}
