import PersonsProblem.Problem;
import PersonsProblem.ProblemType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProblemTest {

    Problem problem;
    @BeforeEach
    public void setUp() {
        problem = new Problem("Debt of 5m", ProblemType.FINANCIAL);
    }

    @Test
    public void testThatThereIsProblem() {
        assertEquals("Debt of 5m", problem.getName());
        assertEquals(ProblemType.FINANCIAL, problem.getType());
        assertFalse(problem.isSolved());
    }

    @Test
    public void testThatProblemIsSolved() {
        problem.solved(true);
        assertTrue(problem.isSolved());
    }

    @Test
    public void testThatProblemIsNotSolved() {
        problem.solved(false);
        assertFalse(problem.isSolved());
    }

    @Test
    public void testThatOneProblemIsSolvedAndOneIsNotSolved() {
        Problem problem2 = new Problem("Failed a class test", ProblemType.EDUCATION);
        problem.solved(true);

        assertTrue(problem.isSolved());
        assertFalse(problem2.isSolved());
    }

    @Test
    public void testThatProblemIdsIncrementSequentiallyInSingleTest() {
        Problem problem1 = new Problem("Fail Test", ProblemType.EDUCATION);
        Problem problem2 = new Problem("VillagePeople", ProblemType.SPIRITUAL);
        Problem problem3 = new Problem("No Profit", ProblemType.BUSINESS);

        assertEquals(1, problem.getId());
        assertEquals(2, problem1.getId());
        assertEquals(3, problem2.getId());
        assertEquals(4, problem3.getId());
    }

}

