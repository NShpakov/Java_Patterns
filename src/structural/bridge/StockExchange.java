package structural.bridge;

public class StockExchange extends Programm {
	protected StockExchange(Developer developer) {
		super(developer);
	}

	@Override
	public void developProgram() {
		System.out.println("Stock Exchange developer in progress...");
		developer.writeCode();
	}
}
