package by.bsuir.graduationproject.core; /**
 * @author l.zverugo
 */
import by.bsuir.rts.graduationproject.gui.util.GUIConstants;

import javax.swing.*;
import java.io.*;
import java.net.*;

public final class TCPClientLogic {
    private TCPClientLogic() {
    }

    public static String run(String message) throws IOException {
        Socket clientSocket = null;
        try {
            clientSocket = new Socket("localhost", 6789);
        } catch (ConnectException e) {
            JOptionPane.showMessageDialog(null, GUIConstants.CONNECTION_REFUSED_ERROR_MESSAGE);
        }
        DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());
        BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        outToServer.writeBytes(message + '\n');
        String modifiedMessage = inFromServer.readLine();
        clientSocket.close();
        return modifiedMessage;
    }
}