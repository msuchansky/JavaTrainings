/*
 * Implementation of complex numbers 
 */
package complexnumbers;

/**
 * Implementation of complex numbers 
 * @author mszuchan
 */
public class ComplexNumber extends Number {
   
    /**
    * real part of the complex number  
    */ 
    private double re;
    
    /**
    * imaginary part of the complex number  
    */ 
    private double im;
    
    /**
    * Definition of complex number constructor 
     * @param re specify the real part of complex number 
     * @param im specify the imaginary part of complex number 
    */

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    @Override
    public String toString() {
        if(im < 0)
            return Double.toString(re) + Double.toString(im) + "i";
        else 
            return Double.toString(re) + "+" + Double.toString(im) + "i";    
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.re) ^ (Double.doubleToLongBits(this.re) >>> 32));
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.im) ^ (Double.doubleToLongBits(this.im) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ComplexNumber other = (ComplexNumber) obj;
        if (Double.doubleToLongBits(this.re) != Double.doubleToLongBits(other.re)) {
            return false;
        }
        if (Double.doubleToLongBits(this.im) != Double.doubleToLongBits(other.im)) {
            return false;
        }
        return true;
    }
    
    /**
     *
     * @param initialNumber
     * @return
     */
    public static ComplexNumber conjugate (ComplexNumber initialNumber) {
        ComplexNumber returnNumber = new ComplexNumber(initialNumber.getRe(),-1*initialNumber.getIm());
        return returnNumber;
    }
    
    public ComplexNumber add(ComplexNumber b) {
        
        ComplexNumber rezultatAdunare = new ComplexNumber(this.getRe()+b.getRe(),this.getIm()+b.getIm());
        return rezultatAdunare;
        
    }
    
    public ComplexNumber substract(ComplexNumber b) {
        
        ComplexNumber rezultatAdunare = new ComplexNumber(this.getRe()-b.getRe(),this.getIm()-b.getIm());
        return rezultatAdunare;
        
    }
    
    /**
     * Get the value of im
     *
     * @return the value of im
     */
    public double getIm() {
        return im;
    }

    /**
     * Set the value of im
     *
     * @param im new value of im
     */
    public void setIm(double im) {
        this.im = im;
    }
    

    /**
     * Get the value of re
     *
     * @return the value of re
     */
    public double getRe() {
        return re;
    }

    /**
     * Set the value of re
     *
     * @param re new value of re
     */
    public void setRe(double re) {
        this.re = re;
    }

    @Override
    public int intValue() {
        throw new UnsupportedOperationException("Unsupported operation."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public long longValue() {
        throw new UnsupportedOperationException("Unsupported operation."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float floatValue() {
        throw new UnsupportedOperationException("Unsupported operation."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double doubleValue() {
        throw new UnsupportedOperationException("Unsupported operation."); //To change body of generated methods, choose Tools | Templates.
    }

}
