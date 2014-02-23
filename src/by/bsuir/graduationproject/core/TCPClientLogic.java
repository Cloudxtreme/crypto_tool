package by.bsuir.graduationproject.core; /**
 * @author l.zverugo
 */
import by.bsuir.graduationproject.gui.util.ClientConstants;
import by.bsuir.graduationproject.gui.util.GUIConstants;

import javax.swing.*;
import java.io.*;
import java.net.*;
import java.util.Properties;

public final class TCPClientLogic {
    private TCPClientLogic() {
    }

    public static String run(String message) throws IOException {
        Socket clientSocket = null;
        try {
            clientSocket = new Socket(getServerIpAddress(), 1234);
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

    private static String getServerIpAddress() throws IOException {
        Properties properties = new Properties();
        InputStream inputStream = new FileInputStream(ClientConstants.APPLICATION_PROPERTIES_PATH);
        properties.load(inputStream);
        return (String) properties.get(ClientConstants.SERVER_IP_ADDRESS_PROPERTY);
    }
}