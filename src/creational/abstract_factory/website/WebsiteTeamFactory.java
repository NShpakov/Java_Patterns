package creational.abstract_factory.website;

import creational.abstract_factory.Developer;
import creational.abstract_factory.Manager;
import creational.abstract_factory.ProjectTeamFactory;
import creational.abstract_factory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public Manager getProjectManager() {
        return new WebSitePM();
    }
}
