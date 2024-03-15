package org.howard.edu.lsp.midterm.question2;


// given interface
public interface Range {
    // Returns true if v is ≥ lower bound and ≤ upper bound and false otherwise
    public boolean contains(int value); 

    // Returns true if the receiver contains at least 
    // one value in common with other, and false otherwise
    public boolean overlaps(Range other);

    // Returns the number of integers in the range
    public int size(); 
    
    // adding extra method 
    public int getLowerBound();
    public int getUpperBound();
    
}

