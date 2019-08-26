package cashregister;

public class StubPurchase extends Purchase{
	public StubPurchase() {
		super(new Item[0]);
	}
	
	@Override
	public String asString() {
		return "test_product\t1.0\n";
	}
}
