package structural.bridge;


public class ProgrammCreator {
	public static void main(String[] args) {
		Programm[] programs = {
				new BankSystem(new CppDeveloper()),
				new StockExchange(new JavaDeveloper())
		};

		for (Programm program : programs) {
			program.developProgram();
		}
	}
}