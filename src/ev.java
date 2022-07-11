public class ev {
    static int q(int r){

        return r;
    }
    void messageToStudents(Evalution evaluation){

        if(evaluation instanceof Dsa){
            System.out.println("Its a DSA Evaluation");
             ev e1=new ev();
             int n=ev.q(5);
            Dsa d1=new Dsa(n);
            d1.evaluationTiming();
            d1.printNoOfQuestions();



        }
        else{
            System.out.println("Its a coding Evaluation");
            int n=ev.q(5);
            coding d1=new coding(n);
            d1.evaluationTiming();
            d1.printNoOfQuestions();
        }
    }

    public static void main(String[] args) {
        ev e1=new ev();

        e1.messageToStudents(new Dsa(5));
        e1.messageToStudents(new coding(4));

    }
}
