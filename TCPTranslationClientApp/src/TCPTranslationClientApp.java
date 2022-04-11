import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class TCPTranslationClientApp {

	public static void main(String[] args) {
		
		
		try {
			
			System.out.println ("Executing TCPTranslationClientApp");
			
			// Server information
			int portNo = 8084;
			InetAddress serverAddress = InetAddress.getLocalHost();
			
			// Connect to server
			Socket socket = new Socket(serverAddress, portNo);
			
			// Send sentence to server
			String sentence = "How are you?";
			String language ="my";
			
	
			
			OutputStream os = socket.getOutputStream();
			DataOutputStream dos = new DataOutputStream(os);
			dos.writeUTF(language);
			dos.writeUTF(sentence);
			
			// Receive translated sentence from the server
			InputStream is = socket.getInputStream();
			DataInputStream dis = new DataInputStream(is);
			String translatedSentence = dis.readUTF();
			
			System.out.println("En: " + sentence);
			System.out.println("My: " + translatedSentence);
			
			
			
		} catch (Exception ex) {
			
			ex.printStackTrace();
		}

	}

}
