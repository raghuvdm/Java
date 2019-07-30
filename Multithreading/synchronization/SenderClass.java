package synchronization;

public class SenderClass {
	public void send(String msg) {
		synchronized (this) {
			System.out.println("Sending\t" + msg);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println("Thread Interrupted...");
			}
			System.out.println("\n" + msg + "Sent");
		}// synchronized block
	}// send()
}// Sender:- Class
