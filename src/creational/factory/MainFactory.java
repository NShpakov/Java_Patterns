package creational.factory;

public class MainFactory {
	public static void main(String[] args) {
		DeveloperFactory developerFactory = createDeveloperBySpecialty("php");
		Developer developer = developerFactory.createDeveloper();
		developer.writeCode();
	}

	static DeveloperFactory createDeveloperBySpecialty(String specialty) {
		if (specialty.equalsIgnoreCase("java")) {
			return new JavaDeveloperFactory();
		} else if (specialty.equalsIgnoreCase("c++")) {
			return new CppDeveloperFactory();
		} else if (specialty.equalsIgnoreCase("php")) {
			return new PhPDeveloperFactory();
		}
		throw new RuntimeException(specialty + " is not allowed !!!");
	}
}
