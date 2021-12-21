package creational.abstract_factory;

public class MainAbstractFactory {
	public static void main(String[] args) {
		PhpDeveloper phPDeveloper = new PhpDeveloper();
		ManualTester manualTester = new ManualTester();
		ProjectManager projectManager = new ProjectManager();

		System.out.println("Creating project...");
		phPDeveloper.writeCode();
		manualTester.testCode();
		projectManager.manageProject();
	}
}
