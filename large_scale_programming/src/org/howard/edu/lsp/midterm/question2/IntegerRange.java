package org.howard.edu.lsp.midterm.question2;


/*
 * @author Manish Niure
 */
// using the range interface 
public class IntegerRange implements Range {
    private int lowerBound;
    private int upperBound;

    public IntegerRange(int lowerBound, int upperBound) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    public boolean contains(int value) {
    	if (value >= this.lowerBound && value <= this.upperBound){
			return true;
		}else {
			return false;
		}
    }
    
    public boolean overlaps(Range other) {
            IntegerRange otherRange = (IntegerRange) other;
            return this.lowerBound <= otherRange.upperBound && this.upperBound >= otherRange.lowerBound;
        }
   

    //return size 
    public int size() {
    	return (this.upperBound-this.lowerBound+1);
    }
    
    // return lowerbound
    public int getLowerBound() {
    	return this.lowerBound;
    }
    
    //return upperbound 
    public int getUpperBound() {
    	return this.upperBound;
    }
    
    
    
}
    

 
