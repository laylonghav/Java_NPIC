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
      
    int math = 50;
    int Khmer = 40;
    int totalScore= 90;
    if(math>=50){
        System.out.println("pass");
    }
    if(Khmer>=50){
        System.out.println("pass");
    }else{
        System.out.println("fail");
    }
    if(totalScore>=90){
        System.out.println("Very good");
    } else if(totalScore>=80){
        System.out.println("good");
    }
    else if(totalScore>=60){
        System.out.println("Normal");
    }
    else{
        System.out.println("Weak");
    }
    if(math>=50){
        System.out.println("pass");
    }

    }
}
