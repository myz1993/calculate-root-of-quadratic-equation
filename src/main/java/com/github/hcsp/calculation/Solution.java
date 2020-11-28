package com.github.hcsp.calculation;

import java.util.Arrays;

public class Solution {
    //声明一个数组
    private static double[] d;
    //声明存放两个根的变量
    private static double x1;
    private static double x2;
    public static void main(String[] args) {
        System.out.println("x^2-2x+1=0的解是：" + Arrays.toString(calculate(1, -2, 1)));
        System.out.println("x^2-4=0的解是：" + Arrays.toString(calculate(1, 0, -4)));
        System.out.println("x^2+1=0的解是：" + Arrays.toString(calculate(1, 0, 1)));
    }

    // 计算一元二次方程ax^2+bx+c=0的根。
    // 若有两个根，返回一个数组，包含这两个根，即：new double[] { root1, root2 }
    // 若有一个根，返回一个数组，包含这个根，即：n返回new double[] { root }
    // 若没有根，返回一个空数组，即：new double[] {}
    // 提示，你可利用求根公式x=[-b±√(b²-4ac)]/2a
    // 需要执行开方运算时可使用Math.sqrt()方法
    public static double[] calculate(int a, int b, int c) {
        if (b * b - 4 * a * c > 0) {
            //两个根
            d = new double[2];
            x1 = (-b+Math.sqrt(b*b-4*a*c))/2*a;
            x2 = (-b-Math.sqrt(b*b-4*a*c))/2*a;
            d[0]=x1;
            d[1]=x2;

        } else if (b * b - 4 * a * c == 0) {
            //一个根
            d = new double[1];
            x1 = (-b+Math.sqrt(b*b-4*a*c))/2*a;
            d[0]=x1;
        } else {
            //无根
            d = new double[0];
        }
        return d;
    }
}
