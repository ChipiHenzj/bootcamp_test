package main.java.org.activity12;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

public class ChatServer implements Runnable {

	// Common structures for all threads:
	static final int port = 9999; // port to listen on
	// server socket, which listens to new connections
	static ServerSocket server;
	// Thread safe list of connections to connected clients
	static Vector<ChatServer> connections;

	// Structures for separate threads:
	// reference to client socket when new connection is accepted
	private Socket client;
	private BufferedReader in; // reader from client socket
	private PrintWriter out; // writer to client socket

	/**
	 * This is entry point to start Chat Server. Note that this method do not
	 * use behavior which is implemented for Runnable interface.
	 * 
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO initialize vector of connections
		// TODO try to create ServerSocket on specified port
		// TODO handle exceptions (show exception and exit with error
		// status)
		
	Vector<ChatServer> connections = new Vector<ChatServer>();
	
	 try {
         ServerSocket server = new ServerSocket(port);
         
         } catch (IOException e) {
         e.printStackTrace();
     }
		
		Socket socket = null;
		Thread t = null;
		while (true) {
			// TODO Try to initialize client Socket in infinite loop with
			// server.accept() method
			// TODO handle exceptions
			// TODO if socket is initialized successfully, create new Thread
			// passing new ChatServer(socket) as a parameter for it.
			// Then invoke start() method for this thread
			Socket client = server.accept();
			Thread thread = new Thread((Runnable) new Socket());
            thread.start();

		}
	}

	/**
	 * This method processes each connected client and writes received messages
	 * to all other clients
	 * 
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		// TODO try to read lines in loop from the input reader of the
		// client and
		// write it to all clients (including current client) in form:
		// "> message"
		// HINT: use connections to traverse all clients and invoke
		// sendMsg(msg)
		// for them
		// If message is "quit" or "exit", break loop
			// TODO handle exceptions
			// TODO close all inputs and outputs of the connection, and
			// remove
			// current object reference from connections collection
				// TODO handle exceptions
	}

	/**
	 * This constructor is used to pass client Socket reference for new thread
	 * 
	 * @param client
	 */
	ChatServer(Socket client) {
		// TODO
		// 1. save passed client socket reference into current object
		// 2. Add newly created ChatServer into connections collection
		// TODO Add input and output streams to the client socket
			// TODO handle exceptions
	}

	/**
	 * This method is used to write message to the all connected clients
	 * 
	 * @param msg
	 */
	public void sendMsg(String msg) {
		// TODO print passed message into output stream with writer of current
		// object
	}
}
