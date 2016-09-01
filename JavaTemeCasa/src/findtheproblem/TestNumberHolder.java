/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findtheproblem;


/**
 *
 * @author mszuchan
 */
public class TestNumberHolder {

    public static void main(String[] args) {
        NumberHolder Me = new NumberHolder();
        Me.IntNumber = 10;
        Me.FloatNumber = 50;
        System.out.println("The value of the member variables is"+ 
                           Me.IntNumber  +  "and"  +  Me.FloatNumber);
        
        System.out.format("The value of the first variable is %d%n", Me.IntNumber);
        System.out.format("The value of the second variable is %f%n", Me.FloatNumber);

    }
    
}
