package PersonsProblem;

public class Problem {
    private String problemName;
    private ProblemType type;
    private boolean isSolved;
    private int id;
    private static int count = 0;

    public Problem(String problemName, ProblemType type) {
        this.problemName = problemName;
        this.type = type;
        isSolved = false;
        this.id = ++count;
    }

    public String getName() {
        return this.problemName;
    }

    public ProblemType getType() {
        return this.type;
    }

    public void solved() {
        isSolved = true;
    }

    public int getId() {
        return id;
    }
}
