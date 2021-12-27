package creational.builder;

public class EnterPriseWebSiteBuilder extends WebSiteBuilder {
	@Override
	void buildName() {
		webSite.setName("EnterPrise web site");
	}

	@Override
	void buildCms() {
		webSite.setCms(Cms.ALIFRESCO);
	}

	@Override
	void buildPrice() {
		webSite.setPrice(10000);
	}
}
