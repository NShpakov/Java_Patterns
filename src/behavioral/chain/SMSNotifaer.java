package behavioral.chain;

public class SMSNotifaer extends Notifier {
	public SMSNotifaer(int priority) {
		super(priority);
	}

	@Override
	public void write(String message) {
		System.out.println("Sending SMS to manager:" + message);
	}
}
