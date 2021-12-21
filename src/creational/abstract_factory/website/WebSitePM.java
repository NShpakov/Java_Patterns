package creational.abstract_factory.website;

import creational.abstract_factory.Manager;

public class WebSitePM implements Manager {
    @Override
    public void manageCode() {
        System.out.println("Website PM manages website project");
    }
}
