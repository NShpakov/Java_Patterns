package creational.factory;

public class PhPDeveloperFactory implements DeveloperFactory {
	@Override
	public Developer createDeveloper() {
		return new PhPDeveloper();
	}
}
