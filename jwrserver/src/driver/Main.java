package driver;

import java.io.IOException;
import java.net.ServerSocket;

public class Main {
	public static void main(String[] args) {
		try {

			new Server(new ServerSocket(8080)).startServer();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
