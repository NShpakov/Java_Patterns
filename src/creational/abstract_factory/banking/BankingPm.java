package creational.abstract_factory.banking;

import creational.abstract_factory.Manager;

public class BankingPm implements Manager {
	@Override
	public void manageCode() {
		System.out.println("Manager manages project");
	}
}