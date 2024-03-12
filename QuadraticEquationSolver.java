package hw_07032024;
//В три переменные a, b и c записаны три вещественных числа. Создать программу,
// которая будет находить и выводить на экран вещественные корни квадратного уравнения ax²+bx+c=0,
// либо сообщать, что корней нет.

public class QuadraticEquationSolver {
    public static void main(String[] args) {
        double a = 1.0;
        double b = 5.0;
        double c = 2.0;

        double discriminant = b * b - 4 * a * c;
        System.out.println("D = " + discriminant);

        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("У квадратного уравнения два различных корня:");
            System.out.println("корень 1 = " + root1);
            System.out.println("корень 2 = " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("У квадратного уравнения один корень:");
            System.out.println("корень = " + root);
        } else {
            System.out.println("У квадратного уравнения корней нет.");
        }
    }
}





