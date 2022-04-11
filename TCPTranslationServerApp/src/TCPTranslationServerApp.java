

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import controller.Dictionary;
import controller.TranslationManager;

public class TCPTranslationServerApp {

	public static void main(String[] args) {

		TranslationManager translationManager = new TranslationManager();
		
		int portNo = 8084;
		
		
		try {
			
			// 1. Bind to port
			ServerSocket serverSocket = new ServerSocket(portNo);
			
			// 2. Listen for request
			while (true) {
				
				System.out.println("Waiting for request");
				
				// 3. Accept request
				Socket clientRequest = serverSocket.accept();
				
				// 4. Get client request
				InputStream is = clientRequest.getInputStream();
				DataInputStream dis = new DataInputStream(is);
				String language = dis.readUTF();
				String sentence = dis.readUTF();
				
				// 5. Further processing
				String translatedSentence = translationManager.getTranslation(language, sentence);
				System.out.println("Translated sentence = " + translatedSentence);
				
				
				// 6. Respond to client
				OutputStream os = clientRequest.getOutputStream();
				DataOutputStream dos = new DataOutputStream(os);
				dos.writeUTF(translatedSentence);
				
				
			}
			
			
			
			
		} catch (Exception ex) {
			
			ex.printStackTrace();
		}
		
		
	}

}

