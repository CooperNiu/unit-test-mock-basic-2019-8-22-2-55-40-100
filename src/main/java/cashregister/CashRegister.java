package cashregister;

import org.junit.jupiter.api.BeforeAll;

class CashRegister {

    private final Printer printer;
    private static MockPrinter mockPrinter;
    private static CashRegister cashRegister;

    public CashRegister(Printer printer) {
        this.printer = printer;
    }

    public void process(Purchase purchase) {
        printer.print(purchase.asString());
    }
    
    @BeforeAll
    private void setup() {
		mockPrinter = new MockPrinter();
		cashRegister = new CashRegister(mockPrinter);    		
	}
    
}
