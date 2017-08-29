package orderedStructures;

public class Geometric extends Progression {

	private double commonFactor; 
	
	public Geometric(double firstValue, double commonFactor) { 
		super(firstValue); 
		this.commonFactor = commonFactor; 
	}
	
	@Override
	public double nextValue() throws IllegalStateException{
		if(!exept) 
			throw new IllegalStateException("Mehtod firstValue() has not been previously executed)");
		current = current * commonFactor; 
		return current;
	}
	
	public String toString() {
		return "Geom(" + (int)super.firstValue() +","+ (int)this.commonFactor+")";
		
		
	}
	public double getTerm(int n) throws IndexOutOfBoundsException { 
		if (n <= 0) 
			throw new IndexOutOfBoundsException("printAllTerms: Invalid argument value = " + n); 
       return firstValue()*Math.pow(commonFactor, n-1);
	}

}
