package creational.abstract_factory;

public interface ProjectTeamFactory {
	Developer getDeveloper();

	Tester getTester();

	Manager getProjectManager();
}
