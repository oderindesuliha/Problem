package PersonsProblem;

public class Problem {
    private String problemName;
    private ProblemType type;
    private boolean status;
    private int id;
    private static int count = 0;

    public Problem(String problemName, ProblemType type) {
        this.problemName = problemName;
        this.type = type;
        this.status = false;
        this.id = ++count;
    }

    public String getName() {
        return this.problemName;
    }

    public ProblemType getType() {
        return this.type;
    }

    public boolean isSolved() {
        return this.status;
    }

    public void solved(boolean status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }
}
