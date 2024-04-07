package besic.java;

public class Java15_ternary_operator_or_short_hand_of_operator {

    //ternary_operator_or_short_hand_of_operator
    public static void main(String[] arry) {
        int exam = 50, project = 60;
        String resultExam, resultProject;

        resultExam = (exam >= 50) ? "Pass" : "false";
        System.out.println("Exam is" + " " + resultExam);

        resultProject = (project >= 50) ? "Pass" : "false";
        System.out.println("Projectis" + " " + resultProject);
    }
}
