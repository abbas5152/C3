public abstract class Evalution {
    private final int numberOfQuestions;

    protected Evalution(int numberOfQuestions) {
        this.numberOfQuestions = numberOfQuestions;
    }

    abstract void evaluationTiming();
    void printNoOfQuestions() {
        System.out.println("No. of Questions in Evaluation is :" +numberOfQuestions);
    }


}
