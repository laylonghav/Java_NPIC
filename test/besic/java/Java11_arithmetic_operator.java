package besic.java;

public class Java11_arithmetic_operator {

    public static void main(String[] arry) {
//arithmetic operator
        double a, b, result1, result2, result3, result4, result5;
        a = 103;
        b = 50;
        result1 = a + b;
        result2 = a - b;
        result3 = a * b;
        result4 = a / b;
        result5 = a % b;
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        b++;
        a--;
        System.out.println(b);//Ouput 51 
        System.out.println(a);//Ouput 102
    }
}
