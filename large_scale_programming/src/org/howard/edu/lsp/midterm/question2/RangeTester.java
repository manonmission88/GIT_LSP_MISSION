package org.howard.edu.lsp.midterm.question2;

// testing  class for Range 

/*
 * @author Manish Niure 
 */
public class RangeTester {
    public static void main(String[] args) {
        // Create two IntegerRange objects
        IntegerRange range1 = new IntegerRange(5, 10);
        IntegerRange range2 = new IntegerRange(8, 15);
        IntegerRange range3 = new IntegerRange(1, 3);

        // Test contains method
        System.out.println("Range 1 contains 7: " + range1.contains(7)); // true
        System.out.println("Range 2 contains 12: " + range2.contains(12)); // true

        // Test overlaps method
        System.out.println("Range 1 overlaps with Range 2: " + range1.overlaps(range2)); // true
        System.out.println("Range 1 overlaps with Range 3: " + range1.overlaps(range3)); // false
        
        // Test size method
        System.out.println("Size of Range 1: " + range1.size()); // 6
        System.out.println("Size of Range 1: " + range2.size()); // 8
        

        // Test getLowerBound and getUpperBound methods
        System.out.println("Lower Bound of Range 1: " + range1.getLowerBound()); // 5
        System.out.println("Upper Bound of Range 1: " + range1.getUpperBound()); // 10
    }
}
