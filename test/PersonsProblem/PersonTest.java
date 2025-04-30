//package PersonsProblem;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//public class PersonTest {
//    Person person;
//
//    @BeforeEach
//    void setUp() {
//        person = new Person();
//    }
//
//    @Test
//    public void testThatAddsToAPersonsProblem() {
//        person.addProblem("Debt", ProblemType.FINANCIAL);
//        assertEquals(1, person.getSize());
//    }
//
//    @Test
//    public void testThatAddsMoreThanOneProblemToAPersonsProblemType() {
//       Problem problem1 = person.addProblem("Debt", ProblemType.FINANCIAL);
//       Problem problem2 = person.createProblem("Fail Test", ProblemType.EDUCATION);
//       Problem problem3 =person.createProblem("VillagePeople", ProblemType.SPIRITUAL);
//       person.addProblem(problem1);
//       person.addProblem(problem2);
//       person.addProblem(problem3);
//        assertEquals(3, person.getSize());
//    }
//
//    @Test
//    public void testThatUnsolvedProblemReturnsUnsolvedProblems() {
//        Problem problem1 = person.createProblem("Debt", ProblemType.FINANCIAL);
//        Problem problem2 = person.createProblem("Fail Test", ProblemType.EDUCATION);
//        Problem problem3 =person.createProblem("VillagePeople", ProblemType.SPIRITUAL);
//        person.addProblem(problem1);
//        person.addProblem(problem2);
//        person.addProblem(problem3);
//
//        person.solvedProblem(problem1.getId());
//
//        List<Problem> unsolved = person.getUnsolved();
//        assertEquals(2, unsolved.size());
//        assertFalse(unsolved.contains(problem1));
//        assertTrue(unsolved.contains(problem2));
//        assertTrue(unsolved.contains(problem3));
//
//    }
//
//    @Test
//    public void testThatProblemIsSolvedAndIdIsChecked() {
//        Problem problem1 = person.createProblem("Debt", ProblemType.FINANCIAL);
//        person.addProblem(problem1);
//        List<Problem> problems = person.getProblems();
//        assertEquals(problems, person.getProblems());
//        assertEquals(1, person.getSize());
//
//        Problem problem = new Problem("Debt", ProblemType.FINANCIAL);
//        assertFalse(problem.isSolved());
//    }
//
//}