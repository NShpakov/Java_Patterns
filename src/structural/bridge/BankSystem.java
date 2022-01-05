package structural.bridge;

public class BankSystem extends Programm {
	protected BankSystem(Developer developer) {
		super(developer);
	}

	@Override
	public void developProgram() {
		System.out.println("Bank System development in progress");
		developer.writeCode();
	}
}
