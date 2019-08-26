package cashregister;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
    
    @BeforeEach
    private void cleanPrinter() {
    	mockPrinter.setTempText("");
    }
    
    @Test
    public void should_print_the_real_purchase_when_call_process() {
    	Item[] items = {new Item("test product", 1)};
    }
}
