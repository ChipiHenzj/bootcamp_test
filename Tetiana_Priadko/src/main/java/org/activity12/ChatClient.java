package main.java.org.activity12;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;

import main.java.org.activity11.ArrayFillerManager;

public class ChatClient implements Runnable {
	private static final int port = 9999; // port to connect to
	private static String host = "localhost"; // host to connect to
	// buffered readers from standard input and server socket stream
	private static BufferedReader stdin, srvin;
	private static PrintWriter srvout; // writer to server socket stream
	private static Socket server; // server socket
	private static Thread t; // thread for server message reader

	public static void main(String[] args) throws Exception {
		// TODO create new socket to the server
		// add buffered reader to standard input
		// add print writer to socket's stream
			
		// TODO Use ChatClient constructor with server socket as a parameter
		// for constructor of a new thread, to asynchronously read messages
		// from the server. Then start this thread.
		 // reference to ChatClient for server message reader
		// thread
	    
	    ChatClient sc;

			
		// TODO read messages from standard input and send them
		// to server socket exit from loop and program, if exit or quit is
		// entered
		

		// TODO handle possible exceptions and exit with error status
		

		// TODO close all data streams
	    
	    int serverPort = 9999; // здесь обязательно нужно указать порт к которому привязывается сервер.
        String address = "127.0.0.1"; // это IP-адрес компьютера, где исполняется наша серверная программа. 
                                      // Здесь указан адрес того самого компьютера где будет исполняться и клиент.

        try {
            InetAddress ipAddress = InetAddress.getByName(address); // создаем объект который отображает вышеописанный IP-адрес.
            System.out.println("Any of you heard of a socket with IP address " + address + " and port " + serverPort + "?");
            Socket socket = new Socket(ipAddress, serverPort); // создаем сокет используя IP-адрес и порт сервера.
            System.out.println("Yes! I just got hold of the program.");

            // Берем входной и выходной потоки сокета, теперь можем получать и отсылать данные клиентом. 
            InputStream sin = socket.getInputStream();
            OutputStream sout = socket.getOutputStream();

            // Конвертируем потоки в другой тип, чтоб легче обрабатывать текстовые сообщения.
            DataInputStream in = new DataInputStream(sin);
            DataOutputStream out = new DataOutputStream(sout);

            // Создаем поток для чтения с клавиатуры.
            BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
            String line = null;
            System.out.println("Type in something and press enter. Will send it to the server and tell ya what it thinks.");
            System.out.println();

            while (true) {
                line = keyboard.readLine(); // ждем пока пользователь введет что-то и нажмет кнопку Enter.
                System.out.println("Sending this line to the server...");
                out.writeUTF(line); // отсылаем введенную строку текста серверу.
                out.flush(); // заставляем поток закончить передачу данных.
                line = in.readUTF(); // ждем пока сервер отошлет строку текста.
                System.out.println("The server was very polite. It sent me this : " + line);
                System.out.println("Looks like the server is pleased with us. Go ahead and enter more lines.");
                System.out.println();
            }
        } catch (Exception x) {
            x.printStackTrace();
        }
	}

	@Override
	public void run() {
		// TODO read messages in the loop sent from server socket
		// in this thread
		
		
		// TODO handle exceptions
		
		
	}

	public ChatClient(Socket server) {
		// TODO try to create buffered reader to passed server socket
		
		
		// TODO handle exceptions
		
		
	}

}
