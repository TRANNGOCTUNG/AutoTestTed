package Excercise1;

public class TriangleClassifier {
    public static  String TriangleClassifiers(int a, int b, int c) {
        if (a == b && b == c) {
            return "TriangleEquilateral";
        } else {
            return "No";
        }
    }
    public static  String isoscelesTriangle(int a, int b, int c) {
        if (a == b &&  b != c) {
            return "isoscelesTriangle";
        } else {
            return "No";
        }
    }
    public static  String normalTriangle(int a, int b, int c) {
        if (a != b && b != c && a < c && b < c) {
            return "normalTriangle";
        } else {
            return "No";
        }
    }
    public static  String notATriangle(int a, int b, int c) {
        if (a > b && b <  c) {
            return "notATriangle";
        } else {
            return "No";
        }
    }

}
