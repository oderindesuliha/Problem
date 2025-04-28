package PersonsProblem;

import java.util.*;

public class Person {
    private List<Problem> problems;

    public Person() {
        problems = new ArrayList<>();
    }
    
    public Problem createProblem(String name, ProblemType type) {
        Problem problem = new Problem(name, type);
        return problem;
    }

    public void addProblem(Problem problem) {
        problems.add(problem);
    }

    public List<Problem> getProblems() {
        return problems;
    }

    public int getSize() {
        return problems.size();
    }

    public void solvedProblem(int id) {
        for (Problem problem : problems) {
            if (problem.getId() == id) {
                problem.solved(true);
                return;
            }
        }
    }

    public List<Problem> getUnsolved() {
       List<Problem> unsolved = new ArrayList<>();
        for (Problem problem : problems) {
            if (!problem.isSolved()) {
                unsolved.add(problem);
            }
        }
        return unsolved;
    }
}