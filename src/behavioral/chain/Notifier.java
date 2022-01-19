package behavioral.chain;

public abstract class Notifier {
	private int priority;
	private Notifier nextNotifaer;

	public Notifier(int priority) {
		this.priority = priority;
	}

	public void setNextNotifaer(Notifier nextNotifaer) {
		this.nextNotifaer = nextNotifaer;
	}

	public void notifyManager(String message, int level) {
		if (level >= priority) {
			write(message);
		}
		if (nextNotifaer != null) {
			nextNotifaer.notifyManager(message, level);
		}
	}

	public abstract void write(String message);
}
