public class ScopeExample1{
	private int i;
	
	public void firstMethod() {
		int i=4,j=5;
		
		this.i=i+j;
		secondMethod(7);
		
	}
	public void secondMethod(int i) {///formal parameter
		int j=8; //local variable
		this.i=i+j;
			}
}
