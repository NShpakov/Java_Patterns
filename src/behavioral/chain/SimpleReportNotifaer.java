package behavioral.chain;

public class SimpleReportNotifaer extends Notifier {
	public SimpleReportNotifaer(int priority) {
		super(priority);
	}

	@Override
	public void write(String message) {
		System.out.println("Notifying using simple report" + message);
	}
}
