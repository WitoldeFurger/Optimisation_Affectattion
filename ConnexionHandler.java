import java.io.BufferedReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ConnexionHandler {
    //Attributs:
    Socket Client;
    BufferedReader in;
    PrintWriter out;
    String login;

    //Get and Set
    public void setClient(Socket client) {
        Client = client;
    }
    public Socket getClient() {
        return Client;
    }
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }

    //Methodes:
    
}
