package hw_07032024;
//В три переменные a, b и c явно записаны программистом три целых попарно неравных между собой числа. Создать программу, которая переставит числа в переменных таким образом,
// чтобы при выводе на экран последовательность a, b и c оказалась строго возрастающей
public class RowNumbers {
    public static void main(String[] args) {
        int numberA = 4;
        int numberB = 5;
        int numberC = 7;

        if (numberA <= numberB && numberB <= numberC) {
            System.out.println(numberA + " " + numberB + " " + numberC);
        } else if (numberA <= numberC && numberC <= numberB) {
            System.out.println(numberA + " " + numberC + " " + numberB);
        } else if (numberB <= numberA && numberA <= numberC) {
            System.out.println(numberB + " " + numberA + " " + numberC);
        } else if (numberB <= numberC && numberC <= numberA) {
            System.out.println(numberB + " " + numberC + " " + numberA);
        } else if (numberC <= numberA && numberA <= numberB) {
            System.out.println(numberC + " " + numberA + " " + numberB);
        } else {
            System.out.println(numberC + " " + numberB + " " + numberA);
        }
    }
}
