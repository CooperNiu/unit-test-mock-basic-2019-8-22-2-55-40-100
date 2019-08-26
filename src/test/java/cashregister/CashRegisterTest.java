package cashregister;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class CashRegisterTest {

    @Test
    @Disabled
    public void should_print_the_real_purchase_when_call_process() {
        //given
    	Item[] items = {new Item("test_product", 1)};
    	Purchase purchase = new Purchase(items);
    	MockPrinter mockedPrinter = new MockPrinter();
    	CashRegister cashRegister = new CashRegister(mockedPrinter);
        //when
    	cashRegister.process(purchase);
   
        //then
    	assertEquals("test_product\t1.0\n", mockedPrinter.gerTempText());
    }

    @Test
    public void should_print_the_stub_purchase_when_call_process() {
        //given
    	StubPurchase stubPurchase = new StubPurchase();
        //when
    	cashRegister.process(stubPurchase);
        //then
    	assertEquals("test_product\\t1.0\n", mockedPrinter.gerTempText());
    }

    @Test
    public void should_verify_with_process_call_with_mockito() {
        //given
    	Printer printer = Mockito.mock(Printer.class);
    	Purchase purchase = Mockito.mock(Purchase.class);
    	
    	Mockito.when(purchase.)
        //when
        //then
    }

}
