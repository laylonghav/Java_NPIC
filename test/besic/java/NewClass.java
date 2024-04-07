package besic.java;

public class NewClass {

    public static void main(String[] arry) {
        int math = 50;
        int Khmer = 40;
        int totalScore = 90;
        if (math >= 50) {
            System.out.println("pass");
        }
        if (Khmer >= 50) {
            System.out.println("pass");
        } else {
            System.out.println("fail");
        }
        if (totalScore >= 90) {
            System.out.println("Very good");
        } else if (totalScore >= 80) {
            System.out.println("good");
        } else if (totalScore >= 60) {
            System.out.println("Normal");
        } else {
            System.out.println("Weak");
        }
        if (math >= 50) {
            System.out.println("pass");
        }
    }
}
