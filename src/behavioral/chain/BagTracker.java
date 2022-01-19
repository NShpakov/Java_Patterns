package behavioral.chain;

public class BagTracker {
	public static void main(String[] args) {
		Notifier reportNotifaer = new SimpleReportNotifaer(Priority.ROUTINE);
		Notifier emaiNotifaer = new EmailNotifier(Priority.IMPORTANT);
		Notifier smsNotifaer = new SMSNotifaer(Priority.ASAP);


		reportNotifaer.setNextNotifaer(emaiNotifaer);
		emaiNotifaer.setNextNotifaer(smsNotifaer);

		reportNotifaer.notifyManager("Everithing is OK.", Priority.ROUTINE);
		reportNotifaer.notifyManager("Something went wrong!",Priority.IMPORTANT);
		reportNotifaer.notifyManager("Houston,we've had a problem here!!!",Priority.ASAP);
	}
}
