import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

class Serwer{
    private DatagramSocket datagramSocket;
    private byte[] buffer = new byte[1024];

    public Serwer(DatagramSocket ds){
        this.datagramSocket = ds;
    }

    public void otrzymajPozniejWyslij(){
    while(true){
        try{
            DatagramPacket datagramPacket = new DatagramPacket(buffer, buffer.length);
            datagramSocket.receive(datagramPacket);

            InetAddress inetAddress = datagramPacket.getAddress();
            int port = datagramPacket.getPort();

            String wiadomosc = new String(datagramPacket.getData(), 0 , datagramPacket.getLength());
            System.out.println("wiadomosc od klienta" + wiadomosc);

            datagramPacket = new DatagramPacket(buffer, buffer.length, inetAddress, port);
            datagramSocket.send(datagramPacket);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    }
}




public class Main{
    public static void main(String[] args) throws SocketException{

        DatagramSocket ds = new DatagramSocket(1234);
        Serwer serwer = new Serwer(ds);
        serwer.otrzymajPozniejWyslij();
    }
}
