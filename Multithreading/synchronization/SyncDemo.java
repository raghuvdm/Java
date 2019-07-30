package synchronization;

//Sender class used to send a message:-
class Sender {
	public void send(String msg) {
		System.out.println("Sending\t" + msg);
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println("Thread Interrupted...");
		}
		System.out.println("\n" + msg + "Sent");
	}// send()
}// Sender class

class ThreadSend extends Thread {
	private String msg;
	private Thread t;
	Sender sender;

	// Constructor:-
	public ThreadSend(String msg, Sender obj) {
		this.msg = msg;
		this.sender = obj;
	}

	// run():-
	public void run() {
		// Only one thread can send a message at a time.
		synchronized (sender) {
			// synchronizing the snd object
			sender.send(msg);
		}
	}// run()

}// ThreadSend class

// Driver class Demo Program:-
public class SyncDemo {
	public static void main(String[] args) {
		Sender snd = new Sender();
		ThreadSend s1 = new ThreadSend(" Hi ", snd);
		ThreadSend s2 = new ThreadSend(" Bye ", snd);

		// start two threads of ThreadSendType:-
		s1.start();
		s2.start();

		// wait for threads to end:-
		try {
			s1.join();
			s2.join();
		} catch (Exception e) {
			System.out.println("Interrupted...");
		}

	}// main()
}// main class
