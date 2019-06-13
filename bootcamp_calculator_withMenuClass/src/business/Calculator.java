package business;
//
	public class Calculator {

		private int userEntry;
		private double firstNumber;
		private double secondNumber;		
		private double total;
		
		
	
	@Override
		public String toString() {
			return "Bootcamp [userEntry=" + userEntry + ", firstNumber=" + firstNumber + ", secondNumber="
					+ secondNumber + ", total=" + total + "]";
		}
		
		public Calculator() {
	}

	public Calculator(int userEntry, double firstNumber, double secondNumber, double total) {
		super();
		this.userEntry = userEntry;
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
		this.total = total;
	}

	public int getUserEntry() {
		return userEntry;
	}
	public void setUserEntry(int userEntry) {
		this.userEntry = userEntry;
	}
	public double getFirstNumber() {
		return firstNumber;
	}
	public void setFirstNumber(double firstNumber) {
		this.firstNumber = firstNumber;
	}
	public double getSecondNumber() {
		return secondNumber;
	}
	public void setSecondNumber(double secondNumber) {
		this.secondNumber = secondNumber;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}	
	
	
	
}
