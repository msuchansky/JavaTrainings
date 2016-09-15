/*
 * Test complex numbers 
 */
package complexnumbers;

/**
 * Test complex numbers
 * @author mszuchan
 */
public class TestComplexNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create 4 complex numbers 
        ComplexNumber cn1 = new ComplexNumber(2.0, 5.0);
        ComplexNumber cn2 = new ComplexNumber(-3.5, 2.0);
        ComplexNumber cn3 = new ComplexNumber(-3.0, -3.0);
        ComplexNumber cn4 = new ComplexNumber(4.0, -4.0);
        
        // For all 4 numbers call toString()
        System.out.println(cn1.toString());
        System.out.println(cn2.toString());
        System.out.println(cn3.toString());
        System.out.println(cn4.toString());
        
        // Tests method equals 
        System.out.println(cn1.equals(cn1));
        System.out.println(cn1.equals(cn2));
        
        // Test conjugate number 
        System.out.println("Conjugate number of complex number: " + cn1.toString()+" is complex number: " + ComplexNumber.conjugate(cn1) );
        
        // Test addition of two complex numbers 
        System.out.println((cn1.add(cn2)).toString());
        
       
        // Test subtraction of two complex numbers 
        System.out.println((cn1.substract(cn2)).toString());
        
    }
    
}
