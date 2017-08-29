package orderedStructures;

public class Arithmetic extends Progression {
	private double commonDifference; 
	
	public Arithmetic(double firstValue, double commonDifference) { 
		super(firstValue); 
		this.commonDifference = commonDifference; 
	}
	
	@Override
	public double nextValue() throws IllegalStateException{
		if(!exept) 
			throw new IllegalStateException("Mehtod firstValue() has not been previously executed)");
		current = current + commonDifference; 
		return current;
	}
	public String toString() {
		return "Arith(" + (int)super.firstValue() +","+ (int)this.commonDifference+")";
		
		
	}
	public double getTerm(int n) throws IndexOutOfBoundsException { 
		if (n <= 0) 
			throw new IndexOutOfBoundsException("printAllTerms: Invalid argument value = " + n); 
       return firstValue()+(this.commonDifference)*(n-1);
	}

}
