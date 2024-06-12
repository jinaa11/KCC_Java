package kosa.net1;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExam {

	public static void main(String[] args) {
		ServerSocket serverSocket = null; 
		Socket socket = null; // 클라이언트 소켓
		
		try {
			serverSocket = new ServerSocket(9000); // 서버 소켓 생성
			System.out.println("서버 실행 중.......");
			
			socket = serverSocket.accept(); // 방금 전에 요청한 클라이언트 소켓
			
			InputStream in = socket.getInputStream(); // 데이터 수신에 사용할 스트림
			OutputStream out = socket.getOutputStream(); // 데이터 송신에 사용할 스트림
			
			byte arr[] = new byte[100];
			in.read(arr);
			
			System.out.println("클라이언트에서 보낸 메시지: " + new String(arr));
			
			String message = "Hello Client!!!";
			out.write(message.getBytes()); // String을 Byte 배열로 변환 => 소켓에게 데이터 전달
			
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
