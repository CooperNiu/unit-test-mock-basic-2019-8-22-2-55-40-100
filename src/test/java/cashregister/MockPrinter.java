package cashregister;

public class MockPrinter extends Printer{
	private String tempText = "";
	
	@Override
	public void print(String printThis) {
		super.print(printThis);
		
		tempText = printThis;
	}

	public String gerTempText() {
		// TODO Auto-generated method stub
		return this.tempText;
	}
}
