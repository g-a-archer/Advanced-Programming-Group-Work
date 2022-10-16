package driver;

import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	private ServerSocket serverSocket;

	public Server(ServerSocket serverSocket) {
		this.serverSocket = serverSocket;
	}

	public void startServer() {

		try {
			System.out.println("Server Has Started");

			while (!serverSocket.isClosed()) {

				Socket socket = serverSocket.accept();

				System.out.println("Client has connected!");

				Handler handler = new Handler(socket);

				new Thread(handler).start();

			}

		} catch (Exception e) {

		}

	}

}