package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double a = 1.0;
        double b = 3.0;
        double c = -4.0;
        // 求平方根可用 Math.sqrt():
        // System.out.println(Math.sqrt(2)); ==> 1.414
        // TODO:
        double sqrt = Math.sqrt(b * b - 4 * a * c);
        double r1 =  (-b+ sqrt)/2*a;
        double sqrt1= sqrt;        
        double r2 =  (-b- sqrt1)/2*a;

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r1 == 1 && r2 == -4 ? "测试通过" : "测试失败");
    }
}
