/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbersmagic;

/**
 *
 * @author mszuchan
 */
public class NumbersMagic {
public static void main(String[] args){
double a = -191.635;
        double b = 43.74;
        int c = 16, d = 45;
        double x = 11.635;
        double y = 2.76;
         


        System.out.printf("The absolute value " + "of %.3f is %.3f%n", 
                          a, Math.abs(a));

        System.out.printf("The ceiling of " + "%.2f is %.0f%n", 
                          b, Math.ceil(b));

        System.out.printf("The floor of " + "%.2f is %.0f%n", 
                          b, Math.floor(b));

        System.out.printf("The rint of %.2f " + "is %.0f%n", 
                          b, Math.rint(b));

        System.out.printf("The max of %d and " + "%d is %d%n",
                          c, d, Math.max(c, d));

        System.out.printf("The min of of %d " + "and %d is %d%n",
                          c, d, Math.min(c, d));
        System.out.printf("The value of " + "e is %.4f%n",
                          Math.E);

        System.out.printf("The exponent of (%.3f) " + "is %.3f%n",
                          x, Math.exp(x));

        System.out.printf("The logarithm from (%.3f) is " + "%.3f%n",
                          x, Math.log(x));

        System.out.printf("The power at (%.3f, %.3f) " + "is %.3f%n",
                          x, y, Math.pow(x, y));

        System.out.printf("The square root from(%.3f) is " + "%.3f%n",
                          x, Math.sqrt(x));  
        /* Display in console 3  generated numbers between 1 and 10
                */
        System.out.format("%.0f%n", Math.random() * 10);
        System.out.format("%.0f%n", Math.random() * 10);
        System.out.format("%.0f%n", Math.random() * 10);

        
      
      
      
 }

}

