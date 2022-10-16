package driver;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Handler implements Runnable {

	private Socket socket;
	private ObjectOutputStream objOut;
	private ObjectInputStream objIn;

	public Handler(Socket socket) {

		try {
			this.socket = socket;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {

	}

}
