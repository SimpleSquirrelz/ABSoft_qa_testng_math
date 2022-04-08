package net.absoft.solver;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SolverTest {

    @Test
    public void noRootsForDiscriminantLessThanZero() {
        Solution solution = Solver.solve(3, -4, 2);
        Assert.assertNull(solution, "Solution object has been created");
    }

    @Test
    public void sameRootsForDiscriminantEqualsZero() {
        Solution solution = Solver.solve(3, -18, 27);
        Assert.assertEquals(solution.getX1(), solution.getX2(), "With discriminant = 0 solution has 2 different roots");
    }

    @Test
    public void differentRootsForDiscriminantMoreThanZero() {
        Solution solution = Solver.solve(1, -4, -5);
        Assert.assertNotEquals(solution.getX1(), solution.getX2(), "With discriminant = 0 solution has 2 different roots");
    }

    @Test
    public void correctRootsForDiscriminantEqualsZero() {
        Solution solution = Solver.solve(3, -18, 27);
        Assert.assertEquals(solution.getRoots(), new double[]{3, 3}, "With discriminant = 0 solution has 2 different roots");
    }

    @Test
    public void correctRootsForDiscriminantMoreThanZero() {
        Solution solution = Solver.solve(1, -4, -5);
        Assert.assertEquals(solution.getRoots(), new double[]{5, -1}, "Roots miscalculating");
    }
}
