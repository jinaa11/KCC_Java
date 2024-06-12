package kosa.net1;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExam {

	public static void main(String[] args) {
		ServerSocket serverSocket = null; 
		Socket socket = null; // Ŭ���̾�Ʈ ����
		
		try {
			serverSocket = new ServerSocket(9000); // ���� ���� ����
			System.out.println("���� ���� ��.......");
			
			socket = serverSocket.accept(); // ��� ���� ��û�� Ŭ���̾�Ʈ ����
			
			InputStream in = socket.getInputStream(); // ������ ���ſ� ����� ��Ʈ��
			OutputStream out = socket.getOutputStream(); // ������ �۽ſ� ����� ��Ʈ��
			
			byte arr[] = new byte[100];
			in.read(arr);
			
			System.out.println("Ŭ���̾�Ʈ���� ���� �޽���: " + new String(arr));
			
			String message = "Hello Client!!!";
			out.write(message.getBytes()); // String�� Byte �迭�� ��ȯ => ���Ͽ��� ������ ����
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				socket.close();
				serverSocket.close();
			} catch (Exception e2) {}
		}
	}

}
